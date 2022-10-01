package springmvc;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StateController {
	@GetMapping("/cookies")
	@ResponseBody
	public String useCookies(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
		String st = "";
		for (Cookie c : request.getCookies())
			st += c.getName() + " - " + c.getValue() + "<p></p>";

		// Create durable based cookie
		Cookie c = new Cookie("lastaccess", LocalDateTime.now().toString());
		c.setMaxAge(24 * 60 * 60);
		response.addCookie(c);

		return st;
	}

	@GetMapping("/session")
	public String useSession(HttpSession session) {
		// Session attribute
		session.setAttribute("now", LocalDate.now().toString());

		ServletContext ctx = session.getServletContext(); // Application
		ctx.setAttribute("name", "Spring MVC Demo");

		return "showSession";
	}

	@RequestMapping("/lastaccess")
	@ResponseBody
	public String lastAccess(@CookieValue(name = "lastaccess", required = false) Cookie time) {
		if(time != null)
     		return "<h2>Last Accessed : " + time.getValue() + "</h2>";
		else
			return "<h2>Sorry! Last accessed information not available</h2>";
	}
}
