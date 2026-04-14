package br.com.ciudad.spring_boot_essentials.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/hello")
public class HelloWordController {

    @GetMapping(value = {"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public String get(@PathVariable ("id") String id){ // jeito diferente de dar um return no endpoint
        return "HEllo World" + id;// passando  o parametro por patch verbol
    }

    /*@GetMapping
    public ResponseEntity<String> helloworld1 (){
        return ResponseEntity.ok("Hello World");
    }

    nao pode ter mais de 1 endpoinnt indo para a mesma url porque da conflito erro405
    */

    @GetMapping("/novo")
    @ResponseStatus(HttpStatus.OK)
    public String getnovo(@RequestParam(value = "name", required = false) String name){
        return "HEllo World" + name;
    } // assim pode pq mudou a url

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String post(@RequestBody String nome ){
        return "HEllo World Post!" + nome;
    }

}
