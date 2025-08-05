package com.springbootprograms;

import org.springframework.stereotype.Component;

@Component("xyz")
public class ClassXYZ implements InterfacePQR
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi... I am ClassXYZ");
	}

}
