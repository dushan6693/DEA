<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        


        
        <form action="SignupServlet" method="POST">
            <table cellpadding="1">
            
                <tr>
                    <td><label>Username :</label></td>
                    <td><input type="text" name="username" value="" /></td>
                </tr>
                <tr>
                    <td> <label>E-mail :</label></td>
                    <td><input type="email" name="email" value="" /></td>
                </tr>
                <tr>
                    <td><label>Password :</label></td>
                    <td><input type="password" name="password" value="" /></td>
                </tr>
                <tr>
                    <td><label>Repeat password :</label></td>
                    <td><input type="password" name="r_password" value="" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Submit" /></td>
        </table>
            
            
            
            
           
            
            
            
            
            
            
            
        </form>
        
    </body>
</html>
