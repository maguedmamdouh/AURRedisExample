/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aurredis;

import com.mycompany.aurredis.business.BusinessLayer;
import com.mycompany.aurredis.dao.AURDao;
import com.mycompany.aurredis.entity.PagesConfiguration;
import com.mycompany.aurredis.redis.RedisConnection;
import io.lettuce.core.api.StatefulRedisConnection;
import java.util.List;

/**
 *
 * @author MagedMamdouh
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        RedisConnection redisConn = new RedisConnection();
        StatefulRedisConnection redisConnection = redisConn.getRedisConnection();
        BusinessLayer bLayer = new BusinessLayer(redisConnection.async());
        
        System.out.println(bLayer.getRecordsFromRedis(104, 533));
        
    }
    
}
