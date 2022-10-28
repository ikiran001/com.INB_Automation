package com.INB.utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.INB.constants.FrameworkConstants;
import com.INB.enums.ConfigProperties;
import com.INB.exceptions.PropertyFileUsageException;

public class PropertyUtils {

	private PropertyUtils() {

	}

	private static Properties property=new Properties();
	private static final Map<String, String> CONFIGMAP=new HashMap<String, String>();

	static {
		try(FileInputStream file=new FileInputStream(FrameworkConstants.getConfigFilePath().trim())) {

			property.load(file);

			for(Object key : property.keySet()) {
				CONFIGMAP.put(String.valueOf(key), String.valueOf(property.get(key)));

			}

		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();

		}
	}

	public static String get(ConfigProperties key)  {
		if(Objects.isNull(key.name().toLowerCase()) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
			throw new PropertyFileUsageException("Property name "+key+" is not available in configuration file ");
		}
		return CONFIGMAP.get(key.name().toLowerCase());
	}

	/*
	 * public static String getConfigValue(String key) throws Exception {
	 * 
	 * 
	 * if(Objects.isNull(property.getProperty(key)) || Objects.isNull(key)) { throw
	 * new
	 * Exception("Property name "+key+" is not available in configuration file "); }
	 * 
	 * return property.getProperty(key); }
	 */

}
