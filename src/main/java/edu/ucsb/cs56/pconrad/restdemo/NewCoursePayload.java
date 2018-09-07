package edu.ucsb.cs56.pconrad.restdemo;

import lombok.Data;
import java.util.List;
import java.util.LinkedList;
import com.fasterxml.jackson.annotation.JsonAlias;

/**
   NewPostPayload is a class that will have getters and
   setters by virtue of Lombok (<a href="https://projectlombok.org/">https://projectlombok.org</a>)
   
   It has title, categories and content.
*/

@Data
class NewCoursePayload {
       private int capacity;
    private String course_id;
    private String course_title;
    private String days;
    private int enrollment;
    private String instructor;
    private String location;
    private String status;
    private String times;

    private List sections = new LinkedList<>();

    public boolean isValid() {
	return course_id != null && !course_id.isEmpty();
    }
}
