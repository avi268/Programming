package database;

public class PLAYLIST 
{
	private String PLAYLIST_ID;
	public String getPLAYLIST_ID() {
		return PLAYLIST_ID;
	}
	public void setPLAYLIST_ID(String pLAYLIST_ID) {
		PLAYLIST_ID = pLAYLIST_ID;
	}
	private String PLAYLIST_NAME;
	public String getPLAYLIST_NAME() {
		return PLAYLIST_NAME;
	}
	public void setPLAYLIST_NAME(String pLAYLIST_NAME) {
		PLAYLIST_NAME = pLAYLIST_NAME;
	}
	private String VIDEO_ID;
	public String getVIDEO_ID() {
		return VIDEO_ID;
	}
	public void setVIDEO_ID(String vIDEO_ID) {
		VIDEO_ID = vIDEO_ID;
	}
	private String CHANNEL_ID;
	public String getCHANNEL_ID() {
		return CHANNEL_ID;
	}
	public void setCHANNEL_ID(String cHANNEL_ID) {
		CHANNEL_ID = cHANNEL_ID;
	}
	private VIDEO VIDEO;
	public VIDEO getVIDEO() {
		return VIDEO;
	}
	public void setVIDEO(VIDEO vIDEO) {
		VIDEO = vIDEO;
	}
	private CHANNEL CHANNEL;
	public CHANNEL getCHANNEL() {
		return CHANNEL;
	}
	public void setCHANNEL(CHANNEL cHANNEL) {
		CHANNEL = cHANNEL;
	}
}
