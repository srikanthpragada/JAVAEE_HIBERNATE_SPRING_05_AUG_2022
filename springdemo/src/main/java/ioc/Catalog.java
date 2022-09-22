package ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Catalog {
	@Autowired
	Books books;

	public Catalog() {
		System.out.println("Catalog()");
	}
	
	@PostConstruct 
	public void init() {
		System.out.println(this.books.hashCode());	
	}
	
	@PreDestroy 
	public void destory() {
		System.out.println("Catalog is being destroyed!");	
	}
}
