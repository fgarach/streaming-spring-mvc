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
        <c:if test="${series.size()==0}">
            Pas encore de series
        </c:if>
        <c:if test="${series.size()!=0}">
            Liste des series :
            <table>
                <tr>
                    <td> Numero</td> <td>titre</td> <td>Synopsis</td>
                </tr>
                <c:forEach items="${series}" var="serie">
                    <tr>
                        <td>${serie.id}</td> <td>${serie.titre}</td> <td> ${serie.synopsis}</td>  <td><input type="button" onclick="modifierSerie(${serie.id});" value="Modifier la serie"/></td> <td><input type="button" onclick="supprimerSerie(${serie.id});" value="Supprimer la serie"/></td>
                        </tr>
                </c:forEach>

            </table>
        </c:if>
        <br>
       <input type="button" onclick="ajouterSerie();" value="Ajouter une serie"/>
       
    </body>
</html>
