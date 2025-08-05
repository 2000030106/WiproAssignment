package com.springbootprograms;

import org.springframework.stereotype.Component;

@Component("abc")
public class ClassABC  implements InterfacePQR
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi... I am ClassABC");
	}

}
