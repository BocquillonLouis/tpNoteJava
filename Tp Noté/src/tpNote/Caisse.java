package tpNote;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Caisse {

	/**
	 * Indique si la caissière est expérimentée ou non
	 */
	private boolean caissiereExperimentee;
	
	/**
	 * La liste des clients qui sont affectés à cette caisse
	 */
	private ConcurrentLinkedQueue<Client> fileClients;
	
	/**
	 * La durée de traitement des caddies de tous les clients affectés à cette caisse
	 */
	private int dureeTraitementCaisse;
	
	public Caisse(boolean caissiereExperimentee) {
		
		this.caissiereExperimentee = caissiereExperimentee;
		this.fileClients = new ConcurrentLinkedQueue<Client>();
	}

	// Getters et setters
	
	public boolean isCaissiereExperimentee() {
		return caissiereExperimentee;
	}

	public void setCaissiereExperimentee(boolean caissiereExperimentee) {
		this.caissiereExperimentee = caissiereExperimentee;
	}

	public ConcurrentLinkedQueue<Client> getFileClients() {
		return fileClients;
	}

	public void setFileClients(ConcurrentLinkedQueue<Client> fileClients) {
		this.fileClients = fileClients;
	}

	public int getDureeTraitementCaisse() {
		return dureeTraitementCaisse;
	}

	public void setDureeTraitementCaisse(int dureeTraitementCaisse) {
		this.dureeTraitementCaisse = dureeTraitementCaisse;
	}
	
	
}
