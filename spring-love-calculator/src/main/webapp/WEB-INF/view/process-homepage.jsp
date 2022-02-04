<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

     <h2>  ${userInfo.userName} and ${userInfo.crushName} are ${result}  </h2>

    <div>
        <%--<a href="${pageContext.request.contextPath}/email" >Send Result to Your Email </a>--%>
        <a href="<c:url value="/email"/>"  >Send Result to Your Email </a>
    </div>

    <br>

    <div>
        <a href="${pageContext.request.contextPath}/">Recalculate</a>
    </div>

</div>
</body>
</html>
