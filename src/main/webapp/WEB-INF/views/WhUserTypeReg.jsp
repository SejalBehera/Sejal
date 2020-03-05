<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Welcome to Shipment Type Register Page</h3>
<form action="create" method="post">
<pre>

User Type:
<input type="radio" name="whuType" value="vendor">vendor
<input type="radio" name="whuType" value="customer">customer
User code:
<input type="text" name="whuCode"/>
User for:
<input type="text" name="whuFor"/>
User Email:
<input type="text" name="whuEmail"/>
User Contact:
<input type="text" name="whuCntct"/>
User ID Type:
<select name="whuIdType">
<option>----select----</option>
<option>PANCARD</option>
<option>AADHAR</option>
<option>VOTERID</option>
<option>OTHER</option></select>

If Other:
<input type="text" name="whuOther"/>
ID Number:
<input type="text" name="whuIdNo"/>
<input type="submit" value="CREATE WHUserType"/>
</pre>
</form>
${message}
</body></html>
