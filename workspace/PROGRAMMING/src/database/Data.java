package database;
import org.springframework.jdbc.core.JdbcTemplate;
import database.CATEGORY;
import database.VIDEO;
import database.CHANNEL;
import database.PLAYLIST;

public class Data 
{
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveCATEGORY(CATEGORY c){  
	    String query="insert into CATEGORY values('"+c.getCATEGORY_ID()+"','"+c.getCATEGORY_NAME()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int saveVIDEO(VIDEO v){  
	    String query="insert into VIDEO values('"+v.getVIDEO_ID()+"','"+v.getVIDEO_NAME()+"','"+v.getCATEGORY_ID()+"')";  
	    return jdbcTemplate.update(query);  
	}
	public int saveCHANNEL(CHANNEL ch){  
	    String query="insert into CHANNEL values('"+ch.getCHANNEL_ID()+"','"+ch.getCHANNEL_NAME()+"','"+ch.getVIDEO_ID()+"','"+ch.getCATEGORY_ID()+"')";
	    return jdbcTemplate.update(query);  
	}
	public int savePLAYLIST(PLAYLIST p){  
	    String query="insert into PLAYLIST values('"+p.getPLAYLIST_ID()+"','"+p.getPLAYLIST_NAME()+"','"+p.getVIDEO_ID()+"','"+p.getCHANNEL_ID()+"')";  
	    return jdbcTemplate.update(query);  
	}
	public int displayCHANNEL_VIDEO(){
		String query= "select top 1000 [CHANNEL_NAME],[CHANNEL_ID],CH.[VIDEO_ID],VIDEO_NAME from [MYASSIGNMENT].[DBO].[ASSIGNMENT.CHANNEL] as CH join DBO.[ASSIGNMENT.VIDEO] as VI on CH.VIDEO_ID = VIDEO_ID";
		return jdbcTemplate.execute(query);
	}
	public int displayMAX_MIN_COUNTS(){
		String query= "select * from (select  Top 1 CHANNEL_ID,Count(VIDEO_ID) cnt  from [Myassignment].[dbo].[Assignment.Channel] group BY CHANNEL_ID Order by Count(VIDEO_ID) desc) MaxCnt UNION ALL select * from(select  Top 1 CHANNEL_ID,Count(VIDEO_ID) cnt  from [Myassignment].[dbo].[Assignment.Channel] group BY CHANNEL_ID Order by Count(VIDEO_ID))b";
		return jdbcTemplate.execute(query);
	}
	public int displayPLAYLISTS_VIDEOS(){
		String query= "SELECT [PLAYLIST_ID],[PLAYLIST_NAME],PL.[VIDEO_ID],V.VIDEO_NAME FROM [Myassignment].[dbo].[Assignment.Playlist] as PL Join [Myassignment].[dbo].[Assignment.Video] as V ON PL.VIDEO_ID=V.VIDEO_ID";
		return jdbcTemplate.execute(query);
	}
}
