package tpNote;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Caisse {

	/**
	 * Indique si la caissière est expérimentée ou non
	 */
	public boolean caissiereExperimentee;
	
	/**
	 * La liste des clients qui sont affectés à cette caisse
	 */
	public ConcurrentLinkedQueue<Client> fileClients;
	
	/**
	 * La durée de traitement des caddies de tous les clients affectés à cette caisse
	 */
	public int dureeTraitementCaisse;
	
	public Caisse(boolean caissiereExperimentee) {
		
		this.caissiereExperimentee = caissiereExperimentee;
		this.fileClients = new ConcurrentLinkedQueue<Client>();
	}
}
