<%-- 
    Document   : testjson
    Created on : 30 mars 2016, 10:14:29
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="<c:url value="/resources/JS/jquery-2.2.2.js"/>" type="text/javascript"></script>

        <script type="text/javascript">
//            $.get("chargejson", function (object) {
//                alert(object.titre);
//            });
            $(document).ajaxSend(function () {
                afficheSablier();
            });
            $(document).ajaxError(function () {
                cacheSablier();
            });
            $(document).ajaxSuccess(function () {
                cacheSablier();
            });
            cacheSablier();
        </script>
    </head>
    <body onload="init()">
        <div class="sablier" style="position:fixed;bottom:0;left:0;">
            <img src="<c:url value="/resources/Images/300660d5.gif"/>" alt=""/>
            <img src="<c:url value="/resources/Images/53817.gif"/>" alt=""/>
        </div>
        <h1>Hello World!</h1>
    </body>
</html>
