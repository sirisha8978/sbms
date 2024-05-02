package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Book;
import in.ashokit.repo.IBookRepository;
import jakarta.transaction.Transactional;

public class BookService  implements IBookService{

	private IBookRepository  bookRepository;
	public void setBookRepository(IBookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public int getCountOfBooks(String author) {
		
		return bookRepository.get_count_of_books(author);
	}

	@Override
	public int getBookCount(String author) {
	
		return bookRepository.getBookCount(author);
	}

	@Override
	@Transactional
	public int getCountByAuthor(String author) {
		
		return bookRepository.getCountByAuthor(author);
	}

	@Override
	public List<Book> getbooklistByAuth(String author) {

		return bookRepository.getbooklistByAuth(author);
	}

}
