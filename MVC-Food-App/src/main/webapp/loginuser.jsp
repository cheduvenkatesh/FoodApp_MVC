<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
          <h1>${userError}</h1>
       <form action="loginval" method="post">
       Enter email   :<input type="text" name="email">
       Enter password:<input type="password" name="password">
                      <input type="submit">
       </form>
</body>
</html>