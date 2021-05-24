/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aurredis.dao;

import com.mycompany.aurredis.constants.Queries;
import com.mycompany.aurredis.entity.PagesConfiguration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MagedMamdouh
 */
public class AURDao {
    
    public List<PagesConfiguration> getAllPagesConfig(){
        
        List<PagesConfiguration> pagesList = new ArrayList<>();
        
        try {
            DBConnection db = new DBConnection();
            Connection conn = db.getConnectionOracle();
            PreparedStatement st = conn.prepareStatement(Queries.PAGES_QUERY);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                PagesConfiguration pg = new PagesConfiguration();
                pg.setRoleId(rs.getInt("ROLE_ID"));
                pg.setPageId(rs.getInt("PAGE_ID"));
                pg.setFuncMode(rs.getString("FUNC_MODE"));
                pg.setLangCode(rs.getString("LANG_CODE"));
                pg.setControlId(rs.getInt("CONTROL_ID"));
                pg.setComponentId(rs.getInt("COMPONENT_ID"));
                pg.setVisibleProp(rs.getInt("VISIBLE_PROP"));
                pg.setEnableProp(rs.getInt("ENABLE_PROP"));
                pg.setMandatoryProp(rs.getInt("MANDATORY_PROP"));
                pg.setConcealProp(rs.getInt("CONCEAL_PROP"));
                pg.setControlName(rs.getString("CONTROL_NAME"));
                pg.setLabelDescr(rs.getString("LABEL_DESCR"));
                pg.setTooltipDescr(rs.getString("TOOLTIP_DESCR"));
                pg.setDataType(rs.getString("DATA_TYPE"));
                pg.setControlPk(rs.getString("CONTROL_PK"));
                pg.setFormatMask(rs.getString("FORMAT_MASK"));
                pg.setLength(rs.getString("LENGTH"));
                pg.setMinValue(rs.getString("MIN_VALUE"));
                pg.setMaxValue(rs.getString("MAX_VALUE"));
                pg.setLocal(rs.getString("LOCAL"));
                pg.setJustification(rs.getString("JUSTIFICATION"));
                pg.setControlType(rs.getString("CONTROL_TYPE"));
                pagesList.add(pg);
            }
            
            rs.close();
            st.close();
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AURDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pagesList;
        
    }
    
}
