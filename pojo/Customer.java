package com.hnbemc.pojo;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private Integer id;
	private String username;
	private String jobs;
	private String phone;
	private Integer start;            // 起始行
	private Integer rows;             // 所取行数
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJobs() {
		return jobs;
	}
	public void setJobs(String jobs) {
		this.jobs = jobs;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", jobs=" + jobs + ", phone=" + phone + ", start="
				+ start + ", rows=" + rows + "]";
	}
	
	
}
