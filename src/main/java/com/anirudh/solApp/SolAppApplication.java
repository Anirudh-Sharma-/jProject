package com.anirudh.solApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@EnableSwagger2
public class SolAppApplication {
	
	@RequestMapping("/resource")
	public List<Integer> home(){
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		return myList;
	}
	
	@GetMapping("/doCollections")
	public void practiseCollections() {
		List<String> list = new ArrayList<>();
		list.add("d");
		
		List<Integer> l = new ArrayList<>();
		l.add(1);
		int addMe = 5;
		l.add(addMe);
		
		
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SolAppApplication.class, args);
	}
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}

}

