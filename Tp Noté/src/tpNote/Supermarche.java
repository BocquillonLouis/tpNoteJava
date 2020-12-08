package tpNote;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Supermarche {

	/** 
	 * La liste des clients dans le supermarché
	 */
	public ConcurrentLinkedQueue<Client> fileGLobale;
	
	/**
	 * Le nombre de caisses du supermarché
	 */
	public int nbCaisses;
	
	/**
	 * La liste des caisses du supermarché
	 */
	public ArrayList<Caisse> listeCaisses;

	public Supermarche(int nbCaisses) {
		super();
		
		this.nbCaisses = nbCaisses;
		this.fileGLobale = null;
		this.listeCaisses = new ArrayList<Caisse>(20);
	}
	
	/**
	 * Simuler le fonctionnement du supermarché (arrivée des clients, passages en caisse)
	 */
	public void simulation() {
		
	}
	
	/**
	 * Calculer le temps de traitement des caddies de tous les clients
	 * @return le temps de traitement des caddies de tous les clients
	 */
	public int calculerTemps() {
		
		// STUB
		return 0;
	}
	
	/**
	 * Affecter une caisse à tous les clients
	 */
	public void affecterCaisse(Client client) {
		
		
	}
	
	/**
	 * Ajouter un client à la file globale (liste des clients dans le supermarché)
	 */
	public void ajouterClient(Client clientAAjouter) {
		
		this.fileGLobale.add(clientAAjouter);
	}
	
	/**
	 * Supprimer un client à la file globale (liste des clients dans le supermarché)
	 */
	public void supprimerClient() {
		
		
	}
	
	/**
	 * Changer le nombre de caisses
	 * @param nouveauNbCaisses Le nouveau nombre de caisses
	 */
	public void changerNbCaisses(int nouveauNbCaisses) {
		
		if (nouveauNbCaisses > this.nbCaisses) {
			
			// Ajouter des caisses
			while (nouveauNbCaisses < this.nbCaisses) {
				this.ajouterCaisse();
			}
			
		} else {
			
			// Supprimer des caisses
			while (nouveauNbCaisses > this.nbCaisses) {
				this.supprimerCaisse();
				this.listeCaisses.remove(this.listeCaisses.size() - 1);
			}
			
		}
		
		this.nbCaisses = nouveauNbCaisses;
	}
	
	/**
	 * Ajouter une caisse
	 */
	public void ajouterCaisse() {
		
		this.listeCaisses.add(new Caisse(false));
	}
	
	/**
	 * Supprimer une caisse
	 */
	public void supprimerCaisse() {
		
		int tailleListeCaisses = this.listeCaisses.size();
		
		// On récupère les clients qui étaient affectés à cette caisse
		ConcurrentLinkedQueue<Client> fileClients = listeCaisses.get(tailleListeCaisses - 1).fileClients;
		
		// Et on les répartit dans d'autres caisses
		for (int i = 0; i < fileClients.size(); i++) {
			affecterCaisse(fileClients.remove());
		}
	}
	
}
