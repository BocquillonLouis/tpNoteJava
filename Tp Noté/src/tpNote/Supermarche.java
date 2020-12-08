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
		this.fileGLobale = new ConcurrentLinkedQueue<>();
		this.listeCaisses = new ArrayList<Caisse>(nbCaisses);
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
		
		// Indique si le client a été affecté ou non
		boolean clientAffecte = false;
		int i = 0;
		
		while (!clientAffecte) {
			
			/* Si on n'a pas affecté le client dans les caisses précédentes
			 *et qu'on arrive à la dernière, on l'affecte dans cette caise
			 */
			if (i == this.listeCaisses.get(i).getFileClients().size()) {
				
				this.listeCaisses.get(i).getFileClients().add(client);
				
				/* Ajout du temps de traitement du caddie de ce client au
				 * temps de traitement de la caisse
				 */
				if (this.listeCaisses.get(i).isCaissiereExperimentee()) {
					this.listeCaisses.get(i).setDureeTraitementCaisse(
							this.listeCaisses.get(i).getDureeTraitementCaisse() + client.getDureeTraitementCaddie() / 2);
				} else {
					this.listeCaisses.get(i).setDureeTraitementCaisse(
							this.listeCaisses.get(i).getDureeTraitementCaisse() + client.getDureeTraitementCaddie());
				}
				
				clientAffecte = true;
			} else {
			
				/* Ajout client dans la file de la caisse si aucun client dans la
				 * file de cette caisse ou si même nombre de clients dans la file
				 * de cette caisse et dans la suivante.
				 */
				if (this.listeCaisses.get(i).getFileClients().isEmpty()
						|| this.listeCaisses.get(i).getFileClients().size() <= this.listeCaisses.get(i + 1).getFileClients().size()) {
					
					this.listeCaisses.get(i).getFileClients().add(client);
					
					/* Ajout du temps de traitement du caddie de ce client au
					 * temps de traitement de la caisse
					 */
					if (this.listeCaisses.get(i).isCaissiereExperimentee()) {
						this.listeCaisses.get(i).setDureeTraitementCaisse(
								this.listeCaisses.get(i).getDureeTraitementCaisse() + client.getDureeTraitementCaddie() / 2);
					} else {
						this.listeCaisses.get(i).setDureeTraitementCaisse(
								this.listeCaisses.get(i).getDureeTraitementCaisse() + client.getDureeTraitementCaddie());
					}
					
					clientAffecte = true;
				}
			}
			
			// On incrémente i -> on passe à la caisse suivante
			i++;
		}
	}
	
	/**
	 * Ajouter un client à la file globale (liste des clients dans le supermarché)
	 */
	public void ajouterClient(Client clientAAjouter) {
		
		this.fileGLobale.add(clientAAjouter);
	}
	
	/**
	 * Changer le nombre de caisses
	 * @param nouveauNbCaisses Le nouveau nombre de caisses
	 */
	public void changerNbCaisses(int nouveauNbCaisses) {
		
		if (nouveauNbCaisses > this.nbCaisses) {
			
			// Ajouter des caisses
			while (nouveauNbCaisses < this.nbCaisses) {
				this.ajouterCaisse(false);
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
	public void ajouterCaisse(boolean caissiereExperimentee) {
		
		this.listeCaisses.add(new Caisse(caissiereExperimentee));
	}
	
	/**
	 * Supprimer une caisse
	 */
	public void supprimerCaisse() {
		
		int tailleListeCaisses = this.listeCaisses.size();
		
		// On récupère les clients qui étaient affectés à cette caisse
		ConcurrentLinkedQueue<Client> fileClients = listeCaisses.get(tailleListeCaisses - 1).getFileClients();
		
		// Et on les répartit dans d'autres caisses
		for (int i = 0; i < fileClients.size(); i++) {
			affecterCaisse(fileClients.remove());
		}
	}
	
}
