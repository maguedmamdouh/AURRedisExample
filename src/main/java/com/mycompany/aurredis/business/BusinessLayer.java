/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aurredis.business;

import com.mycompany.aurredis.constants.Redis;
import com.mycompany.aurredis.dao.AURDao;
import com.mycompany.aurredis.entity.PagesConfiguration;
import io.lettuce.core.RedisFuture;
import io.lettuce.core.api.async.RedisAsyncCommands;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author MagedMamdouh
 */
public class BusinessLayer {
    
    private RedisAsyncCommands<String, String> asyncCommands;

    public BusinessLayer(RedisAsyncCommands<String, String> asyncCommands) {
        this.asyncCommands = asyncCommands;
    }
    
    public void refreshCashedData(){
        AURDao aurDao = new AURDao();
        List<PagesConfiguration> pages = aurDao.getAllPagesConfig();
        addRecordsToRedis(pages);
    }
    
    public void addRecordsToRedis(List<PagesConfiguration> pagesList){
        asyncCommands.del(Redis.PAGES_TOPIC);
        ObjectMapper mapper = new ObjectMapper();
        for (PagesConfiguration page : pagesList) {
            try {
                String key = page.getRoleId() + ":" + page.getPageId() + ":" + page.getControlId();
                String jsonInString = mapper.writeValueAsString(page);
                asyncCommands.hset(Redis.PAGES_TOPIC, key, jsonInString);
            } catch (IOException ex) {
                Logger.getLogger(BusinessLayer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public List<PagesConfiguration> getRecordsFromRedis(int roleID, int pageID){
        try {
            if (asyncCommands.hlen(Redis.PAGES_TOPIC).get() == 0) {
                refreshCashedData();
            }
            List<PagesConfiguration> pagesList = new ArrayList<>();
            ObjectMapper mapper = new ObjectMapper();
            for (int i = 0; i < 20; i++) {
                String key = roleID + ":" + pageID + ":" + i;
                RedisFuture<String> hget = asyncCommands.hget(Redis.PAGES_TOPIC, key);
                if (hget.get() != null) {
                    pagesList.add(mapper.readValue(hget.get(), PagesConfiguration.class));
                }
            }
            return pagesList;
        } catch (InterruptedException | ExecutionException | IOException ex) {
            Logger.getLogger(BusinessLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
