package springmvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
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
	public String register(@Valid User user,
                           BindingResult result, ModelMap model, 
                           @CookieValue(name="city", defaultValue = "vizag") String city) {
 		 // process user
		 model.put("user",user);
		 
		 if (result.hasErrors()) {
			 return "register";   // redisplay form to display errors
		 }
		 
         return "registerDone";
	}

}
