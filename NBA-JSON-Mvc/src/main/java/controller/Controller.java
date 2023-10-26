package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import handler.Player;
import handler.WebHandler;
import model.Team;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Team[] teams;
	private Player[] players;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String op = request.getParameter("op");

		switch (op) {
		case "inicio": {
			WebHandler webHandler = new WebHandler("http://www.ies-azarquiel.es/paco/apinba/teams");
			teams = webHandler.getTeams();
			request.setAttribute("teams", teams);
			request.getRequestDispatcher("page.jsp").forward(request, response);
			break;
		}
		case "details": {
			String original_name = request.getParameter("name");
			String name = original_name.replace(" ", "%20");
			WebHandler webHandler = new WebHandler("http://www.ies-azarquiel.es/paco/apinba/players/team?name=" + name);

			players = webHandler.getPlayers();
			request.setAttribute("players", players);
			request.setAttribute("teamname", original_name);
			request.getRequestDispatcher("details.jsp").forward(request, response);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}