package com.example.demo.newcontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newserviceimpl.NewfileServiceImpl;

@RestController
class NewfileController {
    private final NewfileServiceImpl fileService;

    public NewfileController(NewfileServiceImpl fileService) {
       this.fileService = fileService;
     }

        @Getmapping("/getData/{id}")
        public NewfileEntity getStudent(@PathVariable Long id) {
            return fileService.getidval(id);
        }

        @PostMapping("/postData")
        public NewfileEntity postStudentData(NewfileEntity entity) {
            return fileService.savedata(entity);
        }
    }