package com.zoneland;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 启动程序
 */
public class Start {

	/**
	 * @param args
	 */
	private Logger logger = Logger.getLogger(getClass());
	
	public static void main(String[] args) {
		System.out.println("===============启动程序，开始获得Spring中定义的Bean实例=============");
		new ClassPathXmlApplicationContext("applicationContext-quartz.xml"); //获得Spring中定义的Bean实例
		System.out.println("==================成功获得Spring中定义的Bean实例=============");
	}

}
