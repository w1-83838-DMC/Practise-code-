<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blog List</title>
    <link rel="stylesheet" href="CSS/site.css">
</head>
<body>

    <h3>${initParam.appTitle}</h3>
    Hello, ${lb.user.name} <hr/>

    <a href="bloglist.jsp">All Blogs</a>
    <a href="bloglist.jsp?userid=${lb.user.id}">My Blogs</a>
    <a href="newblog.jsp">Create Blog</a>
    <a href="fingblog.jsp">Find blog</a>
    <a href="categories.jsp">Categories</a>
    <a href="newcategory.jsp">Create Category</a>
    <a href="deletecategory.jsp">Delete Category</a>
    <a href="logout.jsp">Sign Out</a>
    <br/><br/>
    <jsp:useBean id="fcb" class="com.sunbeam.beans.FindCategoryBean"/>
    <jsp:useBean id="blb" class="com.sunbeam.beans.BlogListBean"/>
    <jsp:useBean id="ucb" class="com.sunbeam.beans.FindUserBean"/>
    <jsp:setProperty name="blb" property="userId" param="userid"/>
    ${blb.fetchBlogs()}
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Categories</th>
            <th>User</th>
            <th>Created</th>
            <th>Action</th>
        </tr>
        <c:forEach var="b" items="${blb.blogList}">
          
            <jsp:setProperty name="ucb" property="id" value="${b.userId}"/>
            <jsp:setProperty name="fcb" property="id" value="${b.categoryId}"/>
            ${fcb.fetchCategory()}
            ${ucb.fetchUser()}
            <tr>
                <td>${b.id}</td>
                <td>${b.title}</td>
                <td>${fcb.category.title}</td>
                <td>${ucb.user.name}</td>
                <td>
                    <fmt:formatDate pattern="dd-MM-yyyy HH:mm" value="${b.createdOn}" /> 
                </td>
                <td>
                    <c:if test ="${b.userId == lb.user.id}">
                        <a href="editblog.jsp?id=${b.id}">Edit</a>
                        <a href="delblog.jsp?id=${b.id}">Delete</a>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>