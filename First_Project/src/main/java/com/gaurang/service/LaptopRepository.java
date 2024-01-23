package com.gaurang.service;

import org.springframework.stereotype.Repository;

import com.gaurang.model.Laptop;

@Repository
public class LaptopRepository {

	public void save(Laptop lap) {
		System.out.println("save in database...");
	}
}
