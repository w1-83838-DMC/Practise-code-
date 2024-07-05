<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="css/site.css"/>
</head>
<body>
    <h3>Registeration</h3>
    <sf:form modelAttribute="user" action="createuser">
        Name : <sf:input path="name"/><sf:errors path="name" class="error"/><br/>
        Email :<sf:input path="email"/><sf:errors path="email" class="error"/><br/>
        Password : <sf:password path="password"/><sf:errors path="password" class="error"/><br/>
        Phone : <sf:input path="phone"/><sf:errors path="phone" class="error"/><br/>
        <input type="submit" value="Sign Up">
        <a href="index">Sign In</a>
        
    </sf:form>
</body>
</html>