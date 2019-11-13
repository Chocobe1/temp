package com.animal.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.animal.controller.MemberJoinController;
import com.animal.controller.MemberLeaveController;
import com.animal.controller.MemberLogInController;
import com.animal.controller.MemberLogOutController;
import com.animal.controller.SubController;

public class ContextListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent event) {
		Map<String, SubController> controllers = new HashMap<String, SubController>();		
		
		controllers.put("/view/memberView/memberJoin.do", new MemberJoinController());
		controllers.put("/view/memberView/memberLogIn.do", new MemberLogInController());
		controllers.put("/view/memberView/memberLogOut.do", new MemberLogOutController());
		controllers.put("/view/memberView/memberLeave.do", new MemberLeaveController());
		
		event.getServletContext().setAttribute("controllers", controllers);
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent event) { }
}
