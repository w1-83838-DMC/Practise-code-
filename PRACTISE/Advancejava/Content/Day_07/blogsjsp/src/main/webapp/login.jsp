<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <h3>${initParam.appTitle}</h3>
    <jsp:useBean id="lb" class="com.sunbeam.beans.LoginBean" scope="session"/>
    <jsp:setProperty name="lb" property="*"/>
    ${ lb.authenticate() }

    <c:choose>
        <c:when test="${lb.user != null}">
            <c:redirect url="bloglist.jsp"/>
        </c:when>
        <c:otherwise>
            Hello, ${lb.email} <br/><br/>
            Invalidate email and password <br/><br/>
            <a href="index.jsp">Login Again</a>
        </c:otherwise>
    </c:choose>



</body>
</html>