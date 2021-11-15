package com.prakhar.patterns.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prakhar.patterns.mvc.model.ComparatorModel;

@WebServlet("/numberComparatorControler")
public class NumberComparatorControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		
		ComparatorModel model = new ComparatorModel();
		int result = model.greatestNumber(num1, num2);
		request.setAttribute("result", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("comparator.jsp");
		dispatcher.forward(request, response);
		
	}

}
