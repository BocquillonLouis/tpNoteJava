package tpNote;

public class Client {

	/**
	 * Date d'arrivée du client au supermarché
	 */
	private int dateArrivee;
	
	/**
	 * Durée de traitement du caddie du client en minutes
	 */
	private int dureeTraitementCaddie;
	
	public Client(int dateArrivee, int dureeTraitementCaddie) {
		
		this.dateArrivee = dateArrivee;
		this.dureeTraitementCaddie = dureeTraitementCaddie;
	}
	
	// getters and setters

	public int getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(int dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public int getDureeTraitementCaddie() {
		return dureeTraitementCaddie;
	}

	public void setDureeTraitementCaddie(int dureeTraitementCaddie) {
		this.dureeTraitementCaddie = dureeTraitementCaddie;
	}
	
	
}
