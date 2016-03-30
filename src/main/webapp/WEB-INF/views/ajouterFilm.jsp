<%-- 
    Document   : effacemoi_ajouter
    Created on : 24 mars 2016, 15:02:33
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>

<div id ="contenu"> 
    Nouveau Film : 
    <br>
    <form:form modelAttribute="monFilm" action="film/ajouter" method="post">
        Nom : <form:input path="titre"/>
        Synopsis : <form:input path="synopsis"/>
        Annee : <form:input path="annee"/>
        Genre : <form:select path="genreDuFilm.id">
            <form:options items="${genres}" itemLabel="nom" itemValue="id"/>                
        </form:select>
        <input type="button" onclick="ajouterFilmPost();" value="Ajouter"/>
    </form:form>
</div>

