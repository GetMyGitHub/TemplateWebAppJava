package org.getmygithub.webapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StartupListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		System.out.println("app started");
	}

	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("app ended");

	}

}
