package histoire;

import personnages.*;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Yakuza leNoir = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.provoquer(leNoir);
	}
	
}
