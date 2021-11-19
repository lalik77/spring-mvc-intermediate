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
    <form action="process-homepage" method="get">
        <p>

            <label for="yn">Your Name </label>
            <input type="text" id="yn" name="userName">

        </p>

        <p>
            <label for="cn">Crush Name</label>
            <input type="text" id="cn" name="crushName">

        </p>


        <input type="submit" value="calculate" >
    </form>

</div>
</body>
</html>
