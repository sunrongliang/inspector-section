package com.atguigu.bean;

import java.util.Date;

import javax.print.DocFlavor.STRING;

public class Position {
	private Integer id  ;            //  varchar(32)  'id',
	private String name  ;           //  varchar(100)   'ְλ����',
	private Integer parent_id ;      //  varchar(32)   '�ϼ�ID',
	private Integer order_no ;       //  int(10)  '�����',
	private String description;      //  varchar(500)   '����',
	private Integer type   ;         //  varchar(10)   '��λ���� ��Ӧ�ֵ�1�ͷ� 2Ա�� 3���� 4���� 5�ܼ�',
	private Date create_time ;       //  datetime   '����ʱ��',
	private Date modify_time ;       //  datetime   '�޸�ʱ��',
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
