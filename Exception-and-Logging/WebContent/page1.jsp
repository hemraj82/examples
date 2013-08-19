<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<sx:head debug="true" cache="false" compressed="false" />
<body>
<sx:div
        cssStyle="border:1px solid black;height:75px;width:100px"
        href="ServerTime" 
        updateFreq="3000"
        highlightColor="#cecdee">
 	Server time will be displayed here
</sx:div>
</body>
</html>