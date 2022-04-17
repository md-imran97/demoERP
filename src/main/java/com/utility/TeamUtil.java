package com.utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Team;

public class TeamUtil {

	public static List<Team> rsToTeams(ResultSet rs) throws SQLException
	{
		List<Team> teams=new ArrayList<Team>();
		while(rs.next())
		{
			Team t=new Team();
			t.setTeamId(rs.getInt("team_id"));
			t.setTeamName(rs.getString("team_name"));
			t.setTeamStatus(rs.getInt("team_status"));
			t.setProjectId(rs.getInt("project_id"));
			teams.add(t);
		}
		return teams;
	}
	
	public static Team rsToTeam(ResultSet rs) throws SQLException
	{
		Team team=null;
		while(rs.next())
		{
			team=new Team();
			team.setTeamId(rs.getInt("team_id"));
			team.setTeamName(rs.getString("team_name"));
			team.setTeamStatus(rs.getInt("team_status"));
			team.setProjectId(rs.getInt("project_id"));
		}
		return team;
	}
}