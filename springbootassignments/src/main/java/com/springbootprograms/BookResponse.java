package com.springbootprograms;

public class BookResponse 
{
	private int bookid;
	private String name;
	private String writer;
	
	public BookResponse()
	{
		
	}

	public BookResponse(int bookid, String name, String writer) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.writer = writer;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	
}
