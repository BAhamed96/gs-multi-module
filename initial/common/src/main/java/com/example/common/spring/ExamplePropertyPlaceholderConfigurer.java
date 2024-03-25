package com.example.common.spring;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class ExamplePropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
	//private static Logger logger = LogManager.getLogger(ExamplePropertyPlaceholderConfigurer.class.getName());

	@Override
	protected void loadProperties(Properties props) throws IOException {

		super.loadProperties(props);

		InputStream hostIs = null;

		try {
			hostIs = new FileSystemResource(System.getProperty("catalina.base") + "/conf/application.properties").getInputStream();
			props.load(hostIs);

			setProperties(props);
		} catch (FileNotFoundException fnfe) {
			hostIs = new FileSystemResource(System.getProperty("testClassProperties") + "/application.properties").getInputStream();
			props.load(hostIs);

			setProperties(props);
		} catch (IOException ex) {
			//logger.error("Reading the properties file", ex);
			throw ex;
		} finally {
			if (hostIs != null) {
				hostIs.close();
			}
		}
	}
}
