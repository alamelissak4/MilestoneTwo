package Milestone2;

public class AllContact {
	private int number;
	private String name;
	private String phone;
	private String location;
	
	public AllContact(int number, String name, String phone, String location) {
		super();
		this.number = number;
		this.name = name;
		this.phone = phone;
		this.location = location;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone() {
		this.phone = phone;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation() {
		this.location = location;
	}

	@Override
	public String toString() {
		return "AllContact [number=" + number + ", name=" + name + ", phone=" + phone + ", location=" + location + "]";
	}
}
