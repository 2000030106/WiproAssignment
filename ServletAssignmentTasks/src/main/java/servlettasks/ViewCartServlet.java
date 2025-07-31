package servlettasks;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ViewCartServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Cookie[] cookies = request.getCookies();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Your Cart Items:</h2>");

        boolean found = false;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().startsWith("item_")) {
                    out.println("<li>" + c.getValue() + "</li>");
                    found = true;
                }
            }
        }

        if (!found) {
            out.println("<p>Cart is empty.</p>");
        }

        out.println("<br><a href='addItem.html'>Add More Items</a>");	
		
		
	}
	

}
