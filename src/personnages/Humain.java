package personnages;

import java.util.Objects;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argent;
	private int nbConnaissance = 0;
	private Humain[] memoire = new Humain[30];
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + this.nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFav + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boissonFav + " ! GLOUPS !");
	}
	
	private void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	private void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if(prix > this.argent) {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		} else {
			parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
			if(Objects.equals(bien, "une boisson")) {
				boire();
			}
		}
	}
	
	public void memoriser(Humain autreHumain) {
		if(this.nbConnaissance < 30) {
			this.memoire[this.nbConnaissance] = autreHumain;
			this.nbConnaissance++;
		} else {
			for(int i = 0; i < 29; i++) {
				this.memoire[i] = this.memoire[i+1];
			}
			this.memoire[29] = autreHumain;
		}
	}
	
	public void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	
	public void faireConnaissance(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
		
	}
	
	public void listerConnaissance() {
		String texte = "Je connais beaucoup de monde dont :";
		for(int i = 0; i < this.nbConnaissance-1; i++) {
			texte += " " + this.memoire[i].getNom() + ',';
		}
		texte += " " + this.memoire[this.nbConnaissance-1].getNom();
		parler(texte);
	}
	
}












