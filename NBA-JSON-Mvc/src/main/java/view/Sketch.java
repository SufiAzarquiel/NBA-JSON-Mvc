package view;

import handler.Player;
import handler.WebHandler;

public class Sketch {
	public static void main(String[] args) {
//		WebHandler webHandlerTeams = new WebHandler("http://www.ies-azarquiel.es/paco/apinba/teams");
//		Team[] teams = webHandlerTeams.getTeams();
//		for (Team team : teams) {
//			System.out.println(team);
//		}

		WebHandler webHandlerPlayers = new WebHandler("http://www.ies-azarquiel.es/paco/apinba/players");
		Player[] players = webHandlerPlayers.getPlayers(); // Assuming you have a Player class
		for (Player player : players) {
			System.out.println(player);
		}
	}
}
