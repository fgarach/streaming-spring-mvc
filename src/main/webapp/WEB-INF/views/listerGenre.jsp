<%-- 
    Document   : listerFilm
    Created on : 25 mars 2016, 11:05:36
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${genres.size()==0}">
            Pas encore de genres
        </c:if>
        <c:if test="${genres.size()!=0}">
        Liste des genres :
        <table>
            <tr><td> Numero</td> <td>nom</td></tr>
            <c:forEach items="${genres}" var="genre">
                <tr>
                    <td>${genre.id}</td> <td>${genre.nom}</td> <td><input type="button" onclick="modifierGenre(${genre.id});" value="Modifier le genre"/></td> <td><input type="button" onclick="supprimerGenre(${genre.id});" value="Supprimer le genre"/></td>
                </tr>
            </c:forEach>
        </table>
        </c:if>
        <br>
        <input type="button" onclick="ajouterGenre();" value="Ajouter un genre"/>
         <c:import url="_PIED.jsp"/>
    </body>
</html>
