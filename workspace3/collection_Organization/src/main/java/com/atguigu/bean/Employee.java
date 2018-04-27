package com.atguigu.bean;

import java.util.Date;

public class Employee {
    private Integer id;

    private String salt;

    private Date create_time;

    private Date modify_time;

    private Integer version;

    private String number;

    private Integer status;

    private String user_name;

    private String personal_id;

    private Integer sex;

    private Date birthday;

    private String nation;

    private String password;

    private String login_name;

    private Integer married;

    private String province;

    private String city;

    private String email;

    private Date join_time;

    private String position_id;

    private Integer org_id;

    private String cc_login;

    private String cc_pwd;

    private String cc_server;

    private String cc_phone;

    private String contact_mode;

    private String attach_org_id;

    private String attach_entrust_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPersonal_id() {
		return personal_id;
	}

	public void setPersonal_id(String personal_id) {
		this.personal_id = personal_id;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public Integer getMarried() {
		return married;
	}

	public void setMarried(Integer married) {
		this.married = married;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoin_time() {
		return join_time;
	}

	public void setJoin_time(Date join_time) {
		this.join_time = join_time;
	}

	public String getPosition_id() {
		return position_id;
	}

	public void setPosition_id(String position_id) {
		this.position_id = position_id;
	}

	public Integer getOrg_id() {
		return org_id;
	}

	public void setOrg_id(Integer org_id) {
		this.org_id = org_id;
	}
	public String getCc_login() {
		return cc_login;
	}

	public void setCc_login(String cc_login) {
		this.cc_login = cc_login;
	}

	public String getCc_pwd() {
		return cc_pwd;
	}

	public void setCc_pwd(String cc_pwd) {
		this.cc_pwd = cc_pwd;
	}

	public String getCc_server() {
		return cc_server;
	}

	public void setCc_server(String cc_server) {
		this.cc_server = cc_server;
	}

	public String getCc_phone() {
		return cc_phone;
	}

	public void setCc_phone(String cc_phone) {
		this.cc_phone = cc_phone;
	}

	public String getContact_mode() {
		return contact_mode;
	}

	public void setContact_mode(String contact_mode) {
		this.contact_mode = contact_mode;
	}

	public String getAttach_org_id() {
		return attach_org_id;
	}

	public void setAttach_org_id(String attach_org_id) {
		this.attach_org_id = attach_org_id;
	}

	public String getAttach_entrust_id() {
		return attach_entrust_id;
	}

	public void setAttach_entrust_id(String attach_entrust_id) {
		this.attach_entrust_id = attach_entrust_id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salt=" + salt + ", create_time=" + create_time + ", modify_time=" + modify_time
				+ ", version=" + version + ", number=" + number + ", status=" + status + ", user_name=" + user_name
				+ ", personal_id=" + personal_id + ", sex=" + sex + ", birthday=" + birthday + ", nation=" + nation
				+ ", password=" + password + ", login_name=" + login_name + ", married=" + married + ", province="
				+ province + ", city=" + city + ", email=" + email + ", join_time=" + join_time + ", position_id="
				+ position_id + ", org_id=" + org_id + ", cc_login=" + cc_login + ", cc_pwd=" + cc_pwd + ", cc_server="
				+ cc_server + ", cc_phone=" + cc_phone + ", contact_mode=" + contact_mode + ", attach_org_id="
				+ attach_org_id + ", attach_entrust_id=" + attach_entrust_id + "]";
	}

	
   
}