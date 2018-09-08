package edu.ucsb.cs56.pconrad.restdemo;

// SEE: http://sparkjava.com/tutorials/reducing-java-boilerplate

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.DeserializationFeature;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collector;
import java.util.Scanner;

import java.nio.file.Paths;
import java.nio.file.Files; 

public class Main {
		
	public static AllCourseData json2AllCourseData(String json) throws JsonParseException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		AllCourseData acd =  mapper.readValue(json, AllCourseData.class);
		return acd;
	}

	// https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
	// Using #6: Read a text file as String in Java:
	
	public static String readFileAsString(String fileName) throws Exception {
		String data = ""; 
		data = new String(Files.readAllBytes(Paths.get(fileName))); 
		return data; 
	} 

	public static void promptEnterKey(){
		System.out.println("Press \"ENTER\" to continue...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

	
	public static void main(String[] args)  {
		try {
			String data = readFileAsString("data/courseData.json"); 
			AllCourseData acd = json2AllCourseData(data);
			System.out.println("acd = " + acd);

			promptEnterKey();
		    String backToJson = dataToJson(acd);			
			System.out.println("backToJson = " + acd);

		} catch (Exception e) {
			System.err.println("I could not read the file: " + e.toString());
		}
	}
	
    	
    public static String dataToJson(Object data) {
	try {
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.enable(SerializationFeature.INDENT_OUTPUT);
	    StringWriter sw = new StringWriter();
	    mapper.writeValue(sw, data);
	    return sw.toString();
	} catch (IOException e){
	    throw new RuntimeException("IOException from a StringWriter?");
	}
    }


}

    
