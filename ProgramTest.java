package examenPratiqueJava;

public class ProgramTest {

	public static void main(String[] args) {
		try {
			//Créer une bibliothèque 
			Bibliotheque Bib=new Bibliotheque();
			//ajouter un ensemble de documents à cette bibliothèque.
			Journal J1=new Journal(1234,"titre1","auteur1",25.5,120,"Janvier");
			Journal J2=new Journal(2425,"titre2","auteur2",45.5,150,"Fevrier");
			Roman R1=new Roman(3587,"titre3","auteur3",54.8,250,"Policier");
			Roman R2=new Roman(4574,"titre3","auteur3",100.8,287,"thriller");

			Bib.ajouterDocument(J1);
			Bib.ajouterDocument(J2);
			Bib.ajouterDocument(R1);
			Bib.ajouterDocument(R2);
			// Afficher l’ensemble de documents de la bibliothèque.
			
			J1.afficher();
			J2.afficher();
			R1.afficher();
			R2.afficher();
			System.out.println("------------contenu de la biblio---------");
			Bib.afficherBib();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	


	}

	}


