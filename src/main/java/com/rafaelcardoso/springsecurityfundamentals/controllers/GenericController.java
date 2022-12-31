package com.rafaelcardoso.springsecurityfundamentals.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class GenericController {

    @GetMapping
    public String findAll() {
        return "All users!";
    }
}
