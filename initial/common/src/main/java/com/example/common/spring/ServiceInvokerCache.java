package com.example.common.spring;

import java.io.InputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class ServiceInvokerCache  extends net.sf.ehcache.CacheManager {
	
	private static final Logger logger = LogManager.getLogger(ServiceInvokerCache.class);
	
	private static String cacheName = "SystemCache";
	
	public ServiceInvokerCache() {
		super();
	}
	
	public static Object getObject(String name) {
		if(logger.isDebugEnabled()) {
			logger.debug("getObject() - enter " + name);
		}
		Element element = null;
		try {
			element = CacheManager.getInstance().getCache(cacheName).get(name);
		}catch (Exception e) {
			
		}
		if(element!= null) {
			return element.getObjectValue();
		}
		return null;
	}
	
	public static void addObject(String name, Object value) {
		if(logger.isDebugEnabled()) {
			logger.debug("addObject() - enter " + name);
		}
		if(name==null || value==null) {
			return;
		}
		try {
			Element element = new Element(name, value);
			CacheManager.getInstance().getCache(cacheName).put(element);
		}catch(Exception e) {
			logger.error("addObject()", e);
		}
	}
	
	public static void createCache(InputStream inputStream) {
		if(logger.isDebugEnabled()) {
			logger.debug("createCache");
		}
		try {
	        CacheManager.create(inputStream);
		}catch(Exception e) {
			logger.error("createCache()", e);
		}
	}
	
	public static void clearObject(String name) {
		if(logger.isDebugEnabled()) {
			logger.debug("clearObject()" + name);
		}
		try {
			CacheManager.getInstance().getCache(cacheName).remove(name);
		}catch(Exception e) {
			if(logger.isDebugEnabled()) {
				logger.error("clearObject()", e);
			}
		}
	}
	   private static String generateUniqueCacheName() {
	        return "Cache_" + System.currentTimeMillis();
	    }
	   
	   public static void destroyCache() {
			if(logger.isDebugEnabled()) {
				logger.debug("createCache");
			}
			try {
		        CacheManager.getInstance().shutdown();
			}catch(Exception e) {
				logger.error("createCache()", e);
			}
		}
}
