<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC Form Handing</title>
</head>
<body>
	
	<h2>你好，测试页面.</h2>
	<h2>Submitted Student Information</h2>
	<table>
		<tr>
			<td>Msg</td>
			<td>${msg}</td>
		</tr>
		<tr>
			<td>Name</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${age}</td>
		</tr>
		<tr>
			<td>ID</td>
			<td>${id}</td>
		</tr>
	</table>
	
	
	
	
</body>
</html>