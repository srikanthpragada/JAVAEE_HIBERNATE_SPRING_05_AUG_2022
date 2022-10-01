package springmvc;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JobController {
	@Autowired
	private JobRepo jobRepo;

	@GetMapping("/jobs")
	public String getAllJobs(ModelMap model) {
		Iterable<Job> jobs = jobRepo.findAll();
		model.addAttribute("jobs", jobs);
		return "jobslist";
	}

	@GetMapping("/addjob")
	public String addJob(ModelMap model) {
		Job job = new Job();
		model.addAttribute("job", job);
		return "addjob";
	}

	@PostMapping(value = "/addjob")
	public String addJob(Job job, ModelMap model) {
		model.addAttribute("job", job);
		try {
			jobRepo.save(job);
			// job = new Job();
			model.addAttribute("message", "Job has been added!");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			model.addAttribute("message", "Sorry! Could not add Job");
		}

		return "addjob";
	}

	@GetMapping(value = "/deletejob")
	public String deleteJob(@RequestParam("id") String id) {
		Optional<Job> job = jobRepo.findById(id);
		if (job.isPresent())
			jobRepo.delete(job.get());

		return "redirect:jobs";
	}

}
