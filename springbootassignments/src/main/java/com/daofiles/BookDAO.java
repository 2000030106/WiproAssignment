package com.daofiles;

import java.sql.ResultSet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbootprograms.Book;

@Repository
public class BookDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;

	private RowMapper<Book> bookMapper = (ResultSet rs, int rowNum) -> {
        Book book = new Book();
        book.setBookid(rs.getInt("bookid"));
        book.setBookname(rs.getString("bookname"));
        book.setAuthor(rs.getString("author"));
        book.setPrice(rs.getInt("price"));
        return book;
    };
    
    public List<Book> getAllBooks() {
        String sql = "SELECT * FROM bookspringboot";
        return jdbcTemplate.query(sql, bookMapper);
    }
    
    public Book getBookById(int id) {
        String sql = "SELECT * FROM bookspringboot WHERE bookid=?";
        return jdbcTemplate.queryForObject(sql, bookMapper, id);
    }

    public int addBook(Book book) {
        String sql = "INSERT INTO bookspringboot (bookid, bookname, author, price) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, book.getBookid(), book.getBookname(), book.getAuthor(), book.getPrice());
    }

    public int updateBook(Book book) {
        String sql = "UPDATE bookspringboot SET bookname=?, author=?, price=? WHERE bookid=?";
        return jdbcTemplate.update(sql, book.getBookname(), book.getAuthor(), book.getPrice(), book.getBookid());
    }

    public int deleteBook(int id) {
        String sql = "DELETE FROM bookspringboot WHERE bookid=?";
        return jdbcTemplate.update(sql, id);
    }

}
