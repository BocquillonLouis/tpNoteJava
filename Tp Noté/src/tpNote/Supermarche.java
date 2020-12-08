package tpNote;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Supermarche {

	/** 
	 * La liste des clients dans le supermarch�
	 */
	public ConcurrentLinkedQueue<Client> fileGLobale;
	
	/**
	 * Le nombre de caisses du supermarch�
	 */
	public int nbCaisses;
	
	/**
	 * La liste des caisses du supermarch�
	 */
	public ArrayList<Caisse> listeCaisses;

	public Supermarche(int nbCaisses) {
		super();
		
		this.nbCaisses = nbCaisses;
		this.fileGLobale = new ConcurrentLinkedQueue<>();
		this.listeCaisses = new ArrayList<Caisse>(nbCaisses);
	}
	
	/**
	 * Simuler le fonctionnement du supermarch� (arriv�e des clients, passages en caisse)
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
	 * Affecter une caisse � tous les clients
	 */
	public void affecterCaisse(Client client) {
		
		// Indique si le client a �t� affect� ou non
		boolean clientAffecte = false;
		int i = 0;
		
		while (!clientAffecte) {
			
			/* Si on n'a pas affect� le client dans les caisses pr�c�dentes
			 *et qu'on arrive � la derni�re, on l'affecte dans cette caise
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
				 * file de cette caisse ou si m�me nombre de clients dans la file
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
			
			// On incr�mente i -> on passe � la caisse suivante
			i++;
		}
	}
	
	/**
	 * Ajouter un client � la file globale (liste des clients dans le supermarch�)
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
		
		// On r�cup�re les clients qui �taient affect�s � cette caisse
		ConcurrentLinkedQueue<Client> fileClients = listeCaisses.get(tailleListeCaisses - 1).getFileClients();
		
		// Et on les r�partit dans d'autres caisses
		for (int i = 0; i < fileClients.size(); i++) {
			affecterCaisse(fileClients.remove());
		}
	}
	
}
