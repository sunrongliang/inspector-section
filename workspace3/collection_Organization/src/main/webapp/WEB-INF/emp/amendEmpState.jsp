<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>催收系统</title>

</head>
<body>
	<div>
	你确定修改吗？
	<br>
		<form action="amendEmpState.do">
			<input type="hidden" name="id" value="${id }"> 
			<input type="hidden" name="status" value="${status }"> 
			<button type="submit">确定</button>
			<button onclick="$('#amendStatewin').window('close')">取消</button>
		</form>	
	</div>

<script>
	

</script>
</body>
</html>