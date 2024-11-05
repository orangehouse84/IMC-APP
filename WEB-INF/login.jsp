<%-- 
    Document   : login
    Created on : Nov 5, 2024, 4:27:59 PM
    Author     : oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>   
    <title>Login</title>

</head>
<body>
    <h1>Login</h1> 

    <form action="LoginServlet" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <input type="submit" value="Login">
    </form>

    <p>Don't have an account? <a href="RegistrationServlet">Register here</a></p> 
</body>
</html>

