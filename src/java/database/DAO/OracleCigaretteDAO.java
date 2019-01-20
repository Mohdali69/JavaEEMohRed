/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.DAO;

import database.Ipackage.ICigaretteDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    static Connection connexionBD;
    
    @Override
    public void setDataSource(DataSource ds){
        OracleCigaretteDAO.ds = ds; 
    }
    
    @Override
    public void setConnection (Connection c) {
        OracleCigaretteDAO.connexionBD = c;
    }
   
    
    @Override 
    public List<Cigarette> getCigarette() { // retourne toutres les cigarette de laBDD
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
    @Override
    public void supprimerCigarette(Cigarette Cigarette) { // supprime une cigarette
         PreparedStatement state = null;
        try{
            state=OracleCigaretteDAO.connexionBD.prepareStatement("DELETE FROM Cigarette WHERE id = ?");
            state.setInt(1,Cigarette.getId());
            state.execute();
            state.close();
        }catch(SQLException ex){
           Logger.getLogger(OracleCigaretteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void creerCigarette(Cigarette Cigarette) { //ajoute une cigarette 
        PreparedStatement state = null;
        try{
            state=OracleCigaretteDAO.connexionBD.prepareStatement("INSERT INTO Cigarette (nom,id,ingredient1,prix,ingredient2,ingredient3,ingredient4,ingredient5,ingredient6,commentaire) VALUES (?,?,?,?,?,?,?,?,?,?)");
            state.setString(1,Cigarette.getNom());
            state.setInt(2,Cigarette.getId());
            state.setInt(3,Cigarette.getIngredient1());
            state.setInt(4, Cigarette.getPrix());
            state.setInt(5,Cigarette.getIngredient2());
            state.setInt(6,Cigarette.getIngredient3());
            state.setInt(7,Cigarette.getIngredient4());
            state.setInt(8,Cigarette.getIngredient5());
            state.setInt(9,Cigarette.getIngredient6());
            state.setString(10,Cigarette.getCommentaire());
            state.execute();
            state.close();
        }catch(SQLException ex){
           Logger.getLogger(OracleCigaretteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
