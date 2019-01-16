package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import database.DAO.OracleUtilisateurDAO;
import database.DAO.OracleDataSourceDAO;
import metier.Utilisateur;
import database.DAO.OracleUtilisateurDAO;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import metier.Utilisateur;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./menu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Accueil</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"./assets/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"./assets/home.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"./assets/menu.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"LoginForm\" class=\"hm-gradient\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark  mb-4\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Tige-Time</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                        <li class=\"nav-item active\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Accueil <span class=\"sr-only\"></span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Les Classiques</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Mon Comtpte</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown \r\n");
      out.write("                                </a>\r\n");
      out.write("                            <div class=\"dropdown-menu dropdown-primary\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">J'adore</a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Laisser un commentaire</a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Deconnexion</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <span>");
 
           Utilisateur us =(Utilisateur) session.getAttribute("currentUser");
           if(session.equals("log")==true){
               out.println("Bienvenue "+us.getUser());
           }
           else{
               out.println("ERROR : WRONG IDS");
           }
           

      out.write("</span>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("</div>            \r\n");
      out.write("            <!--/.Navbar blue-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t<div class=\"container-fliud\">\r\n");
      out.write("\t\t\t\t<div class=\"wrapper row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"preview col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"preview-pic tab-content\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"tab-pane active\" id=\"pic-1\"><img src=\"http://placekitten.com/400/252\" /></div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"tab-pane\" id=\"pic-2\"><img src=\"http://placekitten.com/400/252\" /></div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"tab-pane\" id=\"pic-3\"><img src=\"http://placekitten.com/400/252\" /></div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"tab-pane\" id=\"pic-4\"><img src=\"http://placekitten.com/400/252\" /></div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"tab-pane\" id=\"pic-5\"><img src=\"http://placekitten.com/400/252\" /></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"preview-thumbnail nav nav-tabs\">\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"active\"><a data-target=\"#pic-1\" data-toggle=\"tab\"><img src=\"http://placekitten.com/200/126\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li><a data-target=\"#pic-2\" data-toggle=\"tab\"><img src=\"http://placekitten.com/200/126\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li><a data-target=\"#pic-3\" data-toggle=\"tab\"><img src=\"http://placekitten.com/200/126\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li><a data-target=\"#pic-4\" data-toggle=\"tab\"><img src=\"http://placekitten.com/200/126\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li><a data-target=\"#pic-5\" data-toggle=\"tab\"><img src=\"http://placekitten.com/200/126\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"details col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"product-title\">men's shoes fashion</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"rating\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"stars\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"fa fa-star checked\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"fa fa-star checked\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"fa fa-star checked\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"fa fa-star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"fa fa-star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"review-no\">41 reviews</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"product-description\">Suspendisse quos? Tempus cras iure temporibus? Eu laudantium cubilia sem sem! Repudiandae et! Massa senectus enim minim sociosqu delectus posuere.</p>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"price\">current price: <span>$180</span></h4>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"vote\"><strong>91%</strong> of buyers enjoyed this product! <strong>(87 votes)</strong></p>\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"sizes\">sizes:\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"size\" data-toggle=\"tooltip\" title=\"small\">s</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"size\" data-toggle=\"tooltip\" title=\"medium\">m</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"size\" data-toggle=\"tooltip\" title=\"large\">l</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"size\" data-toggle=\"tooltip\" title=\"xtra large\">xl</span>\r\n");
      out.write("\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"colors\">colors:\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"color orange not-available\" data-toggle=\"tooltip\" title=\"Not In store\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"color green\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"color blue\"></span>\r\n");
      out.write("\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"action\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"add-to-cart btn btn-default\" type=\"button\">add to cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"like btn btn-default\" type=\"button\"><span class=\"fa fa-heart\"></span></button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
