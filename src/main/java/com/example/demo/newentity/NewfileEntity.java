package com.example.demo.newentity;

import jakarta.peristence.Id;
import jakarta.validation.constraints.NotBlank;

public class NewfileEntity{
    @Id
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank
    private String email;
}