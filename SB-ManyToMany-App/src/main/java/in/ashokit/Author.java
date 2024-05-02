package in.ashokit;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Author_id;
	private String Author_name;

	@ManyToMany(mappedBy="authors")
	
	private List<Book> book= new ArrayList<>();

	public Integer getAuthor_id() {
		return Author_id;
	}

	public void setAuthor_id(Integer author_id) {
		Author_id = author_id;
	}

	public String getAuthor_name() {
		return Author_name;
	}

	public void setAuthor_name(String author_name) {
		Author_name = author_name;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
}
