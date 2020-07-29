package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO
			Student theStudent = 
					mapper.readValue(new File("data/sample-lite.json"), Student.class);
			
			System.out.println("Student Name from JSON file>> " + theStudent.getFirstName());  
			
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
