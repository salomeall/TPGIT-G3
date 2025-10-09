package nintendo.model;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private List<Achat> achats;

	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.achats = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Achat> getAchats() {
		return achats;
	}

	public void setAchats(List<Achat> achats) {
		this.achats = achats;
	}

	 public void ajouterAchat(Achat achat) {
	        this.achats.add(achat);
	    }
	 
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", achats=" + achats + "]";
	}

}
