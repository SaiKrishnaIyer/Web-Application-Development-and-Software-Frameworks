<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Register Form</title>
</head>
<body>
    <h1>Student Register Form</h1>
    <form action="<%=request.getContextPath()%>/StudentServlet" method="post">
        <table style="width: 80%">
            <tr>
                <td>First Name</td>
                <td><input type="text" name="firstName" /></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lastName" /></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address" /></td>
            </tr>
            <tr>
                <td>Contact No</td>
                <td><input type="text" name="contact" /></td>
            </tr>
        </table>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
