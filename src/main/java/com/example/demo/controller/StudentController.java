package com.example.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project.entity.Studententity;
import com.example.Project.service.Studentservice;

@RestController
public class Studentcontoller {
    @Autowired
    Studentservice src;
    @PostMapping("/post")
    public Studententity postdata(@RequestBody Studententity st){
      return src.savedata(st);

    }
    @GetMapping("/get")
    public List<Studententity> getdata(){
      return src.retdata();
    }
@GetMapping("/getid/{id}")
    public Studententity getidval(@PathVariable int id) {
      return src.id(id);
    }
    @PutMapping("/put/(id)")
    public Studententity update(@PathVariable int id,@RequestBody Studententity st){
      return src.put(id,st);
    }
    @DeleteMapping("/delete/(id)")
    public Studententity delete(@PathVariable int id){
      return src.del(id);
    }
}