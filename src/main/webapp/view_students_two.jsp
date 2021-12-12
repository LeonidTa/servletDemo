<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Students Two</title>
</head>
<body>
<table border="1">
    <tr>
        <th>FirstName</th>
        <th>Last Name</th>
        <th>E-Mail</th>
    </tr>

    <c:forEach var="tempStudent" items="${student_list}">

        <tr>
            <td>${tempStudent.firstName}</td>
            <td>${tempStudent.lastName}</td>
            <td>${tempStudent.email}</td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
