<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Page Redirection</title>
</head>
<body>
	
	<h2>Spring Page Redirection</h2>
	<hr/>
	<p>Click below button to redirect the result to new page</p>
	<form:form method="GET" action="/SpringMVC-Redirect/redirect">
		<table>
			<tr>
				<td>
					<input type="submit" value="Redirect Page" />
				</td>
			</tr>
		</table>
	</form:form>
	
	
</body>
</html>