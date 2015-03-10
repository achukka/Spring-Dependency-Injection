package com.paypal.java.spring.di.app;

import org.springframework.beans.factory.BeanFactory;
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

		BeanFactory beanFactory = applicationContext;
		OutputGeneratorHelper outputGeneratorHelper = (OutputGeneratorHelper) beanFactory
				.getBean("outputGeneratorHelper");
		System.out
				.println(" <<<<<<<<<<<<<<<<<<<<<<<<<< Using Annotations Ouput Starts>>>>>>>>>>>>>>>>>>>>>>>>>>");
		outputGeneratorHelper.generateOutput();

		for (String arg : args) {
			System.out.println("The arg is :" + arg);
		}
	}
}
