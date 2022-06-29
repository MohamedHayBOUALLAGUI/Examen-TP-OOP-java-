package examenPratiqueJava;

public class Journal extends Document {
	private String periode;
	
	public Journal (long isbn, String titre, String auteur, double prix, int nbPages,String periode) {
		super(isbn,titre,auteur,prix,nbPages);
		this.periode=periode;
	}
	
	public String getPeriode() {
		return periode;
	}
	
	public void setPeriod(String periode) {
		this.periode=periode;
	}
	
	
	@Override
	public String toString() {
		return "Journal: "+super.toString()+" [periode=" + periode + "]";
	}
	
	public void afficher() {
		System.out.println(this.toString());
	}

}
