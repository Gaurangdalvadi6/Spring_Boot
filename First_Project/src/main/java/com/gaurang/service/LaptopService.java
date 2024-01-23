package com.gaurang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurang.model.Laptop;

@Service
public class LaptopService {

	@Autowired
	private LaptopRepository repo;
	
	
	public void addLaptop(Laptop lap) {
		repo.save(lap);
	}
	
	public boolean isGoodForProg() {
		return true;
	}

}
