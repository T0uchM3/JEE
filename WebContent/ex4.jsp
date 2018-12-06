<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String str[];
	%>

	<input id="vendorName" name="vendorName" type="text" class="txtsmall2"
		value="<%=str%>" />

	<button type="button" name="btn1">Click me</button>

	<%
		if (request.getParameter("btn1") != null) {
			out.println(str);
 		}
	%>









</body>
</html>