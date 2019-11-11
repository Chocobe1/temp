package com.animal.tester.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.animal.tester.dbConnection.DBCP;
import com.animal.tester.vo.TestVO;


public class TestDAO {
	private static TestDAO dao;
	
	static {
		dao = new TestDAO();
	}
	
	private TestDAO() { }
	
	
	public static TestDAO getInstance() {
		return dao;
	}
	
	
	public TestVO select(String id) {
		Connection conn = null;
		PreparedStatement preStatement = null;
		ResultSet resultSet = null;				
		
		TestVO vo = null;
		
		try {
			String sql = "SELECT * FROM TEST WHERE ID=?";
			conn = DBCP.getConnection();
			preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, id);
			resultSet = preStatement.executeQuery();
			
			if(resultSet.next()) {
				vo = new TestVO();
				vo.setId(resultSet.getString("ID"));
				vo.setPassword(resultSet.getString("PASSWORD"));
			}
			
		} catch(SQLException e) {
			System.out.println("TestDAO 에러 - select() : " + e.getMessage());
			
		} finally {
			DBCP.close(conn, preStatement, resultSet);
		}
		
		return vo;
	}
	
	
	public void insert(TestVO vo) {
		Connection conn = null;
		PreparedStatement preStatement = null;
		
		try {
			String sql = "INSERT INTO TEST(ID, PASSWORD) VALUES(?, ?)";
			conn = DBCP.getConnection();
			preStatement = conn.prepareStatement(sql);
			
			preStatement.setString(1, vo.getId());
			preStatement.setString(2, vo.getPassword());
			preStatement.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println("TestDAO 에러 - insert() : " + e.getMessage());
			
		} finally {
			DBCP.close(conn, preStatement);
		}
	}
}
