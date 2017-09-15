package com.zoneland.quartz.core;

import org.apache.log4j.Logger;


/**
 * 客户服务类
 */
public class CustService {

	private Logger logger = Logger.getLogger(getClass());
	
	public void save(String custName){
		
		// do persistence cust ...
		logger.info(" [" + custName + "] saved success!");
	}
}
