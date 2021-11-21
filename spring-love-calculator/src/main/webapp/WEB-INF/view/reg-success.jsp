<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<br/>
<br/>
<br/>

<h1 align="center"> Registration Success</h1>

<br/>
<br/>
<br/>

<h1>The details of registration</h1>

<li>Name:&nbsp; ${userRegistrationDto.name}</li>
<li>User Name:&nbsp;${userRegistrationDto.userName}</li>
<li>Password Name:&nbsp;${userRegistrationDto.password}</li>
<li>Country:&nbsp; &nbsp;${userRegistrationDto.countryName}</li>
<li>Hobbies:&nbsp;</li>
   <ul>
       <c:forEach var="temp" items="${userRegistrationDto.hobbies}" >
           - ${temp}
       </c:forEach>
   </ul>
<li>Gender:&nbsp;${userRegistrationDto.gender}</li>

</body>
</html>
