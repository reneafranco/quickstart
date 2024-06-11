package com.reneafranco.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {


    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello World";
    }
  
    //this is a comment
  public static void startHH(){

    String x = "Test from nvim linea"
    //This is a new test
    System.out.println(x);
  }

}
