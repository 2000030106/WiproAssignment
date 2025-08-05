package com.springbootprograms;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class BookResttemplate {

	
	

	

	    private static final String BASE_URL = "http://localhost:8088/wiproassignments/books";

	    public static void main(String[] args) {

	        RestTemplate restTemplate = new RestTemplate();

	        try {
	            // -------------------- POST --------------------
	            Book newBook = new Book();
	            newBook.setBookid(201);
	            newBook.setBookname("Effective Java");
	            newBook.setAuthor("Joshua Bloch");
	            newBook.setPrice(500);
	            
	            newBook.setBookid(203);
	            newBook.setBookname("Effective Html");
	            newBook.setAuthor("Samad");
	            newBook.setPrice(700);

	            HttpEntity<Book> postRequest = new HttpEntity<>(newBook);
	            ResponseEntity<String> postResponse = restTemplate.postForEntity(BASE_URL, postRequest, String.class);

	            if (postResponse.getStatusCode() == HttpStatus.OK) {
	                System.out.println("POST Success: " + postResponse.getBody());
	            } else {
	                System.out.println("POST Failed: Status Code " + postResponse.getStatusCode());
	            }

	            // -------------------- GET --------------------
	            ResponseEntity<Book> getResponse = restTemplate.getForEntity(BASE_URL + "/203", Book.class);

	            if (getResponse.getStatusCode() == HttpStatus.OK) {
	                Book book = getResponse.getBody();
	                System.out.println("GET Book: " + book.getBookname() + ", ₹" + book.getPrice());
	            } else {
	                System.out.println("GET Failed: " + getResponse.getStatusCode());
	            }

	            // -------------------- PUT --------------------
	            newBook.setPrice(600); // update
	            HttpEntity<Book> putRequest = new HttpEntity<>(newBook);
	            restTemplate.put(BASE_URL + "/203", putRequest);
	            System.out.println("PUT Success: Book updated.");

	            // -------------------- DELETE --------------------
	            restTemplate.delete(BASE_URL + "/201");
	            System.out.println("DELETE Success: Book deleted.");

	        } catch (HttpClientErrorException e) {
	            System.err.println("Client error: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
	        } catch (HttpServerErrorException e) {
	            System.err.println("Server error: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
	        } catch (ResourceAccessException e) {
	            System.err.println("Connection error: " + e.getMessage());
	        } catch (RestClientException e) {
	            System.err.println("Unexpected error: " + e.getMessage());
	        }
	    }
	}

/*
 * POST Success: Book added successfully
GET Book: Effective Html, ₹700
PUT Success: Book updated.
DELETE Success: Book deleted.
*/
 

