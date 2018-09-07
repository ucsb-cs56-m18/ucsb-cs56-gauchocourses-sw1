package edu.ucsb.cs56.pconrad.restdemo;

import java.util.Map;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
	
/**
   Section is a class that will have getters and
   setters by virtue of Lombok (<a href="https://projectlombok.org/">https://projectlombok.org</a>)
   
   
*/


@Data
class Section {
    private int capacity;
    private String course_id;
    private String course_title;
    private String days;
    private String enroll_code;
    private int enrollment;
    private String instructor;
    private String location;
    private String status;
    private String times;

    
    @SuppressWarnings("unchecked")
    @JsonProperty("sections")
    private void unpackNested(Map<String, Object> sections){
	this.capacity = (Integer)sections.get("capacity");
	this.course_id = (String)sections.get("course_id");
	this.course_title = (String)sections.get("course_title");
	this.days = (String)sections.get("days");
	this.enroll_code = (String)sections.get("enroll_code");
	this.enrollment = (Integer)sections.get("instructor");
	this.instructor = (String)sections.get("instructor");
	this.location = (String)sections.get("location");
	this.status = (String)sections.get("status");
	this.times = (String)sections.get("times");
	
    }
    
}
