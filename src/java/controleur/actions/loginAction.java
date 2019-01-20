/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur.actions;

import database.DAO.OracleDataSourceDAO;
import database.DAO.OracleUtilisateurDAO;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import metier.Utilisateur;

/**
 *
 * @author Admin
 */
public class loginAction extends Action{

    @Override
    public String execute(HttpServletRequest request) {
        try {
            String user = request.getParameter("inputEmail");
            String pass = request.getParameter("inputPassword"); //recuperation des saisies utilisateur
            
            Utilisateur current = new Utilisateur(user,pass,"",120);
            request.getSession().setAttribute("currentUser", current); // creation  de l'objet utlisiateur + passage de parametre
            
            OracleDataSourceDAO ods = OracleDataSourceDAO.getOracleDataSourceDAO();
            OracleUtilisateurDAO OUD = new OracleUtilisateurDAO();
            OUD.setDataSource(ods);
            OUD.setConnection(ods.getConnection());
            
            
            List<Utilisateur> liste = new ArrayList<>();
            liste = OUD.getUsers(); //recuperation de tous les users de la BDD
            for(Utilisateur us : liste){ // boucle qui compare les données saisie avec la BDD
                if(us.getUser().equals(user)){
                    if(us.getPassword().equals(pass)){
                        
                        request.getSession().setAttribute("log", true);
                        return ("login.jsp"); // arrete la fonction si trouve une correspondance
                    }
                }
            }} catch (SQLException ex) {
            Logger.getLogger(loginAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(loginAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getSession().setAttribute("log", false); //si rien trouvé, renvoi false et retourne a la page index.html
        return ("index.html");
    }
    
}
