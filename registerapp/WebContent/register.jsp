<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<h1>Registration Form</h1>
<hr>
<s:form action="register" method="PPST">
<s:textfield label="userid" name="uid" />
<s:textfield label="username" name="uname" />
<s:textfield label="email" name="email" />
<s:textfield label="mobile" name="mobile" />
<s:submit value="register" />

</s:form>
</body>
</html>