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
        Modifier Serie : 
        <br>
        <form:form modelAttribute="monFilm" action="modifier" method="post">
            <form:hidden path="id"/>
            Nom : <form:input path="titre"/>
            Synopsis : <form:input path="synopsis"/>
            Annee : <form:input path="annee"/>
            Genre : <form:select path="genreDuFilm.id">
                <form:options items="${genres}" itemLabel="nom" itemValue="id"/>                
            </form:select>
            <input type="button" onclick="modifierFilmPost();" value="Modifier"/>
        </form:form>
    </body>
</html>
