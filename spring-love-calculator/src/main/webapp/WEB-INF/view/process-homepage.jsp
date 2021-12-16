<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mvc app</title>
</head>
<body>

<div align="center">
    <br>
    <br>
    <h1> Love Calculator </h1>
    <br>
    <hr>
    <h2>The love calculator predicts</h2>

    <br/>

    ${userInfo.userName} and ${userInfo.crushName} are

    FRIENDS

    <br/>
    <br/>
    <br/>

    <a href="${pageContext.request.contextPath}/email" >Send Result to Your Email </a>


</div>
</body>
</html>
