package com.atguigu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.bean.Employee;
import com.atguigu.bean.Organization;
import com.atguigu.service.OrgSevice;


@Controller
public class OrganizationController {
	
	@Autowired
	OrgSevice orgSevice;
	
	@RequestMapping("organizationList")
	@ResponseBody
	public Map<String, Object> organizationList() {
		//查询组织机构列表，返回list
		List<Organization> orgList= orgSevice.selectAll();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", orgList);
		return map;
	
	}
	@RequestMapping("gotoAddOrg")
	private String gotoAddOrg() {return "org/addOrg";}
	
	@RequestMapping("addOrg")
	private String addOrg(Organization org) {
		//插入Organization数据;
		
		int count = orgSevice.insertOrg(org);
		return "redirect:/index.do";
	}

	@RequestMapping("gotoAmendOrg")
	private String gotoamendOrg(int id , ModelMap map) {
		//根据id查询数据
		Organization org = orgSevice.selectById(id);
		map.put("org", org);
		return "org/amendOrg";
	}
	
	@RequestMapping("amendOrg")
	private String amendOrg(Organization org) {
		//更新Organization数据;
		int count = orgSevice.updataOrg(org);
		return "redirect:/index.do";
	}
	
	@RequestMapping("gotoCancelOrg")
	private String gotoCancelOrg(int id , ModelMap map) {
		
		map.put("id", id );
		return "org/CancelOrg";
	}
		
	@RequestMapping("cancelOrg")
	private String cancelOrg(int id) {
		
		orgSevice.cancelOrg(id);
		return "redirect:/index.do";
	}
	
	@RequestMapping("queryName")
	@ResponseBody
	private List<Organization> queryName() {
		
		List<Organization> list = orgSevice.queryName();
		return list;
	}
	
	@RequestMapping("queryEmp")
	@ResponseBody
	private List<Employee> queryEmp() {
		
		List<Employee> list = orgSevice.queryEmp();
		return list;
	}
	
}
