package day21;

public class Car {
	private String brand;
	private int price;
	private String chasisNo;
	private int  vNo;
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
	public String getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}
	public int getvNo() {
		return vNo;
	}
	public void setvNo(int vNo) {
		this.vNo = vNo;
	}
	public Car(String brand, int price, String chasisNo, int vNo) {
		super();
		this.brand = brand;
		this.price = price;
		this.chasisNo = chasisNo;
		this.vNo = vNo;
	}
	@Override
	public String toString() {
		return "brand=" + brand + ", price=" + price + ", chasisNo=" + chasisNo + ", vNo=" + vNo ;
	}
	

}
