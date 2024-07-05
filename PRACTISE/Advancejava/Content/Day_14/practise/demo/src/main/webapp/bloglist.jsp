<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BlogList</title>
</head>
<body>
    

    <table border="1">
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Category</th>
                <th>User</th>
                <th>Action</th>
            </tr>
            <c:forEach var="b" items="${blogList}">
                <tr>
                    <td>${b.id}</td>
                    <td>${b.title}</td>
                    <td>${b.category.title}</td>
                    <td>${b.user_id}</td>
                    <td>
                        <a href="editblog?id=${b.id}">Edit</a>
                        <a href="delblog?id=${b.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
    </table>

    
</body>
</html>