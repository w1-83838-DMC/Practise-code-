<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>  
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <link rel="stylesheet" href="css/site.css"/>
    </head>
    <body>
        <img src="images/blogs.png" alt="Blogs Logo" style="width: 200px; height: 80px;"/><br/>
        <h3><s:message code="app.Title"/></h3>
        <form method="post" action="login">
            <s:message code="email.label"/>: <input type="text" name="email"/> <br/>
            <s:message code="passwd.label"/>: <input type="password" name="passwd"/> <br/>
            <input type="submit" value="<s:message code="signin.label"/>"/>
            <a href="createuser"><s:message code="signup.label"/></a>
        </form>
    </body>
</html>

