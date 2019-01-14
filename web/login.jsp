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
        <title>Accueil</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="./assets/style.css" rel="stylesheet">
        <link href="./assets/home.css" rel="stylesheet">
        <link href="./assets/menu.css" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
    </head>
    <body id="LoginForm" >


<%@include  file="./menu.jsp" %>

   
   <div class="container">
		<div class="card">
			<div class="container-fliud">
				<div class="wrapper row">
					<div class="preview col-md-6">
						
						<div class="preview-pic tab-content">
						  <div class="tab-pane active" id="pic-1"><img src="./assets/images/cig1.jpg" /></div>
						  <div class="tab-pane" id="pic-2"><img src="./assets/images/cig2.jpg" /></div>
						  <div class="tab-pane" id="pic-3"><img src="./assets/images/cig3.JPG" /></div>
						  <div class="tab-pane" id="pic-4"><img src="./assets/images/cig4.jpg" /></div>
						  <div class="tab-pane" id="pic-5"><img src="./assets/images/cig5.jpg" /></div>
						</div>
						<ul class="preview-thumbnail nav nav-tabs">
						  <li class="active"><a data-target="#pic-1" data-toggle="tab"><img src="./assets/images/cig1.jpg" /></a></li>
						  <li><a data-target="#pic-2" data-toggle="tab"><img src="./assets/images/cig2.jpg" /></a></li>
						  <li><a data-target="#pic-3" data-toggle="tab"><img src="./assets/images/cig3.JPG" /></a></li>
						  <li><a data-target="#pic-4" data-toggle="tab"><img src="./assets/images/cig4.jpg" /></a></li>
						  <li><a data-target="#pic-5" data-toggle="tab"><img src="./assets/images/cig5.jpg" /></a></li>
						</ul>
						
					</div>
					<div class="details col-md-6">
						<h3 class="product-title">Choisissez vos ingrédients ! </h3>
						<div class="rating">
							<div class="stars">
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star"></span>
								<span class="fa fa-star"></span>
							</div>
							<span class="review-no">41 reviews</span>
						</div>
						<p class="product-description">Sur Tige-Time, la meilleure qualité et la plus grande diversité de Tiges du web !</p>
						<h4 class="price">Prix actuel : <span>12 euros</span></h4>
						<p class="vote"><strong>91%</strong> des consomatteurs ont aimés ce produit. <strong>(87 votes)</strong></p>
						<h5 class="sizes">Dose de nicotine :
							<span class="size" data-toggle="tooltip" title="small">10%</span>
							<span class="size" data-toggle="tooltip" title="medium">20%</span>
							<span class="size" data-toggle="tooltip" title="large">40%</span>
							<span class="size" data-toggle="tooltip" title="xtra large">70%</span>
						</h5>
						<h5 class="colors">Couleur du paquet
							<span class="color orange" data-toggle="tooltip" title="Not In store"></span>
							<span class="color green"></span>
							<span class="color blue"></span>
						</h5>
						<div class="action">
							<button class="add-to-cart btn btn-dark" type="button">Ajouter au panier</button>
							<button class="like btn btn-default" type="button"><span class="fa fa-heart"></span></button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
   
    
 




</body>
</html>
