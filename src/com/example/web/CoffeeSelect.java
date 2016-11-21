package com.example.web;
import com.example.model.CoffeeExpert;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Iterator;
import java.util.List;

public class CoffeeSelect extends HttpServlet {
	public void doPost (HttpServletRequest request,
		HttpServletResponse response)
	throws IOException, ServletException {
		String [] sizes = request.getParameterValues ("cup_sizes");
		CoffeeExpert ce = new CoffeeExpert();
        String c = sizes[0];
		List<String> result = ce.getBrands(c);

        final String contextEmail = getServletContext().getInitParameter("contextEmail");
        if (!contextEmail.isEmpty()) result.add(contextEmail);
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println ("Coffee Selection Advice<br> ");
//		for (int x=0; x<sizes.length; x++) {
//			out.println("<br>sizes: " + sizes[x]);
//		}

		request.setAttribute ("styles", result);
		RequestDispatcher view =
				request.getRequestDispatcher("result.jsp");
		view.forward (request, response);

//		Iterator it = result.iterator();
//		while(it.hasNext()) {
//			out.print("<br>try: " + it.next());
//		}
	}
}