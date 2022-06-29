package examenPratiqueJava;

public class Roman extends Document {
	private String type;
	
	public Roman(long isbn, String titre, String auteur, double prix, int nbPages,String type) {
		super(isbn,titre,auteur,prix,nbPages);
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	@Override
	public String toString() {
		return "Roman: "+super.toString()+" [type=" + getType() + "]";
	}
	
	@Override
	public void afficher() {
		System.out.println(this.toString());
	}
	

}
