<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

    <form:form  action="process-homepage" method="get" modelAttribute="userInfo">
        <p>

            <label for="yn">Your Name </label>
            <form:input id="yn" path="userName"/>

        </p>

        <p>
            <label for="cn">Crush Name</label>
            <form:input id="cn" path="crushName"/>

        </p>


        <input  type="submit" value="calculate" >
    </form:form>

</div>
</body>
</html>
