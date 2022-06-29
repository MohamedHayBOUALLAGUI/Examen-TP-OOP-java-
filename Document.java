package examenPratiqueJava;

public class Document implements CompareDoc {
	protected long isbn;
	protected String titre;
	protected String auteur;
	protected double prix;
	protected int nbPages;
	
	public Document(long isbn, String titre, String auteur, double prix, int nbPages) {
		super();
		this.isbn = isbn;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.nbPages = nbPages;
	}
	//permet de comparer deux documents et de retourner le 
	//document le plus cher
	public Document plusCher(Document doc) {
		if(this.prix>=doc.prix) {
			return this;
		}else {
			return doc;
		}
		
	}
	//permet de comparer deux documents et de retourner
	//le document le plus volumineux en fonction du nombre de pages
	
	public Document plusVolumineux (Document doc){
		
		if(this.nbPages>=doc.nbPages) {
			return this;
		}else {
			return doc;
		}
		
	}
	@Override
	public String toString() {
		return "Document [isbn=" + isbn + ", titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", nbPages="
				+ nbPages + "]";
	}
	
	
	public void afficher() {
		System.out.println(this.toString());
	}
	

}
