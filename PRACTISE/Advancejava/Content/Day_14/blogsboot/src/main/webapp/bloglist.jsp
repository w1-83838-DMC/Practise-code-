<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BlogList</title>
    <link rel="stylesheet" href="css/site.css"/>
</head>
<body>
    <a href="blogs" class="linkbtn">All Blogs</a>
    <a href="blogs?userid=${sessionScope.curusr.id}" class="linkbtn">My Blogs</a>
    <a href="createblog" class="linkbtn">Create Blog</a>
    <a href="findblog" class="linkbtn">Find Blog</a>
    <a href="categories" class="linkbtn">Categories</a>
    <a href="createcategory" class="linkbtn">NewCategory</a>
    <a href="logout" class="linkbtn">Sign Out</a> 
    <br/><br/>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Category</th>
            <th>User</th>
            <th>Action</th>
        </tr>
        <c:forEach var="b" items="${blogList}">
            <tr>
                <td>${b.id}</td>
                <td>${b.title}</td>
                <td>${categoryMap.get(b.categoryId)}</td>
                <td>${userMap.get(b.userId)}</td>
                <td>
                    <c:if test="${b.userId == curusr.id}">
                        <a href="editblog?id=${b.id}">Edit</a>
                        <a href="delblog?id=${b.id}">Delete</a>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
