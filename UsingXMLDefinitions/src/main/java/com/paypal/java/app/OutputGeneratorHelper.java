package com.paypal.java.app;

import com.paypal.java.api.OutputGenerator;

public class OutputGeneratorHelper {
	OutputGenerator outputGenerator;

	String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
			+ "<Emp id=\"1\"><name>Aditya</name><age>22</age>\n"
			+ "<gen>Male</gen></Emp>";
	String jsonString = "{\"num\":100,  \"name\":\"foo\"}";

	public void generateOutput() {
		outputGenerator.JSONGenerator(jsonString);
		outputGenerator.XMLGenerator(xmlString);
	}

	// Via Constructor
	public void setOutputGenerator(OutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
