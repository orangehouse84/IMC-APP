<%-- 
    Document   : measurements
    Created on : Nov 5, 2024, 4:28:41 PM
    Author     : oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Measurements</title>
</head>
<body>
    <h1>BMI Measurement History</h1>

    <table border="1">
        <thead>
            <tr>
                <th>Date</th>
                <th>Weight (kg)</th>
                <th>BMI</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="entry" items="${history}"> 
                <tr>
                    <td><c:out value="${entry.date}" /></td>
                    <td><c:out value="${entry.weight}" /></td>
                    <td><c:out value="${entry.bmi}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>

