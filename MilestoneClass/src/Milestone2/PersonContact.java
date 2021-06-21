package Milestone2;

public class PersonContact extends AllContact {
	private String birthday;
	private String description;
	
	public PersonContact(int number, String name, String phone, String location) {
		super(number, name, phone, location);
	}
	
	public PersonContact(int number, String name, String phone, String location, String birthday, String description) {
		super(number, name, phone, location);
		this.birthday = birthday;
		this.description = description;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public void setWebsite(String website) {
		// TODO Auto-generated method stub
		
	}

	public String getWebsite() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setHours(String hours) {
		// TODO Auto-generated method stub
		
	}

	public String getHours() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "PersonContact [birthday=" + birthday + ", description=" + description + ", toString()="
				+ super.toString() + "]";
	}


	
}
