<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      <table align="center" cellPadding="20px" border="1">
      <th>id</th>
      <th>name</th>
      <th>type</th>
      <th>cost</th>
      <th>Update</th>
      <th>Delete</th>
      <c:forEach var="pro" items="${productfetch}">
       <tr>
       <td>${pro.getId()}</td>
       <td>${pro.getName()}</td>
       <td>${pro.getType()}</td>
       <td>${pro.getCost()}</td>
       <td><a href="update?id=${pro.getId()}">Update</a></td>
       <td><a href="delete?id=${pro.getId()}">Delete</a></td>
       </tr>
      </c:forEach>
      </table>

</body>
</html>