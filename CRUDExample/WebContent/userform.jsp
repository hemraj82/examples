<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CRUD Operations</title>
</head>
<body>
<a href="listUsers"> List Users</a>
<s:form action="create">
	<s:hidden key="user.id"></s:hidden>
	<s:textfield key="user.name"  label="Name"></s:textfield>
	<s:textfield key="user.phone" label="Phone Number"></s:textfield>
	<s:textfield key="user.email" label="Email"></s:textfield>
	<s:textfield key="user.address" label="Address"></s:textfield>
	<s:submit/>
</s:form>
<s:debug></s:debug>
</body>
</html>

