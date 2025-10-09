package nintendo.model;

abstract class Console {

	protected String nom;
	protected int prix;
	protected String dateSortie;

	public Console(String nom,int prix,String dateSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
				
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
