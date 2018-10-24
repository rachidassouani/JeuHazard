package metier;

public class JeuHazardMetier {

	private int numberHazard;
	private boolean fin;

	
	/*
	 * Constructor by default
	 * Generate a random number between 1 and 100
	 */
	public JeuHazardMetier() {
		this.numberHazard = (int) (Math.random() * 100 + 1);
	}

	/*
	 * Getters & Setters
	 */

	public int getNumberHazard() {
		return numberHazard;
	}

	public void setNumberHazard(int numberHazard) {
		this.numberHazard = numberHazard;
	}

	public boolean isFin() {
		return fin;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}

	
	/*
	 * Main Method of our game
	 */
	public String jouer(int nb) {

		if (!fin) {
			if (nb > this.numberHazard) {
				
				return "Votre Nombre "+nb+" ets plus Grand";
			
			} else if (nb < this.numberHazard) {
			
				return "Votre Nombre "+nb+" est plus Petit";
			
			} else {
			
				fin = true;
				return "Bravo!! Vous Avez Gagné, Le nombre Secret est :"+numberHazard;
			}

		} else {

			return "Le jeu est Terminé";
		}

	}
}
