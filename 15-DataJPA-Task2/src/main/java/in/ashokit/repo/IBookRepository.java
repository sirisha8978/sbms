package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Book;

@Repository
public interface IBookRepository  extends JpaRepository<Book,Integer>{
    //use procedure name as the method name
	@Procedure
	int get_count_of_books(String author);
	
	@Procedure(procedureName="get count of book")
	 int getBookCount(String author);
	
	//using @NamedStoredprocedureQuery annotation
	@Procedure(name="getBookCountByAuthor")
	int getCountByAuthor(@Param("auth")String author);
	
	//using @query annotation
	@Query(value="call get_books_by_author(:author)",nativeQuery= true)
	List<Book> getbooklistByAuth(String author);
	
}
