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
int count = 0, leng = 0;
String num;

double rangeMin = Math.random();
int fromDouble = (int)(rangeMin * 20)+1;
num = String.valueOf(fromDouble);
leng = num.length()-1;

out.println(leng+1 +" chifres");
do{
	
%>
<ul><% out.println(num.charAt(count)); %></ul>
<%

count ++;

}while (count <= leng);%>
<% %>




</body>
</html>