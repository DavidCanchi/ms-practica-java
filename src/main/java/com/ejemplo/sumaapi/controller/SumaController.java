package com.ejemplo.sumaapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaController {

    @GetMapping("/sumar")
    public int sumar(@RequestParam int numero1, @RequestParam int numero2) {
        return numero1 + numero2;
    }
}
