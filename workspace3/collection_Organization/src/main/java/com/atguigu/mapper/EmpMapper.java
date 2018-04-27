package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.Employee;

public interface EmpMapper {

	List<Employee> slectAll(Employee emp);

	Employee selectById(int id);

	int insertEmp(Employee emp);

	int updataEmp(Employee emp);

	void updataEmpState(Employee emp);


}
