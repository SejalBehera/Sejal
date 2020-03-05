<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head><body>
<h3>Purchase OrderRegister Page</h3>
<form:form action="create" mathod="POST" modelAttribute="purchaseOrder">
<pre>
Order Code:
<form:input path="pOrderCode"></form:input>
Ref No:
<form:input path="refNo"></form:input>
Qality Check:
<form:radiobutton path="qaCheck" value="Required"/>Required
<form:radiobutton path="qaCheck" value="NotRequired"/>NotRequired
Default Status:
<form:input path="dStatus" value="OPEN" readOnly="true"/>
Description:
<form:textarea path="desc"/>
<input type="submit" value="create"/>
</pre>
</form:form>
${message}
</body>
</html>