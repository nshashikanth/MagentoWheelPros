package com.wheelpros.web.utils;

import java.io.FileReader;
import java.util.Properties;

public class EnvConfigMagento {

	
private static Properties prop;
	
	public static void loadConfigFile() {
		FileReader reader;
		try {
			reader = new FileReader("src/test/resources/envconfigmagento.properties");
			prop = new Properties();  
			prop.load(reader); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to ready env details");
		}  
	}
	
	public static String getProperty(String propertyName) {
		if(prop.containsKey(propertyName)) {
			return prop.getProperty(propertyName);
		}else {
			throw new RuntimeException(propertyName+ " property is not defined in env config file");
		}
	}
	
}
