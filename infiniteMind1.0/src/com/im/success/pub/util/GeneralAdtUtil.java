package com.im.success.pub.util;

import java.io.IOException;
import java.util.Properties;

public class GeneralAdtUtil {

	private static GeneralAdtUtil instance;
	
	private Properties prop;
	
	private GeneralAdtUtil(){
		reloadPropertiesFile();
	}
	
	public static GeneralAdtUtil getInstance()
	{
		if(instance == null)
			synchronized (instance) {
				if(instance == null)
					instance = new GeneralAdtUtil(); 
				
			}
		return instance;
	}
	
	
	private void reloadPropertiesFile() {
		prop = new Properties();
		try {
			prop.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("./conf/properties/sys.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getValueByKey(String key) {
		String value = null;
		value = prop.getProperty(key);
		return value;
	}

	public String getAdtID()
	{
		String adtID = GeneralAdtUtil.getInstance().getValueByKey("adt.type.id");
		
		//一级目录 4位数
		
		//二级以上目录 3位数
		
		//
		
		return adtID;
		
	}
}
