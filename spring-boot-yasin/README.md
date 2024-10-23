STEPS: 
Main:
- above the main @SpringBootApplication 
- inside main SpringApplication.run(Main.class, args);
Port: 
resources/application.yml 
- change the port for example to 3000
api: 
- @GetMapping("/")
  public String greet(){
  return "Hello World";
  }
- above the main@RestController