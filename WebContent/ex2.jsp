<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% double rangeMin = 0.0f; %>
<%double rangeMax = 1.0f; %>
<%Random r = new Random(); %>
<%double createdRanNum = rangeMin + (rangeMax - rangeMin) * r.nextDouble(); %>
<% out.println(createdRanNum);%>
<% %>
<% %>




</body>
</html>