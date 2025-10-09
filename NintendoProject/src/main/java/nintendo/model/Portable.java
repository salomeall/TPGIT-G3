package nintendo.model;

public class Portable extends Console{

	public Portable(String nom, double prix, String dateSortie) {
		super(nom, prix, dateSortie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Portable [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}



}
