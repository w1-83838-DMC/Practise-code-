<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup</title>
</head>
<body>
    <h3>${initParam.appTitle}</h3>
    <jsp:useBean id="sp" class="com.sunbeam.beans.SignUpBean"/>
    <jsp:setProperty name="sp" property="*"/>
    ${sp.signup()}    
</body>
</html>