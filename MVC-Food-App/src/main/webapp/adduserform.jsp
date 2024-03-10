<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       
     <form:form action="saveuser" modelAttribute="user">
     <pre>
     Enter Name :<form:input path="name"/>
     Enter email:<form:input path="email"/>
 Enter password :<form:input path="password"/>
                 <input type="submit"/>
     </pre>
     </form:form>

</body>
</html>