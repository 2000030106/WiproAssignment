package com.servlettasks;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class TransactionLoggingFilter implements Filter 
{

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
        String amount = httpRequest.getParameter("amount");
        String ipAddress = request.getRemoteAddr();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println("[" + timestamp + "] Transaction Request from IP: " + ipAddress + " | Amount: Rs." + amount);		
        chain.doFilter(request, response);
	}
	
	

	

}
