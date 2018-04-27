package com.atguigu.bean;

import java.util.Date;

/**
 * @author srl
 *
 */
public class Organization {

	  public  Integer  id;                    
	  public  Date     create_time;        
	  public  Date     modify_time;       
	  public  Integer  version;           
	  public  Integer  status;                  
	  public  String   name   ;      
	  public  Integer  parent_id;    
	  public  String   address ;      
	  public  String   phone  ;      
	  public  String   post_code ;     
	  public  String   fax;       
	  public  Integer   type;       
	  public  Integer  order_no;     
	  public  String   code ;       
	  public  String   principal_id;    
	  public  String   path ;
	  public  Integer  _parentId;
	  
	  
	  public Integer get_parentId() {
			return parent_id;
		}


	public void set_parentId(Integer _parentId) {
		this._parentId = _parentId;
	}

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Organization(Integer id, Date create_time, Date modify_time, Integer version, Integer status, String name,
			int parent_id, String address, String phone, String post_code, String fax, Integer type, Integer order_no,
			String code, String principal_id, String path) {
		super();
		this.id = id;
		this.create_time = create_time;
		this.modify_time = modify_time;
		this.version = version;
		this.status = status;
		this.name = name;
		this.parent_id = parent_id;
		this.address = address;
		this.phone = phone;
		this.post_code = post_code;
		this.fax = fax;
		this.type = type;
		this.order_no = order_no;
		this.code = code;
		this.principal_id = principal_id;
		this.path = path;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public Integer getVersion() {
		return version;
	}


	public void setVersion(Integer version) {
		this.version = version;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getParent_id() {
		return parent_id;
	}


	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPost_code() {
		return post_code;
	}


	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}


	public Integer getOrder_no() {
		return order_no;
	}


	public void setOrder_no(Integer order_no) {
		this.order_no = order_no;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getPrincipal_id() {
		return principal_id;
	}


	public void setPrincipal_id(String principal_id) {
		this.principal_id = principal_id;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	@Override
	public String toString() {
		return "Organization [id=" + id + ", create_time=" + create_time + ", modify_time=" + modify_time + ", version="
				+ version + ", status=" + status + ", name=" + name + ", parent_id=" + parent_id + ", address="
				+ address + ", phone=" + phone + ", post_code=" + post_code + ", fax=" + fax + ", type=" + type
				+ ", order_no=" + order_no + ", code=" + code + ", principal_id=" + principal_id + ", path=" + path
				+ "]";
	}       
	 
	
	
	  
	  
}
