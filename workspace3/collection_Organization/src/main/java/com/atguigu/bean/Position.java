package com.atguigu.bean;

import java.util.Date;

import javax.print.DocFlavor.STRING;

public class Position {
	private Integer id  ;            //  varchar(32)  'id',
	private String name  ;           //  varchar(100)   '职位名称',
	private Integer parent_id ;      //  varchar(32)   '上级ID',
	private Integer order_no ;       //  int(10)  '排序号',
	private String description;      //  varchar(500)   '描述',
	private Integer type   ;         //  varchar(10)   '岗位类型 对应字典1客服 2员工 3主任 4经理 5总监',
	private Date create_time ;       //  datetime   '创建时间',
	private Date modify_time ;       //  datetime   '修改时间',
	private Integer _parentId;
	public Integer get_parentId() {
		return parent_id;
	}
	public void set_parentId(Integer _parentId) {
		this._parentId = _parentId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getOrder_no() {
		return order_no;
	}
	public void setOrder_no(Integer order_no) {
		this.order_no = order_no;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	
	 
}
