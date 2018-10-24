package metier;

public class JeuHazardMetier {

	private int numberHazard;
	private boolean fin;

	public JeuHazardMetier() {
		this.numberHazard = (int) (Math.random() * 100 + 1);
	}

	public String jouer(int nb) {

		if (!fin) {
			if (nb > this.numberHazard) {
				return "Votre Nombre ets plus Grand";
			} else if (nb < this.numberHazard) {
				return "Votre nombre est plus Petit";
			} else {
				fin = true;
				return "Bravo!! Vous Avez Gagné";
			}

		} else {

			return "Le jeu est Terminé";
		}

	}
}
