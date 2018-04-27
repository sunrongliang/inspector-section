package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.Employee;
import com.atguigu.bean.Organization;

public interface OrgMapper {

	List<Organization> slectAll();

	int insertOrg(Organization org);

	Organization selectById(int id);

	int updataOrg(Organization org);

	void deletOrg(int id);

	List<Employee> slectAllEmp();



}
