package web;

import java.util.ArrayList;
import java.util.List;

public class ModelJeuHazard {

	private int nb;
	private List<String> historique = new ArrayList<String>();
	
	
	public int getNb() {
		return nb;
	}
	public void setNb(int nb) {
		this.nb = nb;
	}
	public List<String> getHistorique() {
		return historique;
	}
	public void setHistorique(List<String> historique) {
		this.historique = historique;
	}
	
	
}
