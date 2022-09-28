package jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJPA implements CommandLineRunner {
	@Autowired
	JobRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(TestJPA.class, args);
	}

	public void list() {
		System.out.println(repo.getClass());
		for (Job j : repo.findAll())
			System.out.printf("%-10s  %s\n", j.getId(), j.getTitle());
	}

	public void printCount() {
		System.out.println(repo.count());
	}

	public void listByTitle(String title) {
		for (Job job : repo.getByTitleContaining(title))
			System.out.println(job.getTitle());
	}

	public void listCostlyJobs(int minsal) {
		for (Job job : repo.getCostlyJobs(minsal))
			System.out.println(job.getTitle());
	}

	public void add(String id, String title, int minsal) {
		Job job = new Job();
		job.setId(id);
		job.setTitle(title);
		job.setMinSal(minsal);
		repo.save(job);
		System.out.println("Job has been added successfully!");
	}

	public void updateJobTitle(String id, String title) {
		Optional<Job> job = repo.findById(id);
		System.out.println("Looked for id");
		if (job.isPresent()) {
			System.out.println("Found id");
			Job j = job.get();
			j.setTitle(title);
			repo.save(j);
		} else
			System.out.println("Job Not Found!");
	}

	public void run(String... args) {
		// System.out.println(repo.getClass());
		//list();
		//printCount();
		//add("awscp","Aws Cloud Practitioner",1000000);
		//updateJobTitle("jpro","Java EE 8 Programmer");
		// System.out.println("Avg. Min Salary : " + repo.getAvgMinSalary());
		// listCostlyJobs(600000);
		// System.out.println(repo.getAvgMinSalary());
		// listByTitle("Program");
		// System.out.println( repo.countByMinSal(500000));
	}
}
