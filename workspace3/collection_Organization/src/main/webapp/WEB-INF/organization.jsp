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
	<div style="margin:10px 0;">
		<a href="javascript:add()" class="easyui-linkbutton" >增加</a>
		<a href="javascript:amend()" class="easyui-linkbutton">修改</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="cancel()">删除</a>
	</div>
	
	<table id="tr" style="width:1000px;height:400px"></table>  
	
	
	<div id="addwin" class="easyui-window" title="Window Layout" closed="true" data-options="iconCls:'icon-save'" style="width:500px;height:300px;padding:5px;">
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
	
	<div id="cancelwin" class="easyui-window" title="Window Layout" closed="true" data-options="iconCls:'icon-save'" style="width:500px;height:100px;padding:5px;">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'center'" style="padding:10px;">
				
			</div>
			
		</div>
	</div>
	
	<script type="text/javascript">
	$(function() {
		
		$('#tr').treegrid({    
		    url:'organizationList.do',    
		    idField:'id',    
		    treeField:'name',    
		    columns:[[    
		        {title:'机构名称',field:'name',width:180},    
		        {field:'type',title:'机构类型',width:60,align:'right',
		        	formatter: function(value,row,index){
		        		switch(value)
		        		{
		        		case 1:
		        			return '总公司';
		        		  break;
		        		case 2:
		        			return '分公司'
		        		  break;
		        		default:
		        		  	return '小组'
		        		}
					}
		        },   
		        {field:'post_code',title:'机构编号',width:60,align:'right'},
		        {field:'principal_id',title:'负责人',width:60,align:'right'},
		        {field:'address',title:'地址',width:60,align:'right'},
		        {field:'phone',title:'电话号码',width:80,align:'right'},
		        {field:'post_code',title:'邮政编码',width:60,align:'right'},
		        {field:'fax',title:'传真号',width:60,align:'right'},
		        {field:'create_time',title:'创建时间 ',width:140,
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
	
	function add(){
		
		$('#addwin').window('open');
		$('#addwin').window('refresh', 'gotoAddOrg.do');
	}
	function amend(){
		 var row = $('#tr').treegrid('getSelected');
		if (row) {
			
			$('#amendwin').window('open');
			
			$('#amendwin').window('refresh','gotoAmendOrg.do?id='+row.id);
		}else {
			alert("请选择你要修改的参数")
		} 
		
	}
	
	function cancel(){
		 var row = $('#tr').treegrid('getSelected');
			if (row) {
				
				$('#cancelwin').window('open');
				
				$('#cancelwin').window('refresh','gotoCancelOrg.do?id='+row.id);
			}else {
				alert("请选择你要修改的参数")
			} 
	}
</script>
</body>
</html>