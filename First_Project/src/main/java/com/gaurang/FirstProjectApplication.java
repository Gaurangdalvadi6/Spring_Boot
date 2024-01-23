package com.gaurang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.gaurang.model.Alien;
import com.gaurang.model.Laptop;
import com.gaurang.service.LaptopService;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		
		LaptopService service = context.getBean(LaptopService.class);
		
		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);
		
//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();
	}

}
