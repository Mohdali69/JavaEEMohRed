<%-- 
    Document   : menu.jsp
    Created on : 14 janv. 2019, 08:41:32
    Author     : Admin
--%>
<%@page import="metier.Utilisateur"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
            <nav class="navbar navbar-expand-lg navbar-dark  mb-4">
                <a class="navbar-brand" href="#">Tige-Time</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Accueil <span class="sr-only"></span></a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="#">Les Classiques</a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="#">Mon Comtpte</a>
                        </li>
                        
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown 
                                </a>
                            <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                                <a class="dropdown-item" href="#">J'adore</a>
                                <a class="dropdown-item" href="#">Laisser un commentaire</a>
                                <a class="dropdown-item" href="#">Deconnexion</a>
                            </div>
                        </li>
                        
                    </ul>
                    <span><% 
           Utilisateur us =(Utilisateur) session.getAttribute("currentUser");
           if((Boolean)session.getAttribute("log")==true){
               out.println("Bienvenue "+us.getUser());
           }
           else{
               out.println("ERROR : WRONG IDS");
           }
           
%></span>
                    
                </div>
            </nav>
</div>            
            <!--/.Navbar blue-->
