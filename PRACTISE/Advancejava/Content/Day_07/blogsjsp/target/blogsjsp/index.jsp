<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <h3>${initParam.appTitle}</h3>
    <form method="post" action="login.jsp">
        Email <input type="text" name="email"/> <br/><br/>
        Password <input type="password" name="passwd"> <br/><br/>
        <input type="submit" value="Sign In">
    </form>
    <br/>
    <form method="post" action="signup.jsp">

        <input type="submit" value="Sign Up">
    </form>
</body>
</html>