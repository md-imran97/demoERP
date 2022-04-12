package com.utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Project;

public class ProjectUtil {

	public static List<Project> rsToProjects(ResultSet rs) throws SQLException
	{
		List<Project> projects=new ArrayList<Project>();
		while(rs.next())
		{
			Project p=new Project();
			
			p.setProjectId(rs.getInt("project_id"));
			p.setProjectName(rs.getString("project_name"));
			p.setProjectClientName(rs.getString("project_client_name"));
			p.setProjectClientEmail(rs.getString("project_client_email"));
			p.setProjectStatus(rs.getInt("project_status"));
			
			projects.add(p);
		}
		return projects;
	}
}