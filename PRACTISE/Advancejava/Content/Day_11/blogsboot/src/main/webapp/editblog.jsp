<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h3>Edit blog</h3>
    <sf:form method="post" action="editblog">
        <sf:hidden path="id"/>
        Title: <sf:input path="title" /><br/>
        <sf:textarea path="contents" rows="6" cols="60"/><br/>
        <sf:hidden path="userId"/>
        Category: <sf:select path="categoryId" items="${categoryList}" itemValue="id" itemLabel="title" /> <br/>
        <input type="submit" value="Submit"/>
    </sf:form>
</body>
</html>