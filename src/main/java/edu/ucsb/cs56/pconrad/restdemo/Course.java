package edu.ucsb.cs56.pconrad.restdemo;

import java.util.List;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonAlias;
	
/**
   Section is a class that will have getters and
   setters by virtue of Lombok (<a href="https://projectlombok.org/">https://projectlombok.org</a>)
   
   
*/


@Data
class Course {
    private int capacity;
    private String course_id;
    private String course_title;
    private String days;
    private int enrollment;
    private String instructor;
    private String location;
    private String status;
    private String times;

    private List<Section> sections;

    /*
    @SupressWarnings("unchecked")
    @JsonProperty("sections")
    private void unpackNested(Map<String,Object> sections){
	this.course_title

    }
    */
    
}
