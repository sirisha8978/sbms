package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;

	
	@Entity
	@NamedStoredProcedureQuery(
	    name = "getBookCountByAuthor",
	    procedureName = "get_count_of_books",
	    parameters = {
	        @StoredProcedureParameter(mode = ParameterMode.IN, name = "auth", type = String.class),
	        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "total", type = Integer.class)
	    })
	public class Book {
		@Id
	    @Column(name = "book_id")
	    private Integer bookId;

	    @Column(name = "author")
	    private String author;

	    @Column(name = "title")
	    private String title;

	    @Column(name = "price")
	    private Double price;

	    @Column(name = "category")
	    private String category;


	    @Override
		public String toString() {
			return "Book [bookId=" + bookId + ", author=" + author + ", title=" + title + ", price=" + price
					+ ", category=" + category + ", getBookId()=" + getBookId() + ", getAuthor()=" + getAuthor()
					+ ", getTitle()=" + getTitle() + ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory()
					+ "]";
		}

		public Integer getBookId() {
			return bookId;
		}

		public void setBookId(Integer bookId) {
			this.bookId = bookId;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}


	    
	}



