<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Acs Order Servlet Admin Page</title>
</head>
<body>
<h1>Acs Order Servlet Admin Page</h1>
<p>
${message}<br/>
    <a href="${pageContext.request.contextPath}/team/list.html">Acs team List</a><br/>
    <br />
    <a href="${pageContext.request.contextPath}/order/add.html">Add New Order</a><br/>
    <a href="${pageContext.request.contextPath}/order/list.html">Acs Order List</a><br/>
</p>
</body>
</html>