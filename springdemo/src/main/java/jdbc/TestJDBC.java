package jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class TestJDBC implements CommandLineRunner {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void showJobCount() {
		Integer count = jdbcTemplate.queryForObject("select count(*) from jobs", Integer.class);
		System.out.println("Count = " + count);
	}
	
//	@Autowired
//	JobsManager jobs;
	
//	@Autowired
//	SJIDemo sjiDemo;
	
	public static void main(String[] args) {
		SpringApplication.run(TestJDBC.class, args);
	}
	
	public void run(String... args) {
		showJobCount();
		
		// jobs.updateMinSalary();
		// jobs.listJobsWithLambda();
		 // jobs.showAverageSalary();
		 //sjiDemo.add();
		
		// jobs.listJobTitles();
//		try {
//			System.out.println("Updating salaries!");
//			jobs.updateTwo(1,12);
//			System.out.println("Operation Completed!");
//		} catch (Exception ex) {
//			System.out.println("Operation Failed");
//		}
	}

}
