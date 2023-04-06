package LensLabProject;

public class Lens {
	private int ID;
	private double LensNo;
	private String color;
	private boolean isDelivered;
	
	
	public Lens(int id, double lensNo, String color, boolean isDelivered) {
		this.ID = id;
		this.LensNo = lensNo;
		this.color = color;
		this.isDelivered = isDelivered;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public double getLensNo() {
		return LensNo;
	}


	public void setLensNo(double lensNo) {
		LensNo = lensNo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isDelivered() {
		return isDelivered;
	}


	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	
	
	
	
	
	
	
}
