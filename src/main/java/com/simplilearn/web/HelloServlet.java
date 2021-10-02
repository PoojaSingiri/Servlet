package com.simplilearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{

	ServletConfig config = null;	

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.config = config;
		System.out.println("---Servlet is initialized---");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<htm><body>");
		out.print("<h1>Hello, welcome to servlet program!! </h1>");
		out.print("</htm></body>");
		
		System.out.println("---Servlet request is processing is completed---");
	}

	@Override
	public void destroy() {
		System.out.println("---Servlet is destroyed---");
		}
	
	@Override
	public ServletConfig getServletConfig() {	
		return config;
	}

	@Override
	public String getServletInfo() {
		return "This is a servlet interface implementation class";
	}
	
	
	
	
	
	
	
	
}
