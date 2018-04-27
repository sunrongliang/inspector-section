package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.Employee;
import com.atguigu.bean.Organization;

public interface OrgSevice {

	List<Organization> selectAll();

	int insertOrg(Organization org);

	Organization selectById(int id);

	int updataOrg(Organization org);

	void cancelOrg(int id);

	List<Organization> queryName();

	List<Employee> queryEmp();

}
