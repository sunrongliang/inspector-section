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
	<form action="admendPos.do" method="post">
		<input type="hidden" name="id" value="${pos.id}">
		上级职位：
			<select name="parent_id" id="select_parent" >
				
			</select>
			<br>
		职位类型：
			<select name="type" id="select_type">
				<option value="1" >客服</option>
				<option value="2">员工</option>
				<option value="3">主任</option>
				<option value="4">经理</option>
				<option value="5">总监</option>
			</select>
			<br>
		职位名称:
			<input type="text" name="name" value="${pos.name }">
			<br>
		职位描述:
			<input type="text" name="description" value="${pos.description }">
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
							if(msg[x].id=="${pos.parent_id}"){
								str = str+'<option value="'+msg[x].id+'" selected="selected">'+msg[x].name+'</option>';
							}else{
								str = str+'<option value="'+msg[x].id+'">'+msg[x].name+'</option>';
							}
						  }
				   	$("#select_parent").append(str )
				   }
			});
		
			
			$("#select_type").val("${pos.type}");
			
		}
	)
</script>
</body>
</html>