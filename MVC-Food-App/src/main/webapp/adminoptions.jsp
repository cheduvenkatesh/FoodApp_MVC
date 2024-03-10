<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         
         <h1>${usermsg}</h1><%-- this is for User save--%>
         <h1>${promsg}</h1> <%-- this is for add product save --%>
         <h1>${updatemsg}</h1><%--this is for Update product --%>
         <h1>${deletemsg}</h1><%--this is for Delete product --%>
       <a href="adduser">Add User</a>
       <a href="loginuser.jsp">Login User</a> 
       <a href="addprod">Add Product</a>
       <a href="viewproduct">Display Products</a>
</body>
</html>