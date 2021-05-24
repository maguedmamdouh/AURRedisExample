/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aurredis.dao;

import static java.lang.Math.log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MagedMamdouh
 */
public class DBConnection {
    
    public Connection getConnectionOracle() {
            
        try {
            String username = "AUR";
            String password = "AUR";
            String thinConn = "jdbc:oracle:thin:@10.3.1.101:1531:eplus";
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(thinConn, username, password);
            conn.setAutoCommit(true);
            return conn;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
