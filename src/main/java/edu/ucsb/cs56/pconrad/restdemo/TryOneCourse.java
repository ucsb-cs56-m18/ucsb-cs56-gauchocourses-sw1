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

public class TryOneCourse {
		
	public static Course jsonToCourse(String json) throws JsonParseException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	    Course c = mapper.readValue(json, Course.class);
		System.out.println("Course = " + c.toString());
		return c;
	}
	
	
	public static void main(String[] args) {
	    String json2 =         "       {" +
        "          \"capacity\": 105," +
        "          \"course_id\": \"CMPSC 24\"," +
        "          \"course_title\": \"PROBLEM SOLVING II\"," +
        "          \"days\": \"T R\"," +
        "          \"enrollment\": 15," +
        "          \"instructor\": \"AGRAWAL D\"," +
        "          \"location\": \"PSYCH1924\"," +
        "          \"sections\": [" +
        "            {" +
        "              \"capacity\": 26," +
        "              \"course_id\": \"CMPSC 24\"," +
        "              \"course_title\": \"\"," +
        "              \"days\": \"R\"," +
        "              \"enroll_code\": \"08524\"," +
        "              \"enrollment\": 7," +
        "              \"instructor\": \"\"," +
        "              \"location\": \"PHELP3525\"," +
        "              \"status\": \"\"," +
        "              \"times\": \"1:00pm - 1:50pm\"" +
        "            }," +
        "            {" +
        "              \"capacity\": 30," +
        "              \"course_id\": \"CMPSC 24\"," +
        "              \"course_title\": \"\"," +
        "              \"days\": \"R\"," +
        "              \"enroll_code\": \"08532\"," +
        "              \"enrollment\": 5," +
        "              \"instructor\": \"\"," +
        "              \"location\": \"PHELP3525\"," +
        "              \"status\": \"\"," +
        "              \"times\": \"2:00pm - 2:50pm\"" +
        "            }," +
        "            {" +
        "              \"capacity\": 26," +
        "              \"course_id\": \"CMPSC 24\"," +
        "              \"course_title\": \"\"," +
        "              \"days\": \"R\"," +
        "              \"enroll_code\": \"08540\"," +
        "              \"enrollment\": 1," +
        "              \"instructor\": \"\"," +
        "              \"location\": \"PHELP3525\"," +
        "              \"status\": \"\"," +
        "              \"times\": \"3:00pm - 3:50pm\"" +
        "            }," +
        "            {" +
        "              \"capacity\": 27," +
        "              \"course_id\": \"CMPSC 24\"," +
        "              \"course_title\": \"\"," +
        "              \"days\": \"R\"," +
        "              \"enroll_code\": \"08557\"," +
        "              \"enrollment\": 2," +
        "              \"instructor\": \"\"," +
        "              \"location\": \"PHELP3525\"," +
        "              \"status\": \"\"," +
        "              \"times\": \"4:00pm - 4:50pm\"" +
        "            }" +
        "          ]," +
        "          \"status\": \"\"," +
        "          \"times\": \"9:30 am - 10:45am\"" +
		"}";

	    try {
			Course x = jsonToCourse(json2);
			System.out.println(x.getSections().get(1).getCapacity());
	    }
	    catch (Exception e){
			System.out.println("An exception occurred");
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

    
