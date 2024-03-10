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
         
      <form:form action="addedpro" modelAttribute="product">
      Enter Product Name:<form:input path="name"/>
      Enter Product Type:<form:input path="type"/>
      Enter Product Cost:<form:input path="cost"/>
                 <input type="submit">
      </form:form>
     
</body>
</html>