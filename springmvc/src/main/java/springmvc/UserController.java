package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@GetMapping("/register")
	public String register(ModelMap model) {
		 User u = new User();
		 u.setUsername("Demo");
		 model.put("user", u);
         return "register";
	}
	
	@PostMapping("/register")
	public String register(User user, ModelMap model) {
 		 // process user 
		 model.put("user",user);
         return "registerDone";
	}

}
