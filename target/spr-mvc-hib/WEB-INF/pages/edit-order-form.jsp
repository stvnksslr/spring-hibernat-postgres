<%--
  Created by IntelliJ IDEA.
  User: skessler
  Date: 2/23/15
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Edit order page</title>
</head>
<body>
<h1>Edit order page</h1>
<p>Here you can edit the existing orders. (testing)</p>
<p>${message}</p>
<form:form method="POST" commandName="order" action="${pageContext.request.contextPath}/order/edit/${acsOrder.id}.html">
    <table>
        <tbody>
        <tr>
            <td>Order:</td>
            <td><form:textarea path="orderdata" /></td>
        </tr>
        <tr>
            <td>has thsi order been processed (test: debug):</td>
            <td><form:checkbox path="getprocessed" /></td>
        </tr>
        <tr>
            <td>date order was processed:</td>
            <td><form:input path="dateprocessed" /></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add" /></td>
            <td></td>
        </tr>
        </tbody>
    </table>
</form:form>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</body>
</html>
