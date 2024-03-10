<%@page import="com.jsp.dto.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   Product product=(Product)request.getAttribute("com");
%>

        <form:form action="updateform" modelAttribute="${productup}">
        enter new product id   : <form:input path="id" value="<%=product.getId() %>" readonly="true"/>
        enter new product Name : <form:input path="name" value="<%=product.getName() %>"/>
        enter new product Type : <form:input path="type" value="<%=product.getType() %>"/>
        enter new product Cost : <form:input path="cost" value="<%=product.getCost() %>"/>
        						 <input type="submit">
        
        </form:form>
</body>
</html>