package edu.ucsb.cs56.pconrad.restdemo;

import java.util.List;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonAlias;
	
/**
   Section is a class that will have getters and
   setters by virtue of Lombok (<a href="https://projectlombok.org/">https://projectlombok.org</a>)
   
   
*/


@Data
public class Department {
	private String name;
	private String department;
	private List<Course> courses;
}
