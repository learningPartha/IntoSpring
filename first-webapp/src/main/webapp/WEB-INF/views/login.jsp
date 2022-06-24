<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoo!!!! from JSP</title>
</head>
<body>
<%Date date = new Date(); %>
<div>Current Date is <%=date%></div>
My First JSP ${name} and password ${pwd}
</body>
</html>