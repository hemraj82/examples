<%@taglib prefix="s" uri="/struts-tags"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="submitContact" method="post">
	<s:textfield label="Name  " name="name" />
	<s:textfield label="Address  " name="address" />
	<s:textfield label="Phone  " name="phone" />
	<s:textfield label="Email  " name="email" />
	<s:textfield label="Required  Age " name="requiredAge" />
	<s:submit />
</s:form>
<s:debug></s:debug>
</body>
</html>