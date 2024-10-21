package histoire;

import personnages.*;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
	}
	
}
