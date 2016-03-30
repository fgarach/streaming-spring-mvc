<%-- 
    Document   : listerFilm
    Created on : 25 mars 2016, 11:05:36
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div id ="contenu"> 
    <c:if test="${films.size()==0}">
        Pas encore de films
    </c:if>
    <c:if test="${films.size()!=0}">
        Liste des films :
        <table>
            <tr><td> Numero</td> <td>titre</td> <td>Synopsis</td> <td>Genre</td> <td>Annee</td></tr>

            <c:forEach items="${films}" var="film">
                <tr>
                    <td>${film.id}</td> <td>${film.titre}</td> <td> ${film.synopsis}</td> <td> ${film.genreDuFilm.nom} </td> <td>${film.annee}</td> <td><input type="button" onclick="modifierFilm(${film.id});" value="Modifier le film"/></td> <td><input type="button" onclick="supprimerFilm(${film.id});" value="Supprimer le film"/></td>
                </tr>
            </c:forEach>

        </table>
    </c:if>
    <br>
    <input type="button" onclick="ajouterFilm();" value="Ajouter un film"/>
</div>

