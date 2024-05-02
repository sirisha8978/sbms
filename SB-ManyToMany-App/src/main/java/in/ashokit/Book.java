package in.ashokit;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Book_id;
	private String Book_name;
	
	@ManyToMany
	@JoinTable(name="books_authors",joinColumns=@JoinColumn(name="book_id"),
	inverseJoinColumns=@JoinColumn(name="author_id"))
	private  List <Author> authors= new ArrayList<>();

	public Integer getBook_id() {
		return Book_id;
	}

	public void setBook_id(Integer book_id) {
		Book_id = book_id;
	}

	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	

}
