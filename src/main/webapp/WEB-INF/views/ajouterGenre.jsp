<%-- 
    Document   : effacemoi_ajouter
    Created on : 24 mars 2016, 15:02:33
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Nouveau Genre : 
        <br>
        <form:form modelAttribute="monGenre" action="ajouter" method="post">
            Nom : <form:input path="nom"/>
            <input type="button" onclick="ajouterGenrePost();" value="Ajouter"/>
        </form:form>
    </body>
</html>
