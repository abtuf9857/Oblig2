package com.example.oblig2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class førstController {
    @GetMapping("/")
    public String helloWorld(){
        return "Wagwan my bruddah";
    }
}
