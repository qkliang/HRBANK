<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="emp" method="POST" modelAttribute="employee">
		LastName:<form:input path="lastName"/>
		<br>
		email:<form:input path="email"/>
		<br>
		<%
			Map<String,String> genders = new HashMap<String,String>();
			genders.put("1","Male");
			genders.put("2","Female");
			request.setAttribute("genders", genders);
		%>
		Gender:<form:radiobuttons path="gender" items="${genders }"/>
		<br>
		Department:<form:select path="department.id" items="${department }" itemLabel="departmentName" itemValue="id"></form:select>
		<br>
		<input type="submit" value="提交" />
	</form:form>
</body>
</html>