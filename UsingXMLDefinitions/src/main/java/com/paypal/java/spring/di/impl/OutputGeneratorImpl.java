package com.paypal.java.spring.di.impl;

import com.paypal.java.spring.di.api.OutputGenerator;

public class OutputGeneratorImpl implements OutputGenerator {

	public void JSONGenerator(String jsonInput) {
		System.out.println("We are inside JSON Generator with input: "
				+ jsonInput);
	}

	public void XMLGenerator(String xmlString) {
		System.out.println("We are inside XML Generator with input: "
				+ xmlString);
	}
}
