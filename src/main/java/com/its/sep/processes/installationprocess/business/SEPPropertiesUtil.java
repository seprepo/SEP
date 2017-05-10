package com.its.sep.processes.installationprocess.business;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SEPPropertiesUtil {
	 
	private static final String COMMON_RESSOURCES_PROPERTIES_FILE = "commonRessourcesKie.properties";
	 public static Object getValueFromProperties(String key) {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		Properties properties = new Properties();
 
		 
		InputStream inCommonsRessourcesProperties = null;
		try {

			inCommonsRessourcesProperties = (InputStream) classloader
					.getResourceAsStream(COMMON_RESSOURCES_PROPERTIES_FILE);
		 
			// inCommonRessourcesProperties = new
			// FileInputStream(COMMON_RESSOURCES_PROPERTIES_FILE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
	 
			properties.load(inCommonsRessourcesProperties);
			Object object = properties.get(key);
	 
			return object;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
		return null;
	}

	public static Properties getValueFromPropertiesFile(String fileName) {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		Properties properties = new Properties();
		InputStream inCommonRessourcesProperties = null;
		try {
			inCommonRessourcesProperties = (InputStream) classloader.getResourceAsStream(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			properties.load(inCommonRessourcesProperties);

			return properties;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
