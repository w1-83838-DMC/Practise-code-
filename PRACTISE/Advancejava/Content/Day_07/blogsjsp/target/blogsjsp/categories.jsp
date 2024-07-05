<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <jsp:useBean id="cat" class="com.sunbeam.beans.CategoryListBean"/>
    <jsp:setProperty name="cat" property="*" />
    ${cat.fetchCategory()}
    <table border="1">
        <tr>
            <th>id</th>
            <th>title</th>
            <th>description</th>
        </tr>
        <c:forEach var="c" items="${cat.categoryList}">
        <tr>
            <td>${c.id}</td>
            <td>${c.title}</td>
            <td>${c.description}</td>
        </tr>
        </c:forEach>
    </table>

</body>
</html>