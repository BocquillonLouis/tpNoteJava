package tpNote;

public class Client {

	/**
	 * Date d'arrivée du client au supermarché
	 */
	public int dateArrivee;
	
	/**
	 * Durée de traitement du caddie du client
	 */
	public int dureeTraitementCaddie;
	
	public Client(int dateArrivee, int dureeTraitementCaddie) {
		
		this.dateArrivee = dateArrivee;
		this.dureeTraitementCaddie = dureeTraitementCaddie;
	}
}
