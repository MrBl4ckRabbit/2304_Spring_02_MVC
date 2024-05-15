<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
 <title>Params pages </title>
</head>
 <body>
   <c:if test="${not empty stringParam}">
     <h1> String Parameter: ${stringParam}
     </c:if>
     <c:if test="${not empty intParam}">
          <h1> Integer Parameter: ${intParam}
          </c:if>
 </body>
</html>