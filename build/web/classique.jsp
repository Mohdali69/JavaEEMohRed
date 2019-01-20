<%-- 
    Document   : login
    Created on : 7 janv. 2019, 09:15:38
    Author     : Admin
--%>

<%@page import="metier.Ingredients"%>
<%@page import="metier.Cigarette"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="database.DAO.OracleUtilisateurDAO"%>
<%@page import="database.DAO.OracleDataSourceDAO"%>
<%@page import="metier.Utilisateur"%>

<!DOCTYPE html>
<html id="LoginForm">
    <head>
        <title>Accueil</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="./assets/style.css" rel="stylesheet">
        <link href="./assets/home.css" rel="stylesheet">
        <link href="./assets/menu.css" rel="stylesheet">
        <link href="./assets/classique.css" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        

<!------ Include the above in your HEAD tag ---------->

<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css' />
    </head>
    <body  >


<%@include  file="./menu.jsp" %>

   <img src="./assets/images/pubKhapta.gif" class="pubG"/>
   <img src="./assets/images/pub2.gif" class="pubD"/>
   <div class="container">
       
       <%
           List<Cigarette> liste =(List<Cigarette>) session.getAttribute("listeCig");
           
           List<Ingredients> listeIng =(List<Ingredients>) session.getAttribute("listeIng");
           
          for(Cigarette cig : liste){ // boucle qui affiche tous les objets Cigarette (le décrément de 1 par rapport aux indice est du au commencement des item dans la BD a 1
              
      out.println("<div class='card'><div class='box'><div class='img'><img src='./assets/images/cig1.jpg'>"+
        "</div><h2>"+cig.getNom()+"<br><span>"+cig.getCommentaire()+"</span></h2><p> "+listeIng.get(cig.getIngredient1()-1).getNom()+", "+listeIng.get(cig.getIngredient2()-1).getNom()+", "+listeIng.get(cig.getIngredient3()-1).getNom()+", "+
        ""+listeIng.get(cig.getIngredient4()-1).getNom()+", "+listeIng.get(cig.getIngredient5()-1).getNom()+", "+listeIng.get(cig.getIngredient6()-1).getNom()+".</p><span><ul>"+
            "<li><a href='#'><i class='fa fa-facebook' aria-hidden='true'></i></a></li>"+
            "<li><a href='#'><i class='fa fa-twitter' aria-hidden='true'></i></a></li>"+
            "<li><a href='#'><i class='fa fa-google-plus' aria-hidden='true'></i></a></li>"+
            "<li><a href='#'><i class='fa fa-linkedin' aria-hidden='true'></i></a></li>"+
            "<li><a href='#'><i class='fa fa-instagram' aria-hidden='true'></i></a></li>"+
            "</ul></span></div></div>");
          }
       %>
       
   </div>
    
 




</body>
</html>
