/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur.actions;

import database.DAO.OracleDataSourceDAO;
import database.DAO.OracleIngredientsDAO;
import database.DAO.OracleUtilisateurDAO;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import metier.Ingredients;
import metier.Utilisateur;

/**
 *
 * @author Admin
 */
public class creationAction extends Action{

    @Override
    public String execute(HttpServletRequest request) {

        try {
            OracleDataSourceDAO ods;
            List<Ingredients> LIngre = new ArrayList();
            OracleIngredientsDAO ingre;
            ingre = new OracleIngredientsDAO();
            ods = OracleDataSourceDAO.getOracleDataSourceDAO();// Creation du Data Source Oracle
            ingre.setDataSource(ods);//Initialisation du Data Source
            ingre.setConnection(ods.getConnection());//
            
            LIngre=ingre.getIngredients();
            request.getSession().setAttribute("Liste",LIngre);
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(creationAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(creationAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ("creation.jsp");
    }
    
}
