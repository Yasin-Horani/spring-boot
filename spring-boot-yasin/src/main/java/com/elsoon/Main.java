package com.elsoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet(){
        return new GreetResponse("nice to meet you");
    }

   // record GreetResponse(String greet){}
    class GreetResponse{
        private final String greet;
        public GreetResponse(String greet) {
            this.greet = greet;
        }
        public String getGreet() {
            return greet;
        }
   }
}
