package com.paypal.java.spring.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		OutputGeneratorHelper outputGeneratorHelper = (OutputGeneratorHelper) applicationContext
				.getBean("OutputGeneratorHelper");
		System.out.println(" <<<<<<<<<<<<<<<<<<<<<<<<<<Ouput Starts>>>>>>>>>>>>>>>>>>>>>>>>>>");
		outputGeneratorHelper.generateOutput();

		for(String arg:args)
		{
			System.out.println("arg:"+arg);
		}
	}
}
