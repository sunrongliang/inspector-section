package com.atguigu.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.Employee;
import com.atguigu.mapper.EmpMapper;
import com.atguigu.service.EmpSevice;


@Service
public class EmpSeviceImpl implements EmpSevice {
	
	@Autowired
	EmpMapper empMapper;
	
	public List<Employee> selectAll(Employee emp) {
		System.out.println(emp);
		if (emp.getStatus() != null && emp.getStatus() != 0 && emp.getStatus() !=1) {
			emp.setStatus(null);
		}
		if (emp.getOrg_id() != null && emp.getOrg_id() == 0) {
				emp.setOrg_id(null);
		}
		if (emp.getLogin_name() != null && !"".equals(emp.getLogin_name())) {
				emp.setLogin_name("%"+emp.getLogin_name()+"%");
		}
		if (emp.getUser_name() != null && !"".equals(emp.getUser_name())) {
				emp.setUser_name("%"+emp.getUser_name()+"%");
		}
		
		List<Employee> list = empMapper.slectAll(emp);
	
		return list;
	}
	
	public Employee selectById(int id) {
		Employee emp = empMapper.selectById(id);
		return emp;
	}
	
	public int insertEmp(Employee emp) {
		emp.setCreate_time(new Date());
		int a = empMapper.insertEmp(emp);
		return a;
	}
	
	public int updataEmp(Employee emp) {
		emp.setModify_time(new Date());
		int a = empMapper.updataEmp(emp);
		return a;
	
	}

	public void amendEmpState(int id, int status) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setStatus(status);
		empMapper.updataEmpState(emp);
		
	}
	

}
