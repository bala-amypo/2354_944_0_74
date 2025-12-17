package com.example.demo.entity;

public class StudentEntity{
    private String name;
    private int id;
    private LocalDate date;
    private float cgpa;

    public StudentEntity(){

    }
    public StudentEntity(String name,int id,LocalDate date,float cgpa){
        this.name=name;
        this.id=id;
        this.date=date;
        this.cgpa=cgpa;
    }
    public String getName(){
        return name;
    }
    public void setN
}