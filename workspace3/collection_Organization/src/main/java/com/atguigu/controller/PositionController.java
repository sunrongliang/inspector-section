package com.atguigu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.bean.Position;
import com.atguigu.service.PosSevice;


@Controller
public class PositionController {
	
	@Autowired
	PosSevice posSevice;
	
	@RequestMapping("position")
	@ResponseBody
	public Map<String, Object> organizationList() {
		//查询组织机构列表，返回list
		List<Position> posList= posSevice.selectAll();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", posList);
		return map;
	
	}
	@RequestMapping("gotoAddPos")
	private String gotoAddPos() {return "pos/addPos";}
	
	
	@RequestMapping("queryPosName")
	@ResponseBody
	private List<Position> queryPorName() {
		
		List<Position> list = posSevice.selectAll();
		return list;
	}
	
	@RequestMapping("addPos")
	private String addPos(Position pos) {
		//插入Organization数据;
		int count = posSevice.insertPos(pos);
		return "redirect:/index.do";
	}
	
	

	@RequestMapping("gotoAmendPos")
	private String gotoAmendPos(int id , ModelMap map) {
		//根据id查询数据
	
		Position pos = posSevice.selectById(id);
	
		map.put("pos", pos);
		return "pos/amendPos";
	}

		@RequestMapping("admendPos")
		private String amendOrg(Position pos) {
			//更新Organization数据;
			int count = posSevice.updataPos(pos);
			return "redirect:/index.do";
		}

		@RequestMapping("gotoCancelPos")
		private String gotoCancelPos(int id , ModelMap map) {map.put("id", id );return "pos/CancelPos";	}
		
		
		

	@RequestMapping("cancelPos")
	private String cancelPos(int id) {
		
		posSevice.cancelPos(id);
		return "redirect:/index.do";
	}
	

	/*
	@RequestMapping("queryEmp")
	@ResponseBody
	private List<Employee> queryEmp() {
		
		List<Employee> list = orgSevice.queryEmp();
		return list;
	}*/
	
}
