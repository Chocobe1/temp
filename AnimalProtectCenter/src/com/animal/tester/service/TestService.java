package com.animal.tester.service;

import com.animal.tester.dao.TestDAO;
import com.animal.tester.vo.TestVO;

public class TestService {
	private static TestService service;
	private static TestDAO dao;
	
	static {
		service = new TestService();
		dao = TestDAO.getInstance();
	}
	
	private TestService() { }
	
	
	public static TestService getInstance() {
		return service;
	}
	
	
	public TestVO select(String id) {
		return dao.select(id);
	}
	
	
	public void insert(TestVO vo) {
		dao.insert(vo);
	}
	
	public void update(TestVO vo) {
		dao.update(vo);
	}
}
