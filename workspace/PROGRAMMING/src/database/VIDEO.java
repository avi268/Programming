package database;

public class VIDEO 
{
	private String VIDEO_NAME;
	private String VIDEO_ID;
	private String CATEGORY_ID;
	public VIDEO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VIDEO(String vIDEO_NAME, String vIDEO_ID, String cATEGORY_ID) {
		super();
		VIDEO_NAME = vIDEO_NAME;
		VIDEO_ID = vIDEO_ID;
		CATEGORY_ID = cATEGORY_ID;
	}
	public String getVIDEO_NAME() {
		return VIDEO_NAME;
	}
	public void setVIDEO_NAME(String vIDEO_NAME) {
		VIDEO_NAME = vIDEO_NAME;
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
	private CATEGORY CATEGORY;
	public CATEGORY getCATEGORY() {
		return CATEGORY;
	}
	public void setCATEGORY(CATEGORY cATEGORY) {
		CATEGORY = cATEGORY;
	}
}
