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
	
	/**
	 * Retourne un boolean indiquant si la caisiière est expérimentée ou non
	 * @return Un boolean indiquant si la caisiière est expérimentée ou non
	 */
	public boolean isCaissiereExperimentee() {
		return caissiereExperimentee;
	}

	/**
	 * Changer la valeur du boolean indiquand si la caisiière est expérimentée ou non
	 * @param caissiereExperimentee Un boolean indiquant si la caisiière est expérimentée ou non
	 */
	public void setCaissiereExperimentee(boolean caissiereExperimentee) {
		this.caissiereExperimentee = caissiereExperimentee;
	}

	/**
	 * Retourne la liste des clients de cette caisse
	 * @return la liste des clients de cette caisse
	 */
	public ConcurrentLinkedQueue<Client> getFileClients() {
		return fileClients;
	}

	/**
	 * Retourne la durée de traitement des caddies de tous les clients
	 * @return La durée de traitement des caddies de tous les clients de cette caisse
	 */
	public int getDureeTraitementCaisse() {
		return dureeTraitementCaisse;
	}

	/**
	 * changer la durée de traitement des caddies de tous les clients
	 * @param La durée de traitement des caddies de tous les clients de cette caisse
	 */
	public void setDureeTraitementCaisse(int dureeTraitementCaisse) {
		this.dureeTraitementCaisse = dureeTraitementCaisse;
	}
	
}
