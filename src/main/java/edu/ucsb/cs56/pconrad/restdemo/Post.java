package edu.ucsb.cs56.pconrad.restdemo;


import lombok.Data;
import com.fasterxml.jackson.annotation.JsonAlias;
	
/**
   Post is a class that will have getters and
   setters by virtue of Lombok (<a href="https://projectlombok.org/">https://projectlombok.org</a>)
   
   It has int id, String title, List categories, and String content

*/


@Data
class Post {
    private int id;
    private String title;
    private java.util.List categories;
    private String content;
}
