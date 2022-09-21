package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Catalog {
	@Autowired
	Books books;

	public Catalog() {
		System.out.println("Catalog()");
		System.out.println(this.books);
	}
	
//	@PostConstruct 
//	public void init() {
//		System.out.println(this.books);	
//	}
//	
//	@PreDestroy 
//	public void destory() {
//		System.out.println("Catalog is being destroyed!");	
//	}
}
