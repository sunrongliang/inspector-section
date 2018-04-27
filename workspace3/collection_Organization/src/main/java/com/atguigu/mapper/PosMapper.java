package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.Position;

public interface PosMapper {

	List<Position> slectAll();

	int insertPos(Position pos);

	Position selectById(int id);

	int updataPos(Position pos);

	void deletPos(int id);

}
