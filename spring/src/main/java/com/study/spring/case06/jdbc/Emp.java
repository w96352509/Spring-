package com.study.spring.case06.jdbc;

import java.util.Date;

//Entity
public class Emp {
	private Integer eid;
	private String ename;
	private Integer age;
	private Date createDate;

	public Emp() {

	}

	public Emp( String ename, Integer age) {

		
		this.ename = ename;
		this.age = age;
		
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", age=" + age + ", createDate=" + createDate + "]";
	}

}
