<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sending Mail</title>

</head>
<body>


<div align="center">
    <br>
    <br>
    <h1> Love Calculator </h1>
    <br>
    <hr>

    <h1>Hi ${userInfo.userName}</h1>
    <h2>Send Result To Your Email</h2>

    <%--@elvariable id="emailDTO" type="com.mami.lc.api.EmailDTO"--%>
    <form:form action="process-email" method="get" modelAttribute="emailDTO">

        <label>Enter Your Email</label>
        <form:input path="userEmail"/>
        <input type="submit" value="send">

    </form:form>


    <div>
        <a href="${pageContext.request.contextPath}/">Ignore and return to calculate page </a>
    </div>

</div>




</body>
</html>