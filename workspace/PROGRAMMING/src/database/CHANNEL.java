package database;

public class CHANNEL 
{
	private String CHANNEL_NAME;
	private String CHANNEL_ID;
	private String VIDEO_ID;
	private String CATEGORY_ID;
	public CHANNEL() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public CHANNEL(String cHANNEL_NAME, String cHANNEL_ID, String vIDEO_ID, String cATEGORY_ID) {
		super();
		CHANNEL_NAME = cHANNEL_NAME;
		CHANNEL_ID = cHANNEL_ID;
		VIDEO_ID = vIDEO_ID;
		CATEGORY_ID = cATEGORY_ID;
	}
	public String getCHANNEL_NAME() {
		return CHANNEL_NAME;
	}
	public void setCHANNEL_NAME(String cHANNEL_NAME) {
		CHANNEL_NAME = cHANNEL_NAME;
	}
	
	public String getCHANNEL_ID() {
		return CHANNEL_ID;
	}
	public void setCHANNEL_ID(String cHANNEL_ID) {
		CHANNEL_ID = cHANNEL_ID;
	}
	
	public String getVIDEO_ID() {
		return VIDEO_ID;
	}
	public void setVIDEO_ID(String vIDEO_ID) {
		VIDEO_ID = vIDEO_ID;
	}
	
	public String getCATEGORY_ID() {
		return CATEGORY_ID;
	}
	public void setCATEGORY_ID(String cATEGORY_ID) {
		CATEGORY_ID = cATEGORY_ID;
	}
	private VIDEO VIDEO;
	public VIDEO getVIDEO() {
		return VIDEO;
	}
	public void setVIDEO(VIDEO vIDEO) {
		VIDEO = vIDEO;
	}
	private CATEGORY CATEGORY;
	public CATEGORY getCATEGORY() {
		return CATEGORY;
	}
	public void setCATEGORY(CATEGORY cATEGORY) {
		CATEGORY = cATEGORY;
	}
}
