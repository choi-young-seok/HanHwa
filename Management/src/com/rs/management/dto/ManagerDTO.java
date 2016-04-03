package com.rs.management.dto;

public class ManagerDTO {
	private String managerNO;
	private String managerName;
	private String managerPassword;
	public ManagerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ManagerDTO(String managerNO, String managerName, String managerPassword) {
		super();
		this.managerNO = managerNO;
		this.managerName = managerName;
		this.managerPassword = managerPassword;
	}
	public String getManagerNO() {
		return managerNO;
	}
	public void setManagerNO(String managerNO) {
		this.managerNO = managerNO;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
}
