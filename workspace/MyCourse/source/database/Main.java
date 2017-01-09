package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;


public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String Server = "192.168.1.101";
		int port = 1433;
		String instance = "SQLEXPRESS";
		String user = "sa";
		String password = "avinash24";
		String database = "Myassignment";
		String T = "True";
		String jdbcurl;
		Connection con = null;
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} 
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		jdbcurl = "jdbc:sqlserver://" + Server + ":" + port + ";Instance =" + instance + ";user=" + user
					+ ";password=" + password + ";databasename=" + database + ";integrated security=" + T + "";
		try
		{
			con = DriverManager.getConnection(jdbcurl);
		} 
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			PreparedStatement pst = con.prepareStatement("Select * from (Select  Top 1 CHANNEL_ID,Count(VIDEO_ID) cnt  FROM [Myassignment].[dbo].[Assignment.Channel] group BY CHANNEL_ID Order by Count(VIDEO_ID) desc) MaxCnt UNION ALL Select * from(Select  Top 1 CHANNEL_ID,Count(VIDEO_ID) cnt  FROM [Myassignment].[dbo].[Assignment.Channel] group BY CHANNEL_ID Order by Count(VIDEO_ID))b");
			ResultSet rs = pst.executeQuery();
				
			while(rs.next())
			{
					System.out.println("CHANNEL_ID = " +rs.getInt("CHANNEL_ID")+"count= "+rs.getString("cnt"));
					//System.out.println("Count= " +rs.getInt("pst"));
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}
