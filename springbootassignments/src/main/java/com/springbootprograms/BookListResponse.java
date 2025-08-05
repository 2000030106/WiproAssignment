package com.springbootprograms;

import java.util.List;

//import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

//@JacksonXmlRootElement(localName = "List")
public class BookListResponse 
{
	private List<BookResponse>item;
	
	public BookListResponse()
	{
		
	}

	public BookListResponse(List<BookResponse> item) {
		super();
		this.item = item;
	}

	public List<BookResponse> getItem() {
		return item;
	}

	public void setItem(List<BookResponse> item) {
		this.item = item;
	}
	
	

}
