package com.animal.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.animal.controller.MemberJoinController;
import com.animal.controller.MemberLogInController;
import com.animal.controller.MemberLogOutController;
import com.animal.controller.SubController;

public class ContextListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent event) {
		Map<String, SubController> controllers = new HashMap<String, SubController>();		
		
		controllers.put("/view/memberJoin.do", new MemberJoinController());
		controllers.put("/view/memberLogIn.do", new MemberLogInController());
		controllers.put("/view/memberLogOut.do", new MemberLogOutController());
		
		event.getServletContext().setAttribute("controllers", controllers);
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent event) { }
}
