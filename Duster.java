package day21;

public class Duster {
	private int price;
	private String metirial;
	private boolean isWhiteBoardDuster;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMetirial() {
		return metirial;
	}
	public void setMetirial(String metirial) {
		this.metirial = metirial;
	}
	public boolean isWhiteBoardDuster() {
		return isWhiteBoardDuster;
	}
	public void setWhiteBoardDuster(boolean isWhiteBoardDuster) {
		this.isWhiteBoardDuster = isWhiteBoardDuster;
	}
	public Duster(int price, String metirial, boolean isWhiteBoardDuster) {
		super();
		this.price = price;
		this.metirial = metirial;
		this.isWhiteBoardDuster = isWhiteBoardDuster;
	}
	@Override
	public String toString() {
		return "Duster [price=" + price + ", metirial=" + metirial + ", isWhiteBoardDuster=" + isWhiteBoardDuster + "]";
	}
	

}
