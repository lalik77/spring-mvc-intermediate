<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Feed Back Sent Successfully</title>
</head>
<body>

<div align="center">
    <br>
    <br>
    <h1> Love Calculator </h1>
    <br>
    <hr>

    <div>
        <h2>Hi ${feedback.name} </h2>
        <label>Your feedback was sent with success ${emailDTO}</label>
    </div>

    <br>
    <br>

    <div>
        <a href="${pageContext.request.contextPath}/">Back to calculation page. </a>
    </div>


</div>

</body>
</html>
