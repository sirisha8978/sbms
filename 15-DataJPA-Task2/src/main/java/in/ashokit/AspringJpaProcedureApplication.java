package in.ashokit;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.ashokit.entity.Book;
import in.ashokit.service.IBookService;

@SpringBootApplication
public class  AspringJpaProcedureApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AspringJpaProcedureApplication.class, args);
	}
 @Autowired
 private IBookService bookService;
	@Override
	public void run(String... args) throws Exception {
	        int total = bookService.getCountOfBooks("Robin");
	        System.out.println("Total books by author Robin: " + total);
	         total = bookService.getBookCount("Robin");
	        System.out.println("Total books by author Robin: " + total);
	         total = bookService.getCountByAuthor("Robin");
	        System.out.println("Total books by author Robin: " + total);
	        
	      //  List <Book> books=bookService.getbooklistByAuth("Robin");
	      // books.forEach(System.out::println);
	    }
	

		
	}


