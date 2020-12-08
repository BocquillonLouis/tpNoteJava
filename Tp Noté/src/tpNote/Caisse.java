package tpNote;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Caisse {

	/**
	 * Indique si la caissi�re est exp�riment�e ou non
	 */
	public boolean caissiereExperimentee;
	
	/**
	 * La liste des clients qui sont affect�s � cette caisse
	 */
	public ConcurrentLinkedQueue<Client> fileClients;
	
	public Caisse(boolean caissiereExperimentee) {
		
		this.caissiereExperimentee = caissiereExperimentee;
		this.fileClients = null;
	}
}
