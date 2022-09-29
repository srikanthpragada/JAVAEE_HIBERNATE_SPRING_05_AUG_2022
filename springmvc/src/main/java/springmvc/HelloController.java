package springmvc;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class HelloController {

	  @GetMapping("/hello")
	  @ResponseBody   // Method sends response to be sent to client 
	  public String sayHello() {
		  return "<h1>Hello Spring MVC</h1>";
	  }
	  
	  @GetMapping("/now")
	  @ResponseBody
	  public String sendDateTime() {
	        return LocalDateTime.now().toString();
	  }
	  
	  @GetMapping("/wish")
	  @ResponseBody
	  public String wish(@RequestParam(name = "name", required = false) String user) {
	        return  "Hello " + user; 
	  }
	  
	  @GetMapping("/hellojsp")
	  public String sayHelloWithJsp() {
		  return "hello";  // view name - hello.jsp
	  }
		 
}
