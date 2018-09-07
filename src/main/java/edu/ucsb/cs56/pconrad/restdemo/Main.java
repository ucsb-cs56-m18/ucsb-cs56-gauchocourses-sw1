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

public class Main {
		
	public static Course json2Course(String json) throws JsonParseException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		NewCoursePayload creation = mapper.readValue(json, NewCoursePayload.class);
		if (!creation.isValid()) {
			return null;
		} else {
		    Course c = new Course();
		    c.setCapacity(creation.getCapacity());
		    c.setCourse_id(creation.getCourse_id());
		    c.setCourse_title(creation.getCourse_title());
		    c.setDays(creation.getDays());
		    c.setEnrollment(creation.getEnrollment());
		    c.setInstructor(creation.getInstructor());
		    c.setLocation(creation.getLocation());
		    c.setStatus(creation.getStatus());
		    c.setTimes(creation.getTimes());

		    return c;
		}
	}
	
	public static void main(String[] args) {
	    System.out.println("Hello");
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

    
