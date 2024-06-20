package com.practica.java.practica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/api")   
public class HelloController {
	
	//ENDPOINT 1
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    
    //ENDPOINT2
    @GetMapping("/hello2") 
    public String hello2() {
        return "Hello, java developers";
    }
    
    //CREAR NUEVOS ENDPOINTS DE SALUDOS Y PROBARLOS
    
}
