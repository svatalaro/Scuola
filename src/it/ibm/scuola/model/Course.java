package it.ibm.scuola.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    private int id;
    private String title;
    private int duration;
    private double price;
    private ArrayList<Student> students;
    public Course(){}
    public Course (int id, String title, int duration, double price){
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.price = price;
        students = new ArrayList<>();
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void getStudents(){
        for (Student x:students)
            System.out.println(x);
    }
    public void setStudent(Student id, Student name, Student surname, Student dob){
        List<Student> collection = Arrays.asList(id, name, surname, dob);
        students.addAll(collection);
    }
}
