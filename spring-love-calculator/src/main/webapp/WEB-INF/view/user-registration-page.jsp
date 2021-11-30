<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>

    <style type="text/css">
        .error {
            color: red;
            text-align: left;
            position: fixed;
            margin-left: 30px;

        }
    </style>
</head>
<body>


<h1 align="center">Please register here</h1>

    <div align="center">


<form:form action="registration-success" method="GET" modelAttribute="userRegistrationDto" >

    <label>Name :</label>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>
<br/>
    <label>User Name :</label>
    <form:input path="userName"/>
    <br/>
    <label>Age :</label>
    <form:input path="age"/>
    <form:errors path="age" cssClass="error"/>
<br/>
    <label>Password :</label>
    <form:password  path="password"/>

    <br/>
    <label>Country :</label>
    <form:select path="countryName">

        <form:option value="Ind" label="India"/>
        <form:option value="Usa" label="United Stades"/>
        <form:option value="Ru" label="Russia"/>

            </form:select>

    <br/>
    <br/>
    <label>Hobbies :</label>
    Cricket : <form:checkbox path="hobbies" value="cricket"/>
    Reading : <form:checkbox path="hobbies" value="reading"/>
    Travel : <form:checkbox path="hobbies" value="travel"/>
    Programming : <form:checkbox path="hobbies" value="programming"/>


    <br/>
    <br/>
    <label>Gender &nbsp; &nbsp;</label>
    Male <form:radiobutton path="gender" value="male"/>
    Femele <form:radiobutton path="gender" value="female"/>
    <br/>
    <br/>

    <h1>Communication</h1>

    email <form:input path="communicationDTO.email"/>
    <br/>
    phone <form:input path="communicationDTO.phone"/>

    <br/>
    <input type="submit" value="Register">

</form:form>

    </div>



</body>
</html>
