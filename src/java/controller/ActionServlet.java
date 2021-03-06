/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controleur.actions.Action;
import controleur.actions.ajoutAction;
import controleur.actions.classiqueAction;
import controleur.actions.creationAction;
import controleur.actions.loginAction;
import database.DAO.OracleDataSourceDAO;
import database.DAO.OracleUtilisateurDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.Utilisateur;

/**
 *
 * @author Admin
 */
public class ActionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        RequestDispatcher rd = null;
        String todo = request.getParameter("todo");
        Action action = null ;
        String vue = "index.html";
        
        switch (todo){
            case "login" : 
                
                action = new loginAction();
                vue = action.execute(request); 
                break;
                
            case "accueil" :
                
                vue = "login.jsp";
                break;
            
            case "creation" : 
                
                action = new creationAction();
                vue = action.execute(request);
                break;
                
            case "classique" : 
                
                action = new classiqueAction();
                vue = action.execute(request); 
                break;
            case "ajout" : 
                
                action = new ajoutAction();
                vue = action.execute(request); 
                break;   
        }
        
        rd = request.getRequestDispatcher(vue);
        rd.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
