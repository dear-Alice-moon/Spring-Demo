<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC Exception Handling</title>
</head>
<body>
	
	<h2>SpringMVC Exception Handling</h2>
	
	<!-- exception值来自于SpringMVC-Exception-test-servlet.xml文件配置中的
		org.springframework.web.servlet.handler.SimpleMappingExceptionResolver.class文件中的
		public static final String DEFAULT_EXCEPTION_ATTRIBUTE = "exception" 值 .
	 -->
	<h3>exception来自哪里？  ${exception}</h3>
	<h3>${exception.exceptionMsg}</h3>
	
</body>
</html>