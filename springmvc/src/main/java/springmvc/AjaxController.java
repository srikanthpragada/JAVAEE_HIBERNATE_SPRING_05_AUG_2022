package springmvc;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	@Autowired
	private EmployeeRepo empRepo;

	@GetMapping("/quote")
	@ResponseBody
	public String getQuote() {
		return "Winner never quit! Quitters never win!";
	}

	@RequestMapping("/employeename")
	@ResponseBody
	public String getEmployeeName(@RequestParam("id") int id) {
		// Get employee
		Optional<Employee> emp = empRepo.findById(id);
		if (emp.isPresent())
			return emp.get().getName();
		else
			return "";
	}

	@RequestMapping("/employee")
	@ResponseBody
	public Employee getEmployee(@RequestParam("id") int id) {
		// Get employee
		Optional<Employee> emp = empRepo.findById(id);
		if (emp.isPresent())
			return emp.get();
		else
			return null;
	}

}
