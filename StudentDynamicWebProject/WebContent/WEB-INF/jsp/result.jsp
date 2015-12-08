<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted Student Information</h2>
   <table>
    <tr>
        <td>Name</td>
        <td>${name}</td>
        <td><springForm:errors path="name" cssClass="error" /></td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${age}</td>
        <td><springForm:errors path="age" cssClass="error" /></td>
    </tr>
    <tr>
        <td>ID</td>
        <td>${id}</td>
        <td><springForm:errors path="id" cssClass="error" /></td>
    </tr>
</table>  
</body>
</html>