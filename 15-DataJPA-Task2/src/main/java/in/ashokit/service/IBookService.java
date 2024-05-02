package in.ashokit.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import in.ashokit.entity.Book;

public interface IBookService {
	 int getCountOfBooks(String author);
	 int getBookCount(String author);
	 int getCountByAuthor(String author);
	 List<Book> getbooklistByAuth(String author);
		

}
