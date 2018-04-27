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
	<form action="addPos.do" method="post">
		
		上级职位：
			<select name="parent_id" id="parent">
				
			</select>
			<br>
		职位类型：
			<select name="type">
				<option value="1">客服</option>
				<option value="2">员工</option>
				<option value="3">主任</option>
				<option value="4">经理</option>
				<option value="5">总监</option>
			</select>
			<br>
		职位名称:
			<input type="text" name="name">
			<br>
		职位描述:
			<input type="text" name="description">
			<br>
		
		<input type="submit">
	</form>
</div>


<script>
$(
		function() {
			$.ajax({
				   type: "POST",
				   url: "queryPosName.do",
				   success: function(msg){
					var str = '<option value="0">请选择</option>'
						for (x in msg)
						  {
							str = str+'<option value="'+msg[x].id+'">'+msg[x].name+'</option>';
						  }
				   	$("#parent").append(str )
				   }
			});
			
		}
	)
</script>
</body>
</html>