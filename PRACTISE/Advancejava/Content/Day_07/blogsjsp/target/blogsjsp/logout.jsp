<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logout</title>
</head>
<body>
        <h3>${initParam.appTitle}</h3>
        <% session.invalidate(); %>
        Thank you fro visitiong our vlogs . <br/><br/>
        <a href="index.jsp">Login Again</a>
</body>
</html>