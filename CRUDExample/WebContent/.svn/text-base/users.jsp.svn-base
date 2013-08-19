<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Added users list</title>
<style type="text/css">
#users{
border:1px #CCCCCC solid;
padding:5px;
}
#users td{
padding:5px;
}
.evenRow { 
    background:#f8f8ff; 
} 
.oddRow { 
    background:#efefef; 
} 
</style>
</head>

<body>
<h1>List Of Users</h1>
<a href="userform.jsp">Add New User</a>
<table id="users">
<tr style="background-color:#CCCCCC"><th>Name</th><th>Email</th><th>Phone</th><th>Address</th><th>Edit</th><th>Delete</th></tr>
<s:iterator value="users" status="s">
	
	<s:if test="#s.odd"> 
        <tr class="oddRow"> 
    </s:if> 
    <s:if test="#s.even"> 
        <tr class="evenRow"> 
    </s:if> 
		<td><s:property value="name"/></td>
		<td><s:property value="email"/></td>
		<td><s:property value="phone"/></td>
		<td><s:property value="address"/></td>
		<td> 
			<s:url id="editURL" action="edit">
                    <s:param name="id" value="%{id}"></s:param>
                </s:url>
            <s:a href="%{editURL}">Edit</s:a> </td>
		<td>
			<s:url id="deleteURL" action="delete">
                    <s:param name="id" value="%{id}"></s:param>
                </s:url>
            <s:a href="%{deleteURL}">Delete</s:a> </td>
		</td>  
	</tr>
</s:iterator>
</table>
<s:debug></s:debug>
</body>
</html>