package com.test.automation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.util.concurrent.Service;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static void process(HttpServletRequest request, HttpServletResponse response){
    	
    	 	System.out.println(request.getQueryString());
    	String queryString=request.getQueryString();
    	if(queryString!=null){
    	String[] queryItems=queryString.split("&");
    	System.out.println("in process");
        Model.triggerSelenium(queryItems[0],queryItems[1]);
    	}
    	
        
    	}
    	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   System.out.println("In get");
	   
		   System.out.println(request.getParameter("id"));
	     
		   process(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  System.out.println("In post");
		  System.out.println(request.getRequestURI());
		  System.out.println(request.getHeader("Connection"));
		  System.out.println(request.getParameter("email"));
		  response.getWriter().write("result1");
		  process(request,response);	  
	}

}
