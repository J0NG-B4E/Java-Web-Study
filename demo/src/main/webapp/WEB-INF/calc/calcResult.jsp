<%--
  Created by IntelliJ IDEA.
  User: bells
  Date: 2023-12-06
  Time: 오후 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>NUM 1 ${param.num1}</h1>  <!-- "\${}" : Expression Language, 서버에서 데이터를 출력하는 용도 -->
    <h1>NUM 2 ${param.num2}</h1>
    <h1>SUM ${Integer.parseInt(param.num1) + Integer.parseInt(param.num2)}</h1>
</body>
</html>
