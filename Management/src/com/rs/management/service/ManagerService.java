package com.rs.management.service;

import com.rs.management.dao.ManagerDAO;
import com.rs.management.dto.ManagerDTO;

public class ManagerService {
	public ManagerDTO loginTest(String managerName) {
		ManagerDAO dao = new ManagerDAO();
		return dao.loginTest(managerName);
	}
}
