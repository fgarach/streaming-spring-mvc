<%-- 
    Document   : _MENU
    Created on : 8 mars 2016, 14:59:05
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="menu">
    <input type="button" onclick="listerFilm();" value="Film"/>
    <input type="button" onclick="listerSerie();" value="Serie"/>
    <input type="button" onclick="listerGenre();" value="Genre"/>
<!--    <a href="<c:url value="/film/lister"></c:url>" > Film </a>
    <a href="<c:url value="/serie/lister"></c:url>" > Serie </a>
    <a href="<c:url value="/genre/lister"></c:url>" > Genre </a>-->
</div>