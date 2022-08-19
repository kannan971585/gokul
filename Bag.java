package day21;

public class Bag {
	private String brand;
	private int price;
	private int noOfZip;
	private boolean isWaterProof;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfZip() {
		return noOfZip;
	}
	public void setNoOfZip(int noOfZip) {
		this.noOfZip = noOfZip;
	}
	public boolean isWaterProof() {
		return isWaterProof;
	}
	public void setWaterProof(boolean isWaterProof) {
		this.isWaterProof = isWaterProof;
	}
	public Bag(String brand, int price, int noOfZip, boolean isWaterProof) {
		super();
		this.brand = brand;
		this.price = price;
		this.noOfZip = noOfZip;
		this.isWaterProof = isWaterProof;
	}
	@Override
	public String toString() {
		return "Bag [brand=" + brand + ", price=" + price + ", noOfZip=" + noOfZip + ", isWaterProof=" + isWaterProof
				+ "]";
	}
	
	

}
