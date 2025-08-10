package com.servlettasks;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TransactionServlet extends HttpServlet
{
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String amount = req.getParameter("amount");

        resp.setContentType("text/html");
        resp.getWriter().write("<h3>Transaction of Rs." + amount + " processed successfully.</h3>");
    }

}


/*
 * Transaction of Rs.1500 processed successfully.
 * */
