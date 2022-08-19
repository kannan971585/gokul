package day21;

public class Candidates {
	String name;
	String dig;
	int id;
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDig() {
		return dig;
	}
	public void setDig(String dig) {
		this.dig = dig;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Candidates(String name, String dig, int id, String gender) {
		super();
		this.name = name;
		this.dig = dig;
		this.id = id;
		this.gender = gender;
	}
	public String toString() {
		return "name=" + name + ", dig=" + dig + ", id=" + id + ", gender=" + gender ;
	}
	

}
