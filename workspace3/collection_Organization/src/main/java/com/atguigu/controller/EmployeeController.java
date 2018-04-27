package com.atguigu.controller;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.bean.Employee;

import com.atguigu.service.EmpSevice;



@Controller
public class EmployeeController {
	
	@Autowired
	EmpSevice empSevice;

	@RequestMapping("employeeList")
	@ResponseBody
	public List<Employee> employeeList( Employee emp) {
		//查询组织机构列表，返回list
		List<Employee> empList= empSevice.selectAll(emp);
		return empList;
	
	}
	@RequestMapping("gotoAddEmp")
	private String gotoAddEmp() {return "emp/addEmp";}
	
	@RequestMapping("gotoAmendEmp")
	private String gotoamendOrg(int id , ModelMap map) {
		//根据id查询数据
		Employee emp = empSevice.selectById(id);
		map.put("emp", emp);
		return "emp/amendEmp";
	}
	
	@RequestMapping("addEmp")
	private String addOrg(Employee emp) {
		int count = empSevice.insertEmp(emp);
		return "redirect:/index.do";
	}
	
	@RequestMapping("amendEmp")
	private String amendEmp(Employee emp) {
		//更新Organization数据;
		int count = empSevice.updataEmp(emp);
		return "redirect:/index.do";
	}
	
	
	@RequestMapping("gotoAmendState")
	private String gotoAmendState(int id , int status , ModelMap map ) {
		map.put("status", status);
		map.put("id", id );
		return "emp/amendEmpState";
	}
	
	
	@RequestMapping("amendEmpState")
	private String amendEmpState(int id , int status ) {
		empSevice.amendEmpState(id,status);
		return "redirect:/index.do";
	}
}
