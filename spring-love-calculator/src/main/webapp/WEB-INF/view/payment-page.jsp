<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bill</title>
</head>

<body>

<h1 align="center">BILL</h1>


<div align="center">


    <form:form action="bill-success" method="GET" modelAttribute="pInfo">

    <div align="center">

        <label>Card Number :</label>
        <form:input path="creditCard"/>
        <br/>
        <br/>
        <label>Amount:</label>
        <form:input path="amount"/>

        <br/>
        <br/>
        <input type="submit" value="BILL">

    </div>

    </form:form>

    <div/>


<body/>





