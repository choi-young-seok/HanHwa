package com.rs.management.controller;

import com.rs.management.dto.ManagerDTO;
import com.rs.management.service.ManagerService;

public class GUITest {
	public static void main(String[] args) {
		ManagerService service = new ManagerService();
		ManagerDTO checkManager = null;
		checkManager = service.loginTest("관리자1");
		System.out.println("Manager Name : "+checkManager.getManagerName()+", ManagerPassword : "+checkManager.getManagerPassword());
	}
}
