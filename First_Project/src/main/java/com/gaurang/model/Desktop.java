package com.gaurang.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

	@Override
	public void compile() {
		// TODO Auto-generated method stub
		System.out.println("compiling using desktop...");
	}

}
