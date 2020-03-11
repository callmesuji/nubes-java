package com.nubes.ipl2020;

import java.sql.SQLException;
import java.util.List;

import com.nubes.internship.ipl.Player;

public class Manager {
	public static void main(String[] args) throws SQLException {
		ipl2020stat obj = new ipl2020stat();
		// obj.showPlayerInfo();
		// obj.showPlayerInfo();
		// obj.showPlayerCoachTeam();
		// obj.showTeamNameAndAmount();
		List<Player> players = obj.getPlayers();
		// players.stream().forEach(e -> System.out.println(e.getName() + " " +
		// e.getRole() + " " + e.getPrice() + " " + e.getLabel()));

		long count = players.stream().filter(p -> p.getPrice() == 2000000).count();
		System.out.println(count);

	}

}

/*
 * for (Player p : players) { System.out.println(p.getLabel());
 * System.out.println(p.getName()); System.out.println(p.getPrice());
 * System.out.println(p.getRole()); System.out.println("----**----"); }
 */