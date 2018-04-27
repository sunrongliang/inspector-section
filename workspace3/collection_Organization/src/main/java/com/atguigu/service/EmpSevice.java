package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.Employee;

public interface EmpSevice {

	List<Employee> selectAll(Employee emp);

	Employee selectById(int id);

	int insertEmp(Employee emp);

	int updataEmp(Employee emp);

	void amendEmpState(int id, int status);

}
