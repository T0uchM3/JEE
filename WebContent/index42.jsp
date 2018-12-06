<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	
<% String firstValue=(String)request.getAttribute("key1");
String secondtValue=(String)request.getAttribute("key2");
%>
<% out.println("1er Valuer : "+firstValue);%> <br>
<%out.println("2eme Valuer : "+secondtValue); %>



	
	
	
	
	
</body>
</html>