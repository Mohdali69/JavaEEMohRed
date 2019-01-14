/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.DAO;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mohamed
 */
public class OracleDataSourceDAO extends MysqlDataSource {
    
    public static OracleDataSourceDAO ods;
    
    private OracleDataSourceDAO () throws SQLException  {
    }
    
    public static OracleDataSourceDAO getOracleDataSourceDAO() throws FileNotFoundException{
       FileInputStream fichier = null; 
       
        try{
            
       Properties props = new Properties();

            ods = new OracleDataSourceDAO();
            
            ods.setPortNumber(3306);
            
            ods.setUser("p1700102");
            ods.setPassword("294150");
            ods.setDatabaseName("p1700102");
            ods.setServerName("iutdoua-web.univ-lyon1.fr");
  
        }catch (Exception ex) {
            Logger.getLogger(OracleDataSourceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ods;
       
      
    
    }
    
}

