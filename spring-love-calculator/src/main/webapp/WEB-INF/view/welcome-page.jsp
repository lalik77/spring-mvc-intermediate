<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Mvc app</title>

    <script type="text/javascript">

        function validateUserName(){

            var userName = document.getElementById("yn").value;

            if (userName.length < 2) {

                alert("your name should have at least one char")
                return false;

            }
            else {
                return true;
            }
        }

    </script>

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

<div align="center">
    <br>
    <br>
    <h1> Love Calculator </h1>
    <br>
    <hr>

    <form:form  action="process-homepage" method="get" modelAttribute="userInfo" onsubmit="return true">
        <p>
            <label for="yn">Your Name </label>
            <form:input id="yn" path="userName"/>
            <for:errors path="userName" cssClass="error"/>
        </p>

        <p>
            <label for="cn">Crush Name</label>
            <form:input id="cn" path="crushName"/>
        </p>

        <p>
          <form:checkbox path="termOfConditions" ></form:checkbox>
            <label>I am agreeing that this is for fun</label>
            <form:errors path="termOfConditions" cssClass="error"/>
        </p>

        <input  type="submit" value="calculate" >
    </form:form>

</div>
</body>
</html>
