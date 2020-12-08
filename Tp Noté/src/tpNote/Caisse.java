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
	
	public Caisse(boolean caissiereExperimentee) {
		
		this.caissiereExperimentee = caissiereExperimentee;
		this.fileClients = null;
	}
}
