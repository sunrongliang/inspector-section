package com.atguigu.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.Employee;
import com.atguigu.bean.Organization;
import com.atguigu.bean.Position;
import com.atguigu.mapper.OrgMapper;
import com.atguigu.mapper.PosMapper;
import com.atguigu.service.OrgSevice;
import com.atguigu.service.PosSevice;

@Service
public class PosSeviceImp implements PosSevice {
	
	@Autowired
	PosMapper posMapper;
	
	public List<Position> selectAll() {
		List<Position> list = posMapper.slectAll();
		return list;
	}
	
	public int insertPos(Position pos) {
		pos.setCreate_time(new Date());
		int a = posMapper.insertPos(pos);
		return a;
	}

	public Position selectById(int id) {
		// TODO Auto-generated method stub
		Position pos = posMapper.selectById(id);
		return pos;
	}

	public int updataPos(Position pos) {
		pos.setModify_time(new Date());
		int a =posMapper.updataPos(pos);
		return a;
	}

	public void cancelPos(int id) {
		 posMapper.deletPos(id);
			
		}


	/*
	public Organization selectById(int id) {
		Organization org = orgMapper.selectById(id);
		return org;
	}

	public int updataOrg(Organization org) {
		
	
	}

	
	

	public List<Employee> queryEmp() {
		List<Employee> list = orgMapper.slectAllEmp();
		return list;
	}

*/
}
