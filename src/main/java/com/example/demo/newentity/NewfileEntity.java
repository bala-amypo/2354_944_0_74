package com.example.demo.newentity;

import jakarta.peristence.Id;
import jakarta.validation.constraints.NotBlank;

public class NewfileEntity{
    @Id
    @GeneratedValue(Strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message = "no blank allowed")
    @Email(message = "invalid format")
    private String email;
}