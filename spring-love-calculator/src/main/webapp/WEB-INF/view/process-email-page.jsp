<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sent successfully</title>
</head>
<body>

<div align="center">
    <br>
    <br>
    <h1> Love Calculator </h1>
    <br>
    <hr>

    <div>
        <h2>Hi ${userInfo.userName} </h2>
        <label>Email successfully sent to ${emailDTO}</label>
    </div>

    <br>
    <br>

    <div>
        <a href="${pageContext.request.contextPath}/">Back to calculation page. </a>
    </div>


</div>

</body>
</html>
