package com.nubes.internship.ipl2020;

import java.sql.*;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nubes.internship.ipl.Player;

public class ipl2020stat {
	private static final String Team_Info = "select label,city,coach from team";
	private static final String Player_Info = "select name,price,p_role as role,label from player";
	private static final String Player_Coach_Team = "select p.name,p.p_role as role,p.label,t.coach,t.team_name as team from player p inner join team t on p.label = t.label";
	private static final String TEAM_AMOUNT = "select label,sum(price) as amount from player group by label order by amount;";

	public void showTeamINfo() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		DatabaseUtil dbUtil = DatabaseUtil.obj;

		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(Team_Info);
			while (rs.next()) {
				System.out.println(rs.getString("label"));
				System.out.println(rs.getString("city"));
				System.out.println(rs.getString("coach"));
				System.out.println("----------");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}

	}

	public void showPlayerInfo() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		DatabaseUtil dbUtil = DatabaseUtil.obj;

		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(Player_Info);
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("price"));
				System.out.println(rs.getString("role"));
				System.out.println(rs.getString("label"));
				System.out.println("----------");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}
	}

	public void showPlayerCoachTeam() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		DatabaseUtil dbUtil = DatabaseUtil.obj;

		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(Player_Coach_Team);
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("role"));
				System.out.println(rs.getString("label"));
				System.out.println(rs.getString("coach"));
				System.out.println(rs.getString("team"));
				System.out.println("-----**-----");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}
	}

	public void showTeamNameAndAmount() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		DatabaseUtil dbUtil = DatabaseUtil.obj;

		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(TEAM_AMOUNT);
			while (rs.next()) {
				System.out.println(rs.getString("label"));
				System.out.println(rs.getDouble("amount"));

				System.out.println("-----**-----");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}
	}

	public List<Player> getPlayers() {
		List<Player> players = new ArrayList<>();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		DatabaseUtil dbUtil = DatabaseUtil.obj;

		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(Player_Info);
			while (rs.next()) {
				String name = rs.getString("name");
				Double price = rs.getDouble("price");
				String role = rs.getString("role");
				String label = rs.getString("label");
				Player player = new Player(name, role, label, price);
				players.add(player);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}
		return players;
	}

}
