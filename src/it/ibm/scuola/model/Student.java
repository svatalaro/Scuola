package it.ibm.scuola.model;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private String surname;
    private LocalDate dob;

    public Student (int id, String name, String surname, LocalDate dob){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public LocalDate getDob(){
        return dob;
    }
    public void setDob(LocalDate dob){
        this.dob = dob;
    }
}
