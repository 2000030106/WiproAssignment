package com.controllerfiles;

import java.awt.print.Book;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootprograms.BookListResponse;
import com.springbootprograms.BookResponse;

@RestController
public class BookResponseController
{
	
	@GetMapping(value = "/bookres", produces = "application/xml")
    public BookListResponse getBooks() {
        return new BookListResponse(Arrays.asList(
                new BookResponse(101, "Java ", "Satya"),
                new BookResponse(102, "Spring ", "Sai"),
                new BookResponse(103, "React", "Venky")
        ));
    }

}
