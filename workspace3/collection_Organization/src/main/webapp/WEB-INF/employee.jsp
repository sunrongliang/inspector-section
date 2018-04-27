<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>催债系统</title>
</head>	
<body>
	
	<br>
	<div>
		员工状态：
			<select name="status" id="status" style="width:100px;">
				<option value="2">请选择</option>
				<option value="1">启用</option>
				<option value="0">停用</option>
			</select>
			
		机构：
			<select name="org_id" id="org_id" style="width:100px;" >
			
			</select>
		
		账号:
			<input type="text" name="login_name" id="login_name">
			
		姓名:
			<input type="text" name="user_name" id="user_name">
			
		
		<button onclick="dynamicQuery()">提交</button>
	
	</div>

	<div style="margin:10px 0;">
		<a href="javascript:addEmp()" class="easyui-linkbutton" >增加</a>
		<a href="javascript:amendEmp()" class="easyui-linkbutton">修改</a>
		<a href="javascript:amendState(0)" class="easyui-linkbutton">停用</a>
		<a href="javascript:amendState(1)" class="easyui-linkbutton">启用</a>
	
	</div>
	
	<table id="dg"></table>
	
	<div id="addwin" class="easyui-window" title="Window Layout" closed="true" data-options="iconCls:'icon-save'" style="width:500px;height:400px;padding:5px;">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'center'" style="padding:10px;">
			
			</div>
		</div>
	</div>
	

	<div id="amendwin" class="easyui-window" title="Window Layout" closed="true" data-options="iconCls:'icon-save'" style="width:500px;height:300px;padding:5px;">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'center'" style="padding:10px;">
				<%-- <jsp:include page="amendOrg.jsp"/> --%>
			</div>
			
		</div>
	</div>
	
	<div id="amendStatewin" class="easyui-window" title="Window Layout" closed="true" data-options="iconCls:'icon-save'" style="width:500px;height:100px;padding:5px;">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'center'" style="padding:10px;">
				
			</div>
			
		</div>
	</div>
	
	<script type="text/javascript">
	
		$(function() {
			$.ajax({
				   type: "POST",
				   url: "queryName.do",
				   success: function(msg){
					var str = '<option value="0">请选择</option>'
						for (x in msg)
						  {
							str = str+'<option value="'+msg[x].id+'">'+msg[x].name+'</option>';
						  }
				   	$("#org_id").append(str )
				   }
			});
				
				$('#dg').datagrid({    
				    url:'employeeList.do',
				    columns:[[    
				        {field:'status',title:'员工状态',width:60,align:'right',
				        	formatter: function(value,row,index){
				        		switch(value)
				        		{
				        		case 1:
				        			return '使用';
				        		  break;
				        		case 0:
				        			return '停用';
				        		  break;
				        		default:
				        		  	return '选择状态';
				        		}
							}},   
				        {field:'login_name',title:'账号',width:60,align:'right'},
				        {field:'user_name',title:'姓名',width:60,align:'right'},
				        {field:'sex',title:'性别',width:60,align:'right',
				        	formatter: function(value,row,index){
				        		if (value==1) {
									return '男';
								}else {
									return '女';
								}
			        		}},
				        {field:'join_time',title:'入职时间',width:140,align:'right',
					        	formatter: function(value,row,index){
					        		var d = new Date(value);
					        		var str = d.toLocaleString();
									return str;
								}},
				        {field:'position_id',title:'岗位',width:60,align:'right'},
				        {field:'org_id',title:'机构',width:60,align:'right'},
				        {field:'create_time',title:'录入时间 ',width:140,
				        	formatter: function(value,row,index){
				        		var d = new Date(value);
				        		var str = d.toLocaleString();
								return str;
							}
				        },    
				        {field:'modify_time',title:'修改时间',width:140,
				        	formatter: function(value,row,index){
				        		var d = new Date(value);
				        		var str = d.toLocaleString();
								return str;
							}
				        }
				    ]]    
				});
			})
	
	function formatProgress(value){
    	if (value){
	    	var s = '<div style="width:100%;border:1px solid #ccc">' +
	    			'<div style="width:' + value + '%;background:#cc0000;color:#fff">' + value + '%' + '</div>'
	    			'</div>';
	    	return s;
    	} else {
	    	return '';
    	}
	}
	
	 function dynamicQuery() {
		var status = $("#status").val();
		var user_name = $("#user_name").val();
		var login_name = $("#login_name").val();
		var org_id = $("#org_id").val();
		
		$.ajax({
			   type: "POST",
			   url: "employeeList.do",
			   data:{
				   status:status,
				   user_name:user_name,
				   login_name:login_name,
				   org_id:org_id
			   },
			   success: function(data){
				   $('#dg').datagrid("loadData",data);
			   }
		});
		
		
	}	
	
	function addEmp(){
		
		$('#addwin').window('open');
		$('#addwin').window('refresh', 'gotoAddEmp.do');
	}
	function amendEmp(){
		 var row = $('#dg').datagrid('getSelected');
		 if (row) {
			
			$('#amendwin').window('open');
			
			$('#amendwin').window('refresh','gotoAmendEmp.do?id='+row.id);
		}else {
			alert("请选择你要修改的参数")
		}  
		
	}
	
	function amendState(index){
		 var row = $('#dg').datagrid('getSelected');
			if (row) {
				
				$('#amendStatewin').window('open');
				
				$('#amendStatewin').window('refresh','gotoAmendState.do?id='+row.id+'&status='+index);
			}else {
				alert("请选择你要修改的参数")
			} 
	}
</script>
</body>
</html>