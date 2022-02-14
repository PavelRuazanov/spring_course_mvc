<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<body>
<H2> Dear Employee< please enter your details</H2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>

    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    <br><br>

    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Recruter" label="HR"/>--%>
    <%--    <form:option value="Sales" label="Sales"/>--%>
    <%--    <br><br>--%>

</form:select>
    <br><br>
    Which car do you want?

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
<%--    BMV <form:radiobutton path="carBrand" value="BMV"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    MB<form:radiobutton path="carBrand" value="MB"/>--%>
    <br><br>

    Foreign Language (s)
<form:checkboxes path="languages" items="${employee.languageList}"/>

<%--    EN <form:checkbox path="languages"  value="English"/>--%>
<%--    FR <form:checkbox path="languages"  value="French"/>--%>
<%--    DE <form:checkbox path="languages"  value="Deutch"/>--%>
    <br><br>
    <input type="submit" value="OK">


</form:form>

</body>

</html>