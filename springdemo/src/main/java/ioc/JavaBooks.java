package ioc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName="prototype")
public class JavaBooks implements Books {

	public JavaBooks() {
		System.out.println("JavaBooks()");
	}
	
	@Override
	public List<String> getBooks() {
		ArrayList<String> books = new ArrayList<>();
		books.add("Java Comp. Ref");
		books.add("Thinking in Java");
		return books;
	}

	@Override
	public String getTopic() {
		return "Java";
	}

}
