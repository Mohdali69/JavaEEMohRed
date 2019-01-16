/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.DAO;

import database.Ipackage.ICigaretteDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import metier.Cigarette;

/**
 *
 * @author Asus
 */
public class OracleCigaretteDAO implements ICigaretteDAO {
    private static DataSource ds; 
    private static Connection connexionBD;
    
    @Override
    public void setDataSource(DataSource ds){
        OracleCigaretteDAO.ds = ds; 
    }
    
    @Override
    public void setConnection (Connection c) {
        OracleCigaretteDAO.connexionBD = c;
    }
   
    
    @Override 
    public List<Cigarette> getCigarette() {
        ResultSet rset = null; 
        Statement stmt = null;
        List<Cigarette> listeUser = null; 
        try {
              stmt= connexionBD.createStatement();
              listeUser = new ArrayList<>();
              rset = stmt.executeQuery("SELECT * from Cigarette");
              while(rset.next()){
                Cigarette newM = new Cigarette(rset.getString("nom"), rset.getInt("id"),rset.getInt("ingredient1"),rset.getInt("prix"),rset.getInt("ingredient2"),rset.getInt("ingredient3"),rset.getInt("ingredient4"),rset.getInt("ingredient5"),rset.getInt("ingredient6"),rset.getString("commentaire"));
                listeUser.add(newM);
            }
            }catch(SQLException ex){
             Logger.getLogger(OracleUtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
              
        
        return listeUser ;
        
        
        
    }    
}
