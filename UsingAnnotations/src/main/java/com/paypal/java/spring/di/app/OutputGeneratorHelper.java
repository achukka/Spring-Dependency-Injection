package com.paypal.java.spring.di.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.java.spring.di.api.OutputGenerator;

@Service
public class OutputGeneratorHelper {

	public @Autowired
	OutputGenerator outputGenerator;

	String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
			+ "<Emp id=\"1\"><name>Aditya</name><age>22</age>\n"
			+ "<gen>Male</gen></Emp>";
	String jsonString = "{\"num\":100,  \"name\":\"foo\"}";

	public void generateOutput() {
		outputGenerator.jsonGenerator(jsonString);
		outputGenerator.xmlGenerator(xmlString);
	}

	// Via Constructor
	public void setOutputGenerator(OutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
