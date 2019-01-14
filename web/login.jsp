<%-- 
    Document   : login
    Created on : 7 janv. 2019, 09:15:38
    Author     : Admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="database.DAO.OracleUtilisateurDAO"%>
<%@page import="database.DAO.OracleDataSourceDAO"%>
<%@page import="metier.Utilisateur"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="./assets/style.css" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body id="LoginForm">
<div class="container">

<div class="login-form">
<div class="main-div">
    <div class="panel">
        <p>Bienvenue sur Tige-Time</p>
     
       <h2> <% 
           Utilisateur us =(Utilisateur) session.getAttribute("currentUser");
           if((boolean)session.getAttribute("log")==true){
               out.println("Bienvenue "+us.getUser());
           }
           else{
               out.println("ERROR : WRONG IDS");
           }
           
           %></h2>
   </div>
    
    </div>

</div></div>


</body>
</html>
