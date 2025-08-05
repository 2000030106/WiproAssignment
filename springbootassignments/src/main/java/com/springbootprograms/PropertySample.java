package com.springbootprograms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertySample 
{
	@Value("${integer.value}")
	private Integer intvalue;
	@Value("${decimal.value}")
	private Double doublevalue;
	@Value("${boolean.value}")
	private Boolean booleanvalue;
	
	public void displayvalues()
	{
		System.out.println("Integer Value:"+intvalue);
		System.out.println("Double Value:"+doublevalue);
		System.out.println("Boolean Value:"+booleanvalue);
	}

}
