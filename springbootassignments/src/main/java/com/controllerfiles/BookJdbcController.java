package com.controllerfiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daofiles.BookDAO;
import com.springbootprograms.Book;

@RestController
@RequestMapping("/books")

public class BookJdbcController {
	
	 @Autowired
	    private BookDAO bookDAO;

	    @GetMapping
	    public List<Book> getAllBooks() {
	        return bookDAO.getAllBooks();
	    }
	    
	    @GetMapping("/{id}")
	    public Book getBookById(@PathVariable int id) {
	        return bookDAO.getBookById(id);
	    }
	    
	    @PostMapping
	    public String addBook(@RequestBody Book book) {
	        int result = bookDAO.addBook(book);
	        return result > 0 ? "Book added successfully" : "Insert failed";
	    }
	    
	    @PutMapping("/{id}")
	    public String updateBook(@PathVariable int id, @RequestBody Book book) {
	        book.setBookid(id);
	        int result = bookDAO.updateBook(book);
	        return result > 0 ? "Book updated successfully" : "Update failed";
	    }
	    
	    @DeleteMapping("/{id}")
	    public String deleteBook(@PathVariable int id) {
	        int result = bookDAO.deleteBook(id);
	        return result > 0 ? "Book deleted successfully" : "Delete failed";
	    }
	

}
