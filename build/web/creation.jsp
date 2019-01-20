<%-- 
    Document   : login
    Created on : 7 janv. 2019, 09:15:38
    Author     : Admin
--%>

<%@page import="metier.Ingredients"%>
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
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    </head>
    <body  >


<%@include  file="./menu.jsp" %>

   <img src="./assets/images/pubKhapta.gif" class="pubG"/>
   <img src="./assets/images/pub2.gif" class="pubD"/>
   <div class="container">
    <%! List<Ingredients> Lingre = new ArrayList(); // initialisation en global de la liste d'ingrédients
    %>
       <form method="POST" action="actionServlet?todo=ajout">
  <div class="form-group">
    <label for="exampleFormControlInput1">Nom de la Tige</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Une Tige" name="nom">
  </div>
    <div class="form-group">
    <label for="exampleFormControlSelect2">Ingredient n°1</label>
    <select  class="form-control" id="exampleFormControlSelect2" name="ingredient1">
               <option value="150">Rien</option>
        <%  
          Lingre = (ArrayList) session.getAttribute("Liste"); // remplissage du dropdown en fonction de la liste 
           for(int j=0;j<Lingre.size();j++){
             out.println("<option value="+Lingre.get(j).getId()+">"+Lingre.get(j).getNom()+"</option>");
            }
                            
       %>

    </select>
  </div>
    <div class="form-group">
    <label for="exampleFormControlSelect2">Ingredient n°2</label>
    <select class="form-control" id="exampleFormControlSelect2" name="ingredient2">
               <option value="150">Rien</option>
        <%  
          Lingre = (ArrayList) session.getAttribute("Liste"); // remplissage du dropdown en fonction de la liste 
           for(int j=0;j<Lingre.size();j++){
             out.println("<option value="+Lingre.get(j).getId()+">"+Lingre.get(j).getNom()+"</option>");
            }
                            
       %>
    </select>
  </div>
    <div class="form-group">
    <label for="exampleFormControlSelect2">Ingredient n°3</label>
    <select class="form-control" id="exampleFormControlSelect2" name="ingredient3">
               <option value="150">Rien</option>
        <%  
          Lingre = (ArrayList) session.getAttribute("Liste"); // remplissage du dropdown en fonction de la liste 
           for(int j=0;j<Lingre.size();j++){
             out.println("<option value="+Lingre.get(j).getId()+">"+Lingre.get(j).getNom()+"</option>");
            }
                            
       %>
    </select>
  </div>
    <div class="form-group">
    <label for="exampleFormControlSelect2">Ingredient n°4</label>
    <select class="form-control" id="exampleFormControlSelect2" name="ingredient4">
               <option value="150">Rien</option>
        <%  
          Lingre = (ArrayList) session.getAttribute("Liste"); // remplissage du dropdown en fonction de la liste 
           for(int j=0;j<Lingre.size();j++){
             out.println("<option value="+Lingre.get(j).getId()+">"+Lingre.get(j).getNom()+"</option>");
            }
                            
       %>
    </select>
  </div>
    <div class="form-group">
    <label for="exampleFormControlSelect2">Ingredient n°5</label>
    <select class="form-control" id="exampleFormControlSelect2" name="ingredient5">
               <option value="150">Rien</option>
        <%  
          Lingre = (ArrayList) session.getAttribute("Liste"); // remplissage du dropdown en fonction de la liste 
           for(int j=0;j<Lingre.size();j++){
             out.println("<option value="+Lingre.get(j).getId()+">"+Lingre.get(j).getNom()+"</option>");
            }
                            
       %>
    </select>
  </div>
    <div class="form-group">
    <label for="exampleFormControlSelect2">Ingredient n°6</label>
    <select class="form-control" id="exampleFormControlSelect2" name="ingredient6">
               <option value="150">Rien</option>
        <%  
          Lingre = (ArrayList) session.getAttribute("Liste"); // remplissage du dropdown en fonction de la liste 
           for(int j=0;j<Lingre.size();j++){
             out.println("<option value="+Lingre.get(j).getId()+">"+Lingre.get(j).getNom()+"</option>");
            }
                            
       %>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Commentaire</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="commentaire"></textarea>
  </div>
    <input type="submit" class="btn btn-dark" name="valider">
</form>
            
       
       
       
       
                               
                           
	</div>
   
    
 




</body>
</html>
