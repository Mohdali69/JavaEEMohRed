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
public class ajoutAction extends Action{
    static int i=0;
    int r=0;
    int prix =0;
    @Override
    public String execute(HttpServletRequest request) {

        try {
            
            
            OracleDataSourceDAO ods;
            List<Ingredients> LIngre = new ArrayList();
            OracleIngredientsDAO ingre;
            OracleCigaretteDAO cig;
            ingre = new OracleIngredientsDAO();
            cig= new OracleCigaretteDAO();
            ods = OracleDataSourceDAO.getOracleDataSourceDAO();// Creation du Data Source Oracle
            ingre.setDataSource(ods);//Initialisation du Data Source
            ingre.setConnection(ods.getConnection());//setting de la connexion 
            cig.setDataSource(ods);
            cig.setConnection(ods.getConnection());
            List<Cigarette> Lcig = cig.getCigarette(); // recuperation de toutes les cigarettes de la base
            LIngre=ingre.getIngredients(); // recuperation de tous les ingrédients
            request.getSession().setAttribute("Liste",LIngre); //passage de parametre pour ingredients
            
           
            if(request.getParameter("nom").equals("")){ //gestion d'erreur
                request.getSession().setAttribute("erreur", "Le champ nom doit etre rempli !");
                return("ajout.jsp");
            }
            String nom = request.getParameter("nom");
            String comm = request.getParameter("commentaire");
            
            Cigarette clope;
            clope = new Cigarette(nom,Lcig.size(),Integer.parseInt(request.getParameter("ingredient1")),prix,Integer.parseInt(request.getParameter("ingredient2")),Integer.parseInt(request.getParameter("ingredient3")),Integer.parseInt(request.getParameter("ingredient4")),Integer.parseInt(request.getParameter("ingredient5")),Integer.parseInt(request.getParameter("ingredient6")),comm);
            cig.creerCigarette(clope); // ajout de l'objet cigarette a la base de donnée
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ajoutAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ajoutAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ("ajout.jsp");
    }
    
}
