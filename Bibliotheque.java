package examenPratiqueJava;

import java.util.ArrayList;

public class Bibliotheque {
	
	private ArrayList <Document> livres;
	public Bibliotheque() {
		livres= new ArrayList<>();
		
	}
	
	//ajoute un document � la collection des documents et
	//ceci dans le cas o� ce dernier n�existe pas d�j� dans l�ArrayList
	public void ajouterDocument(Document doc)throws DocumentException{
		if(livres.contains(doc)) {
			throw new DocumentException("Document d�j� existant!");
		}
		livres.add(doc);
	}
	
	// permet de chercher un document dans la collection
	//en fonction de son titre
	public Document chercherDocument(String titre)throws DocumentException {
		for(Document d:livres) {
			if(titre.equals(d.titre)) {
				return d;
			}
		}
		throw new DocumentException("Le document souhait� n'existe pas!");
	} 
	//permet de supprimer le document pass� en 
	//argument � partir de la collection
	public void supprimerDocument(Document doc)throws DocumentException{
		if(!livres.contains(doc)) {
			throw new DocumentException("Le document � supprimer n'existe pas!");
		}
		if(livres.size()==0) {
			throw new DocumentException("La biblio est vide!");
		}
		livres.remove(doc);
	}
	//permet de cr�er et de retourner une nouvelle liste des documents
	//tri�e par ordre d�croissant de prix
	public ArrayList<Document> trierDocument()throws DocumentException{
		if(livres.size()==0) {
			throw new DocumentException("La biblio est d�j� vide!");
		}
		ArrayList<Document> livresTmp=new ArrayList<>(livres);
		ArrayList<Document> livresTrie=new ArrayList<>();
		Document doc=null;
		double prix=0;
		while(livresTmp.size()>0) {
			for(Document d:livresTmp) {
				if(d.prix>prix) {
					prix=d.prix;
					doc=d;
				}
			
			}
			livresTrie.add(doc);
			livresTmp.remove(doc);
		
		}
		return livresTrie;
	}
	//renvoie le document le plus cher de la biblioth�que
	public Document docPlusCher() {
		
		try {
			ArrayList<Document> livresTrie;
			livresTrie = trierDocument();
			return livresTrie.get(0);
		} catch (DocumentException e) {
			
			 e.printStackTrace();
		}
		return null;
	} 
	
	//permet d�afficher l�ensemble de documents de la biblioth�que
	public void afficherBib() {
		System.out.println("liste des documents de la biblioth�que : ");
		for(Document d:livres) {
			d.afficher();
		}
		
	}

}
