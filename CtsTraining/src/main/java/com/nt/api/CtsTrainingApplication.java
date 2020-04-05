package com.nt.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.api.beans.Laptop;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class CtsTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CtsTrainingApplication.class, args);
	}

	@GetMapping("/getProducts")
	
	public List<Laptop> getLaptops(){
		System.out.println();
	return Stream.of(new Laptop(2, "HP", 8, 12000),
				  new Laptop(3, "DELL", 12, 16000),
				  new Laptop(1, "MAC", 16, 18000)).collect(Collectors.toList());
		
		
	}
	@PostMapping("/orderLaptop")
	public Laptop order(@RequestBody Laptop laptop) {
		
		return laptop;
	
		
	}
}
