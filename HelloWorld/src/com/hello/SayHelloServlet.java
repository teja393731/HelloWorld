package com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SayHelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public SayHelloServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) {
		
		try {
			PrintWriter out = response.getWriter();
			out.print("Charan Teja.. You got it..!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
