package com.example.common.spring;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class StartupServiceInvokerListener implements ServletContextListener {

//	private static final Logger logger = LogManager.getLogger(StartupServiceInvokerListener.class);
//
//	public void contextInitialized(ServletContextEvent event) {
//		logger.debug("contextInitialized() - enter");
//
//		try {
//			
//			System.out.println("FRED " + "ehcacheMasterData-" + event.getServletContext().getContextPath().substring(1) + ".xml");
//			
//			File configDir = new File(System.getProperty("catalina.base"), "conf");
//			File configFile = new File(configDir, "ehcacheMasterData-" + event.getServletContext().getContextPath().substring(1) + ".xml");
//			InputStream stream = new FileInputStream(configFile);
//			ServiceInvokerCache.createCache(stream);
//		} catch (FileNotFoundException e) {
//			logger.error("Cache properties", e);
//		}
//
//		logger.debug("contextInitialized() - exit");
//	}
//
//	public void contextDestroyed(ServletContextEvent event) {
//		logger.debug("contextDestroyed() - enter");
//
//		ServiceInvokerCache.destroyCache();
//
//		logger.debug("contextDestroyed() - exit");
//	}
	

}