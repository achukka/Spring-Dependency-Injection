package com.paypal.java.spring.di.impl;

import org.springframework.stereotype.Service;

import com.paypal.java.spring.di.api.OutputGenerator;

@Service
public class OutputGeneratorImpl implements OutputGenerator{

	@Override
	public void jsonGenerator(String input) {
		System.out.println("In JSON Generator with input:"+input);
	}

	@Override
	public void xmlGenerator(String input) {
		System.out.println("In XML Generator with input:"+input);
	}

}
