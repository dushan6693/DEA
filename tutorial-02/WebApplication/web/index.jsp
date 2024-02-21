<%-- 
    Document   : index
    Created on : Jan 30, 2024, 10:46:20 AM
    Author     : dusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginServlet" method="POST">
            <input type="text" name="username" value="" />
            <input type="password" name="password" value="" />
            <input type="submit" value="Login" name="submit" />
            
        </form>
    </body>
</html>
