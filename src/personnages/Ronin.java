package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (this.getArgent())/10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		this.perdreArgent((this.getArgent())/10);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai trouvé vermine, tu vas payer pour ce que tu as à ce pauvre marchand!");
		int force = (this.honneur) * 2;
		if(force >= adversaire.getReputation()) {
			adversaire.parler("J'ai perdu mon duel et mes " + adversaire.getArgent() + " sous, snif... J'ai déshonoré le clan de " + adversaire.getClan() + ".");
			this.gagnerArgent(adversaire.getArgent());
			adversaire.perdre(adversaire.getArgent());
			this.honneur += 1;
			parler("Je t'ai eu petit yakusa!");
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.parler("Ce ronin pensait vraiment battre " + adversaire.getNom() + " du clan de " + adversaire.getClan() + " ? Je l'ai dépouillé de ses " + this.getArgent() + " sous.");
			this.honneur -= 1;
			adversaire.gagner(this.getArgent());
			this.perdreArgent(this.getArgent());
		}
	}
}
