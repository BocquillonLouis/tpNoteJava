package tpNote;

public class Client {

	/**
	 * Date d'arriv�e du client au supermarch�
	 */
	private int dateArrivee;
	
	/**
	 * Dur�e de traitement du caddie du client en minutes
	 */
	private int dureeTraitementCaddie;
	
	public Client(int dateArrivee, int dureeTraitementCaddie) {
		
		this.dateArrivee = dateArrivee;
		this.dureeTraitementCaddie = dureeTraitementCaddie;
	}
	
	// getters and setters

	/**
	 * Retourne la date d'arriv�e du client
	 * @return La date d'arriv�e du client
	 */
	public int getDateArrivee() {
		return dateArrivee;
	}

	/**
	 * Changer la date d'arriv�e du client
	 * @param dateArrivee La date d'arriv�e du client
	 */
	public void setDateArrivee(int dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	/**
	 * Retourne la dur�e de traitement du caddie du client
	 * @return La date dur�e de traitement du caddie du client
	 */
	public int getDureeTraitementCaddie() {
		return dureeTraitementCaddie;
	}

	/**
	 * Changer la dur�e de traitement du caddie du client
	 * @param dureeTraitementCaddie La date dur�e de traitement du caddie du client
	 */
	public void setDureeTraitementCaddie(int dureeTraitementCaddie) {
		this.dureeTraitementCaddie = dureeTraitementCaddie;
	}
	
	
}
