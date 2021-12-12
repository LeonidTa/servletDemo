<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Students</title>
</head>
<body>

<c:forEach var="tempStudent" items="${student_list}">

    ${tempStudent} <br>

</c:forEach>
</body>
</html>
