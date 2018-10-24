package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.JeuHazardMetier;

public class ControllerServlet extends HttpServlet{

	private JeuHazardMetier metier;
	
	@Override
	public void init() throws ServletException {
		metier = new JeuHazardMetier();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jeu.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int nb = Integer.parseInt(request.getParameter("nombre"));
		String msg = metier.jouer(nb);
		ModelJeuHazard model = new ModelJeuHazard();
		model.setNb(nb);
		model.getHistorique().add(msg);
		request.setAttribute("model", model);
		request.getRequestDispatcher("jeu.jsp").forward(request, response);
	}
	
}
