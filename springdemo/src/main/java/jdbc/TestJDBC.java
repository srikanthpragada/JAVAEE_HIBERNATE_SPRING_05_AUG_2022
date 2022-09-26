package jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class TestJDBC implements CommandLineRunner {
	@Autowired
	JobsManager jobs;
	
//	@Autowired
//	SJIDemo sjiDemo;
	
	public static void main(String[] args) {
		SpringApplication.run(TestJDBC.class, args);
	}
	
	public void run(String... args) {
		// jobs.showJobCount();
		
		// jobs.updateMinSalary();
		
		//jobs.listJobTitlesWithJava7();
		//jobs.listJobTitles();
		
		 // jobs.listJobsWithLambda();
		 // jobs.showAverageSalary();
		 //sjiDemo.add();
		
		// jobs.listJobTitles();
		
		try {
			System.out.println("Updating salaries!");
			jobs.updateTwo(1,2);
			System.out.println("Operation Completed!");
		} catch (Exception ex) {
			System.out.println("Operation Failed");
		}
	}

}
