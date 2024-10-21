package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
	}
	
	public int seFaireExtorquer() {
		int sommeExtorquee = this.argent;
		this.argent = 0;
		parler("J'ai tout perdu! Le monde est trop injuste !");
		return sommeExtorquee;
	}
	
	public void recevoir(int argent) {
		this.argent += argent;
		parler(argent + " sous ! Je te remercie g�n�reux donateurs!");
	}
}
