package com.wolken.wolkenapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prod")
public class MobileProduct extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String mobileName = req.getParameter("mobileName");
		String mobileQuantity = req.getParameter("mobileQuantity");



		req.setAttribute("mobileNameAttr", mobileName);
		req.setAttribute("mobileQuantityAttr", mobileQuantity);

		RequestDispatcher dispatcher = req.getRequestDispatcher("final");
		dispatcher.forward(req, resp);

	}

}
