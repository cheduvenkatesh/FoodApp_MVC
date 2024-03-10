<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
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
      <th>AddItem</th>
      
      <c:forEach var="pro" items="${productlist}">
       <tr>
       <td>${pro.getId()}</td>
       <td>${pro.getName()}</td>
       <td>${pro.getType()}</td>
       <td>${pro.getCost()}</td>
       <td><a href="additem?id=${pro.getId()}">ADD</a></td>
       </tr>
      </c:forEach>
      </table>
      
      <a href="useroptions.jsp">Back</a>                                     <a href="savefoodorders">Submit</a>
</body>
</html>