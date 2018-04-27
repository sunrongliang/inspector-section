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
	<form action="addEmp.do" method="post">
	
		账号:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<input type="text" name="login_name" >
		<br>
		初始密码:
		<input type="text" name="password">
		<br>
		姓名:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<input type="text" name="user_name">
		<br>
		性别:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<input type="radio" name="sex" value="1">男
		<input type="radio" name="sex" value="0">女
		<br>
		联系方式:
		<input type="text" name="contact_mode">
		<br>
		坐席用户:
		<input type="text" name="cc_login" >
		<br>
		坐席密码:
		<input type="text" name="cc_pwd">
		<br>
		服务地址:
		<input type="text" name="cc_server">
		<br>
		坐席号:&nbsp&nbsp&nbsp&nbsp
		<input type="text" name="cc_phone">
		<br>
		所属机构：
		<select name="parent_id" id="parent">
			
		</select>
		<br>
		岗位：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<select name="type">
			<option value="0">请选择</option>
			<option value="1">客服 </option>
			<option value="2">员工</option>
			<option value="3">主任</option>
			<option value="4">经理</option>
			<option value="5">总监</option>
		</select>
		<br>
		附加机构：
		<select name="principal_id" id="employee">
			
		</select>
		<br>
		委托方：&nbsp&nbsp&nbsp&nbsp&nbsp
		<select name="principal_id" >
			
		</select>
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