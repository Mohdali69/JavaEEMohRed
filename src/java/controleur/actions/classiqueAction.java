/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur.actions;

import database.DAO.OracleCigaretteDAO;
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
import metier.Cigarette;
import metier.Ingredients;
import metier.Utilisateur;

/**
 *
 * @author Admin
 */
public class classiqueAction extends Action{

    @Override
    public String execute(HttpServletRequest request) {
        try {
            OracleDataSourceDAO ods = OracleDataSourceDAO.getOracleDataSourceDAO(); // Initialisation de la connexion 
            OracleCigaretteDAO OCD = new OracleCigaretteDAO();
            OCD.setDataSource(ods);
            OCD.setConnection(ods.getConnection());
            OracleIngredientsDAO OAD = new OracleIngredientsDAO();
            OAD.setConnection(ods.getConnection());
            
            List<Cigarette> Lcig = OCD.getCigarette(); // recuperation de toutes le cigarettes de la base de donnée 
            request.getSession().setAttribute("listeCig", Lcig); // passage de parametre pour affihcage
            
            List<Ingredients> Ling = OAD.getIngredients(); // idem avec les ingrédients, pour les afficher en fct de leurs identifiant
            request.getSession().setAttribute("listeIng", Ling);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(classiqueAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(classiqueAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ("classique.jsp");
    }
    
}
