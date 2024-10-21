package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (this.argent)/10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		this.argent *= 0.9;
	}
}
