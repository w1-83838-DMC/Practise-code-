<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <jsp:useBean id="cb" class="com.sunbeam.CapBean"/>
    <jsp:setProperty name="cb" property="userName" param="uname"/>
    <% cb.execute(); %>
    Hello,<jsp:getProperty name="cb" property="result"/>

</body>
</html>