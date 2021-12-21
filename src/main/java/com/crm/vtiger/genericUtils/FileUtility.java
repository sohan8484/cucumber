package com.crm.vtiger.genericUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileUtility {
	/*
	 *author @ sohan 
	 */
	/**
	 * @This method is used to read the data from the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyKeyValue(String key)throws IOException {
		FileInputStream fis = new FileInputStream(IPathConstants.PROPERTY_FILEPATH);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}