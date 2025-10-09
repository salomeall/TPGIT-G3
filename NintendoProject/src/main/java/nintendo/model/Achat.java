package nintendo.model;

public class Achat {
	
	private Jeu jeu;
	private String date; 
	private double prix;
	
	public Achat(Jeu jeu, String date, double prix) {
		super();
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}

	public Jeu getJeu() {
		return jeu;
	}

	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + "]";
	}
	
	
	
	
	

}
