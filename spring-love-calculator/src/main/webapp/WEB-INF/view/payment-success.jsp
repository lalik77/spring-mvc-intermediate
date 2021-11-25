<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bill</title>
</head>
<body>

<div align="center">
    <h1 align="center">BILL</h1>

    <h3>BILL AGAINST THE CREDIT CARD NUMBER

    <p>
        ${pInfo.creditCard} for an amount of ${pInfo.amount}
    </p>

    </h3>

</div>




<%--<li>Credit Card:&nbsp; ${pInfo.creditCard}</li>

<li>Amount:&nbsp; ${pInfo.amount}</li>--%>



<body/>