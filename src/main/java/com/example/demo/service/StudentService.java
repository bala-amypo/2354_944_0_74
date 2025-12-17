package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.StudentEntity;

public interface StudentService {
    StudentEntity postdata(StudentEntity stu);
    List<StudentEntity> getdata();
    StudentEntity updatedata(int id, StudentEntity std);
    String deletedata(int id);
}