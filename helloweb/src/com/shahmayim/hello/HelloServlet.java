package com.shahmayim.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//status code
		response.setStatus(201);
		
		
		//headers
		response.setHeader("Context-Type", "text/plain");
		
		
		
		//body
		response.getWriter().append("Get Served at: ").append(request.getContextPath());
		response.getWriter().append(" \n  method: ")
		.append(request.getMethod());
		response.getWriter().append(" \n uri: ")
		.append(request.getRequestURI());
		response.getWriter().append(" \n path: ")
		.append(request.getServletPath());
		response.getWriter().append(" \n scheme: ")
		.append(request.getScheme());
		response.getWriter().append(" \n remotehost: ")
		.append(request.getRemoteHost());
		response.getWriter().append(" \n localport: ")
		.append(""+request.getLocalPort());
		response.getWriter().append(" \n servername: ")
		.append(request.getServerName());
		response.getWriter().append(" \n servername: ")
		.append(request.getServerName());		
		response.getWriter().append(" \n getheader: ")
	
		.append(request.getHeader("User-Agent"));
		
		for (int i = 0; i < 45; i++) {
			response.getWriter().append(" \n "+i);
		}
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.getWriter().append("Post served at: ").append(request.getContextPath());
	}

}
