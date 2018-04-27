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
	<form action="addOrg.do" method="post">
	
	<input type="hidden" name="id" value="${org.id}">
		
		上级机构：
			<select name="parent_id" id="parent">
				
			</select>
			<br>
		机构类型：
			<select name="type">
				<option value="0">请选择</option>
				<option value="1">总公司</option>
				<option value="2">分公司</option>
				<option value="3">小组</option>
			</select>
			<br>
		负责人：&nbsp&nbsp
			<select name="principal_id" id="employee">
				
			</select>
		<br>
	机构名称:
		<input type="text" name="name" value="${id }">
		<br>
	地址:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<input type="text" name="address">
		<br>
	电话号码:
		<input type="text" name="phone">
		<br>
	邮政编码:
		<input type="text" name="post_code">
		<br>
	传真号:&nbsp&nbsp&nbsp
		<input type="text" name="fax">
		<br>
		<input type="submit">
	</form>
</div>


<script>
$(
		function() {
			$.ajax({
				   type: "POST",
				   url: "queryName.do",
				   success: function(msg){
					var str = '<option value="0">请选择</option>'
						for (x in msg)
						  {
							str = str+'<option value="'+msg[x].id+'">'+msg[x].name+'</option>';
						  }
				   	$("#parent").append(str )
				   }
			});
			
			$.ajax({
				   type: "POST",
				   url: "queryEmp.do",
				   success: function(msg){
					var str = '<option value="0">请选择</option>'
						for (x in msg)
						  {
							str = str+'<option value="'+msg[x].id+'">'+msg[x].user_name+'</option>';
						  }
				   	$("#employee").append(str )
				   }
			});
		}
	)
</script>
</body>
</html>