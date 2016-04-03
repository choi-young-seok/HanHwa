package com.rs.management.dao;

import org.apache.ibatis.session.SqlSession;

import com.rs.management.dto.ManagerDTO;

public class ManagerDAO extends DAO {
	
	/* mybatis manager Login test method*/
	public ManagerDTO loginTest(String managerName) {
		SqlSession session = sqlSessionFactory.openSession();
		ManagerDTO dto = null;
		try {
			dto = session.selectOne("managerLogin", managerName);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dto;
	}
}
