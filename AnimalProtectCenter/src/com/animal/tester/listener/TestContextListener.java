package com.animal.tester.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.animal.controller.SubController;
import com.animal.tester.controller.TestDeleteController;
import com.animal.tester.controller.TestInsertController;
import com.animal.tester.controller.TestSelectController;
import com.animal.tester.controller.TestUpdateController;

public class TestContextListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent event) {
		Map<String, SubController> controllers = new HashMap<String, SubController>();		
		
		controllers.put("/jspTester/testInsert.testDo", new TestInsertController());
		controllers.put("/jspTester/testSelect.testDo", new TestSelectController());
		controllers.put("/jspTester/testUpdate.testDo", new TestUpdateController());
		controllers.put("/jspTester/testDelete.testDo", new TestDeleteController());
		
		event.getServletContext().setAttribute("controllers", controllers);
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent event) { }
}
