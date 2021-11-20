<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h1 align="center">Please register here</h1>

<form:form action="register" modelAttribute="userRegistrationDto" >

    <label>User:</label>
<form:input path="name"/>

</form:form>
</body>
</html>
