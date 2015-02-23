<%--
  Created by IntelliJ IDEA.
  User: skessler
  Date: 2/23/15
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>List of acs orders</title>
</head>
<body>
<h1>List of acs orders</h1>
<p>Here you can see the list of the orders that have been placed today, edit them, remove or update.</p>
<table border="1px" cellpadding="0" cellspacing="0" >
    <thead>
    <tr>
        <th width="10%">id</th><th width="15%">order</th><th width="15%">processed</th><th width="10%">date processed</th><th width="10%">actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="AcsOrders" items="${acsOrder}">
        <tr>
            <td>${acsOrder.id}</td>
            <td>${acsOrder.orderdata}</td>
            <td>
                <a href="${pageContext.request.contextPath}/order/edit/${acsorder.id}.html">Edit</a><br/>
                <a href="${pageContext.request.contextPath}/order/delete/${acsorder.id}.html">Delete</a><br/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>

</body>
</html>
