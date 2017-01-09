package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main1 
{
	public static void main(String[] args) throws Exception
	{
		
		category_Table();
		video_Table();
		channel_Table();
		playlist_Table();
		category_Insert();
		video_Insert();
		channel_Insert();
		playlist_Insert();
		get();
		getter();
	}
	
	public static ArrayList<String> get() throws Exception
	{
		try
		{
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT TOP 1000 [CHANNEL_NAME],[CHANNEL_ID],CH.[VIDEO_ID],VIDEO_NAME FROM [MYASSIGNMENT].[DBO].[ASSIGNMENT.CHANNEL] AS CH JOIN DBO.[ASSIGNMENT.VIDEO] AS VI ON CH.VIDEO_ID = VIDEO_ID");
			
			ResultSet result = statement.executeQuery();
			ArrayList<String> array = new ArrayList<String>();
			while(result.next())
			{
				System.out.print(result.getString("CHANNEL_NAME"));
				System.out.print("");
				System.out.print(result.getString("CHANNEL_ID"));
				System.out.print("");
				System.out.print(result.getString("CH.[VIDEO_ID]"));
				System.out.print("");
				System.out.print(result.getString("VIDEO_NAME"));
				
				array.add(result.getString("CHANNEL_ID"));
			}
			System.out.println("Output for a list of all the channels along with its videos");
			return array;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	public static ArrayList<String> getter() throws Exception
	{
		try
		{
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("Select * from (Select  Top 1 CHANNEL_ID,Count(VIDEO_ID) cnt  FROM [Myassignment].[dbo].[Assignment.Channel] group BY CHANNEL_ID Order by Count(VIDEO_ID) desc) MaxCnt UNION ALL Select * from(Select  Top 1 CHANNEL_ID,Count(VIDEO_ID) cnt  FROM [Myassignment].[dbo].[Assignment.Channel] group BY CHANNEL_ID Order by Count(VIDEO_ID))b");
			
			ResultSet result = statement.executeQuery();
			ArrayList<String> array = new ArrayList<String>();
			while(result.next())
			{
				
				System.out.print(result.getString("CHANNEL_ID"));
				System.out.print("");
				System.out.print(result.getString("cnt"));
				System.out.print("    ");
				
				array.add(result.getString("CHANNEL_ID"));
			}
			System.out.println("Output for channel with maximum and minimum video counts.");
			return array;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	public static void  category_Insert() throws Exception
	{
		final String var1 = "CID1";
		final String var2 = "POP";
		try
		{
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("Insert into CATEGORY(CATEGORY_ID,CATEGORY_NAME ) VALUES('"+var1+"','"+var2+"')");
			posted.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Insertion Completed");
		}
	}
	public static void  video_Insert() throws Exception
	{
		final String var1 = "V1";
		final String var2 = "VID1";
		final String var3 = "CID3";
		try
		{
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("Insert into CATEGORY(VIDEO_ID,VIDEO_NAME,CATEGORY_ID ) VALUES('"+var1+"','"+var2+"','"+var3+"')");
			posted.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Insertion Completed");
		}
	}
	public static void  channel_Insert() throws Exception
	{
		final String var1 = "A";
		final String var2 = "Q1";
		final String var3 = "VID1";
		final String var4 = "CID3";
		try
		{
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("Insert into CHANNEL(CHANNEL_NAME,CHANNEL_ID, VIDEO_ID,CATEGORY_ID ) VALUES('"+var1+"','"+var2+"','"+var3+"','"+var4+"')");
			posted.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Insertion Completed");
		}
	}
	public static void  playlist_Insert() throws Exception
	{
		final String var1 = "PD1";
		final String var2 = "P1";
		final String var3 = "VID1";
		final String var4 = "CID3";
		try
		{
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("Insert into PLAYLIST(PLAYLIST_ID,PLAYLIST_NAME,VIDEO_ID,CHANNEL_ID ) VALUES('"+var1+"','"+var2+"','"+var3+"','"+var4+"')");
			posted.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Insertion Completed");
		}
	}
	public static void category_Table() throws Exception
	{
		try
		{
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS Category(CATEGORY_ID  int NOT NULL AUTO_INCREMENT, CATEGORY_NAME varchar(255), PRIMARY KEY(CATEGORY_ID))");
			create.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Function Complete.");
		}
	}
	public static void video_Table() throws Exception
	{
		try
		{
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS VIDEO(VIDEO_ID  int NOT NULL AUTO_INCREMENT, VIDEO_NAME varchar(255),CATEGORY_ID int NOT NULL AUTO_INCREMENT, PRIMARY KEY(CATEGORY_ID,VIDEO_ID))");
			create.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Function Complete.");
		}
	}
	public static void channel_Table() throws Exception
	{
		try
		{
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS CHANNEL(CHANNEL_ID  int NOT NULL AUTO_INCREMENT, CHANNEL_NAME varchar(255),VIDEO_ID int NOT NULL AUTO_INCREMENT,CATEGORY_ID int NOT NULL AUTO_INCREMENT, PRIMARY KEY(CHANNEL_ID,VIDEO_ID,CATEGORY_ID))");
			create.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Function Complete.");
		}
	}
	public static void playlist_Table() throws Exception
	{
		try
		{
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS PLAYLIST(PLAYLIST_ID  int NOT NULL AUTO_INCREMENT, PLAYLIST_NAME varchar(255),VIDEO_ID int NOT NULL AUTO_INCREMENT,CHANNEL_ID int NOT NULL AUTO_INCREMENT, PRIMARY KEY(PLAYLIST_ID, VIDEO_ID,CHANNEL_ID))");
			create.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Function Complete.");
		}
	}
	public static Connection getConnection() throws Exception
	{

		try
		{
			String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			//String url = "jdbc:sqlserver://192.168.1.101:1433;SQLEXPRESS/Interview";
			//String username = "sa";
			//String password = "avinash24";
			Class.forName(driver);
		
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://192.168.1.101:1433;username = sa; password ={avinash24}");
			System.out.println("Connected");
			return conn;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

}
