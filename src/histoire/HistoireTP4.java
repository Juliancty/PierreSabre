package histoire;

import personnages.*;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Yakuza leNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		leNoir.direBonjour();
		leNoir.extorquer(marco);
	}
	
}
