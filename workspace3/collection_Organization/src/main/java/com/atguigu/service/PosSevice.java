package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.Position;

public interface PosSevice {

	List<Position> selectAll();

	int insertPos(Position pos);

	Position selectById(int id);

	int updataPos(Position pos);

	void cancelPos(int id);


}
