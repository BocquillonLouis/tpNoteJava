package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpNote.Client;
import tpNote.Supermarche;

class testSupermarche {
	
	public Supermarche supermarche;
	
	@BeforeEach
	void initialisation() {
		
		// Création supermarché, et ajout de 2 caisses classiques
		supermarche = new Supermarche(2);
		supermarche.ajouterCaisse(false);
		supermarche.ajouterCaisse(true);
		
		supermarche.ajouterClient(new Client(0, 2));
		supermarche.ajouterClient(new Client(0, 2));
		supermarche.ajouterClient(new Client(0, 2));
		supermarche.ajouterClient(new Client(1, 2));
	}

	@Ignore
	void testAjoutClient() {
		
		supermarche.ajouterClient(new Client(0, 2));
		supermarche.ajouterClient(new Client(0, 2));
		supermarche.ajouterClient(new Client(0, 2));
		supermarche.ajouterClient(new Client(1, 2));
		
		if (supermarche.fileGLobale.size() != 4) {
			fail("Les clients n'ont pas été bien ajoutés dans la file globale.");
		}
	}
	
	@Test
	void testaffecterCaisse() {
		
		while (!supermarche.fileGLobale.isEmpty()) {
			supermarche.affecterCaisse(supermarche.fileGLobale.poll());
		}
		
		System.out.println();
	}

}
