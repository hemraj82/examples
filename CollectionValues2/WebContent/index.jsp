<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<body>
Mapping Multiple Addresses values into Address type Set.
<form action="submit" method="post">Id :<s:textfield
	name="user.id" /><br />
Name :<s:textfield name="user.name" /><br />
Office Address :<br />
	House No.<s:textfield name="user.addresses[0].houseNum" />,
	City<s:textfield name="user.addresses[0].city" />, 
	Country<s:textfield	name="user.addresses[0].country" /><br />
Home Address :<br />
	House No.<s:textfield name="user.addresses[1].houseNum" />, 
	City<s:textfield name="user.addresses[1].city" />, 
	Country<s:textfield	name="user.addresses[1].country" /><br />
	<input type="submit" />
</form>
</body>
</html>