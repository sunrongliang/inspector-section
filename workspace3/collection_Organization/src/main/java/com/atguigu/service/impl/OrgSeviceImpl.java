package com.atguigu.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.Employee;
import com.atguigu.bean.Organization;
import com.atguigu.mapper.OrgMapper;
import com.atguigu.service.OrgSevice;

@Service
public class OrgSeviceImpl implements OrgSevice {
	
	@Autowired
	OrgMapper orgMapper;
	
	public List<Organization> selectAll() {
		List<Organization> list = orgMapper.slectAll();
		return list;
	}

	public int insertOrg(Organization org) {
		org.setCreate_time(new Date());
		int a = orgMapper.insertOrg(org);
		return a;
	}

	public Organization selectById(int id) {
		Organization org = orgMapper.selectById(id);
		return org;
	}

	public int updataOrg(Organization org) {
		org.setModify_time(new Date());
		int a = orgMapper.updataOrg(org);
		return a;
	
	}

	public void cancelOrg(int id) {
	 orgMapper.deletOrg(id);
		
	}

	public List<Organization> queryName() {
		List<Organization> list = orgMapper.slectAll();
		return list;
	}

	public List<Employee> queryEmp() {
		List<Employee> list = orgMapper.slectAllEmp();
		return list;
	}


}
