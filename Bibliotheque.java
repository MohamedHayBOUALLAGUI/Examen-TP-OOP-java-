package examenPratiqueJava;

import java.util.ArrayList;

public class Bibliotheque {
	
	private ArrayList <Document> livres;
	public Bibliotheque() {
		livres= new ArrayList<>();
		
	}
	
	//ajoute un document à la collection des documents et
	//ceci dans le cas où ce dernier n’existe pas déjà dans l’ArrayList
	public void ajouterDocument(Document doc)throws DocumentException{
		if(livres.contains(doc)) {
			throw new DocumentException("Document déjà existant!");
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
		throw new DocumentException("Le document souhaité n'existe pas!");
	} 
	//permet de supprimer le document passé en 
	//argument à partir de la collection
	public void supprimerDocument(Document doc)throws DocumentException{
		if(!livres.contains(doc)) {
			throw new DocumentException("Le document à supprimer n'existe pas!");
		}
		if(livres.size()==0) {
			throw new DocumentException("La biblio est vide!");
		}
		livres.remove(doc);
	}
	//permet de créer et de retourner une nouvelle liste des documents
	//triée par ordre décroissant de prix
	public ArrayList<Document> trierDocument()throws DocumentException{
		if(livres.size()==0) {
			throw new DocumentException("La biblio est déjà vide!");
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
	//renvoie le document le plus cher de la bibliothèque
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
	
	//permet d’afficher l’ensemble de documents de la bibliothèque
	public void afficherBib() {
		System.out.println("liste des documents de la bibliothèque : ");
		for(Document d:livres) {
			d.afficher();
		}
		
	}

}
