package controller;

import java.io.IOException;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Crud;
import model.Persona;

/**
 * Servlet implementation class Modifica
 */
@WebServlet("/Modifica")
public class Modifica extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Crud crud = new Crud();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Modifica() {
		super();
		// TODO Auto-generated constructor stub
		Crud crud = new Crud();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		request.getAttribute("listapersone");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String datadinascita = request.getParameter("datadinascita");
		String cf = request.getParameter("cf");
	
		request.setAttribute("nome", nome);
		request.setAttribute("cognome", cognome);
		request.setAttribute("datadinascita", datadinascita);
		request.setAttribute("cf", cf);
		
		RequestDispatcher rd;
		rd=request.getRequestDispatcher("FormModifica.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}