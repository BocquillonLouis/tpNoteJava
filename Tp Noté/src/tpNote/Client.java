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

	/**
	 * Retourne la date d'arrivée du client
	 * @return La date d'arrivée du client
	 */
	public int getDateArrivee() {
		return dateArrivee;
	}

	/**
	 * Changer la date d'arrivée du client
	 * @param dateArrivee La date d'arrivée du client
	 */
	public void setDateArrivee(int dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	/**
	 * Retourne la durée de traitement du caddie du client
	 * @return La date durée de traitement du caddie du client
	 */
	public int getDureeTraitementCaddie() {
		return dureeTraitementCaddie;
	}

	/**
	 * Changer la durée de traitement du caddie du client
	 * @param dureeTraitementCaddie La date durée de traitement du caddie du client
	 */
	public void setDureeTraitementCaddie(int dureeTraitementCaddie) {
		this.dureeTraitementCaddie = dureeTraitementCaddie;
	}
	
	
}
