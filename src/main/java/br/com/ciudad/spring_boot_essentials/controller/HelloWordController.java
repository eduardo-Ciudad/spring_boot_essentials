package br.com.ciudad.spring_boot_essentials.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloWordController {

    @GetMapping
    public ResponseEntity<String> helloworld (){
        return ResponseEntity.ok("Hello World");
    }
}
