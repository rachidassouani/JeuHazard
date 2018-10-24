package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		HttpSession session = request.getSession();
		ModelJeuHazard model;
		if(session.getAttribute("model")== null) {
			model = new ModelJeuHazard();
			session.setAttribute("model", model);
		
		}else {
			model = (ModelJeuHazard)session.getAttribute("model");
		}
		
	
		/*
		 * If user clicks button Jouer
		 */
		if(request.getParameter("jouer").equals("Jouer")) {
			
			int nb = Integer.parseInt(request.getParameter("nombre"));
			String msg = metier.jouer(nb);
			
			model.setNb(nb);
			model.getHistorique().add(msg);
				
		}
		
		/*
		 * If user clicks Button Relancer
		 */
		else if(request.getParameter("jouer").equals("Relancer")) {
			
			// generate a new random number
			 metier = new JeuHazardMetier();
			
			 //finish the game that means set boolean 'Fin' as false
			 metier.setFin(false);
			
			 //Delete History of player
			 model.setHistorique(new ArrayList<String>());
		}
		
		
		/*
		 * Forward to main page that has a name jeu.jsp
		 */
		request.getRequestDispatcher("jeu.jsp").forward(request, response);
	}
	
}
