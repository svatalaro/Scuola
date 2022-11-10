package it.ibm.scuola.data;

import it.ibm.scuola.model.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRepository extends Course {
    private ArrayList<Course> courses = new ArrayList<>();
    public void getCourse(){
        for (Course x:courses)
            System.out.println(x);
    }
    public void setCourse(Course id, Course title, Course duration, Course price){
        List<Course> collection = Arrays.asList(id, title, duration, price);
        courses.addAll(collection);
    }

}
