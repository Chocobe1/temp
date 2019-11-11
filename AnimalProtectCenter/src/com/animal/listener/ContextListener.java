package com.animal.listener;

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

public class ContextListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent event) {
		Map<String, SubController> controllers = new HashMap<String, SubController>();		
		
		controllers.put("/jspTester/testInsert.do", new TestInsertController());
		controllers.put("/jspTester/testSelect.do", new TestSelectController());
		controllers.put("/jspTester/testUpdate.do", new TestUpdateController());
		controllers.put("/jspTester/testDelete.do", new TestDeleteController());
		
		event.getServletContext().setAttribute("controllers", controllers);
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent event) { }
}
