package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/final")
public class MobileProductFinal extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mobileName = (String) req.getAttribute("mobileNameAttr");
		String mobileQuantity =  (String) req.getAttribute("mobileQuantityAttr");
		
		int mobileQuantityInt = Integer.parseInt(mobileQuantity);
		
		double finalSummation =  24000 * mobileQuantityInt;
		
		PrintWriter printWriter =  resp.getWriter();
		printWriter.print("The Final value: "+ Double.toString(finalSummation) );
		
	}

}
