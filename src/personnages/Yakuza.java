package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public String getClan() {
		return clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int sommeExtorquee = victime.seFaireExtorquer();
		this.reputation += 1;
		this.gagnerArgent(sommeExtorquee);
		parler("J'ai piqu� les " + sommeExtorquee + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
	}
	
	public void perdre(int perte) {
		this.gagnerArgent(perte);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui  de " + this.clan);
	}
}
