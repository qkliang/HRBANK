<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="emps">list all employees</a>
	<br><br>
	<form action="testFileUpload" method="post" enctype="multipart/form-data">
		File:<input type="file" name="file"/>
		Desc:<input type="text" name="desc" />
		<input type="submit" value="submit" />
	</form>
	<a href="testException?i=10">test Exception</a>
	<br><br>
	<a href="testResponseException?i=13">test ResponseException</a>
	
	<br><br>
	<a href="testSimpleMappingException?i=12">test SimpleMappingException</a>
</body>
</html>