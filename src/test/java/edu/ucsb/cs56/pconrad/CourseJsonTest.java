package edu.ucsb.cs56.pconrad.restdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CourseJsonTest {

    public String courseJson1 =
	"	{" +
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


    @Test
    public void test_decode1() throws Exception {
	Course c = Main.json2Course(courseJson1);
	assertEquals(105, c.getCapacity());
	assertEquals("T R", c.getDays());
	assertEquals("PROBLEM SOLVING II", c.getCourse_title());
	
    }
	
}
