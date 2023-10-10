package com.example.demo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludarControlador {

    @PostMapping("/saludador")
    public String saludar(){
        return "Hola mundoo";
    }

}
