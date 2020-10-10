package com.hsbc.controller;

import com.hsbc.model.service.ProductJson;

public class Demo {
	
	public Demo() {
		new ProductJson().readJsonFile();
	}
	public static void main(String[] args) {
		new Demo();
		System.out.println("Works");
	}
	

}
