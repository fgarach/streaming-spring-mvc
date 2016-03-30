<%-- 
    Document   : TEMPLATE
    Created on : 8 mars 2016, 14:59:41
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>STREAMING</title>
        <script src="<c:url value="/resources/JS/jquery-2.2.2.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/JS/utilJavaScript.js"/>" type="text/javascript"></script>
        <script type="text/javascript">
            var path = "<c:url value="/"></c:url>";
             $(document).ajaxSend(function () {
                afficheSablier();
            });
            $(document).ajaxError(function () {
                cacheSablier();
            });
            $(document).ajaxSuccess(function () {
                cacheSablier();
            });
        </script>
        <link href="<c:url value="/resources/Style/style1.css"/>" rel="stylesheet" type="text/css"/>
    </head>
    <body onload="init()">
        <div class="sablier" style="position:fixed;bottom:0;left:0;">
            <img src="<c:url value="/resources/Images/300660d5.gif"/>" alt=""/>
        </div>
        <div id ="menu"> 
            <c:import url="_MENU.jsp"/>
        </div>
        <div id ="contenu"> 


        </div>
        <div id ="pied"> 

            <c:import url="_PIED.jsp"/>
        </div>
    </body>
</html>
