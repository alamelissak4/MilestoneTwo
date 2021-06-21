package Milestone2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	List<AllContact> allContact = new ArrayList<>();
	Scanner sc = new Scanner(System.in);


public void open() {
	// AllContact(int number, String name, String phone, String location)
	allContact.add(new PersonContact(4805555, "Pete", "Cell", "AZ", "Feb 23", "Dad"));
	allContact.add(new BusinessContact(5505555, "BOBS", "Work", "AZ", "5-10", "bobs.com"));
	
	menu();
}

public void menu() {
	do {
		System.out.println("===========");
		System.out.println(" MAIN MENU ");
		System.out.println("===========");
		System.out.println(" 1. Add a Personal Contact (C)");
		System.out.println(" 2. Add a Business Contact (C)");
		System.out.println(" 3. View all Contacts (R)");
		System.out.println(" 4. Update a Contact (U)");
		System.out.println(" 5. Delete a Contact (D)");
		System.out.println(" 6. Exit");
		System.out.println("===========");
		System.out.println("What option to perform? ");
		int option = sc.nextInt();
		sc.nextLine();

		switch (option) {
		case 1:
			addPersonContact();
			break;
		case 2:
			addBusinessContact();
			break;
		case 3:
			viewAllContact();
			break;
		case 4:
			updateAllContact();
			break;
		case 5:
			deleteAllContact();
			break;
		case 6:
			System.out.println("Now leaving the Address Book.");
			System.exit(0);
			break;
		default:
			System.out.println("Please enter a different option: ");
		}
	}while(true);	
}

private void deleteAllContact() {
	System.out.println("===========");
	System.out.println(" DELETE MENU ");
	System.out.println("===========");
	System.out.println("Deleting a item... ");
	
	viewAllContact();
	System.out.println("===========");
	System.out.println("What item do you want to delete? ");
	int item = sc.nextInt();
	sc.nextLine();
	allContact.remove(item - 1);
}

private void updateAllContact() {
	System.out.println("===========");
	System.out.println(" UPDATE MENU ");
	System.out.println("===========");
	System.out.println("Updating menu...");
	
	viewAllContact();
	System.out.println("===========");
	
	System.out.println("What item do you want to update? ");
	int item = sc.nextInt();
	sc.nextLine();
	updatePersonContact(item);
}

private void updatePersonContact(int item) {
	System.out.println("===========");
	System.out.println(" CREATE MENU ");
	System.out.println("===========");
	
	// AllContact(int number, String name, String phone, String location)
	System.out.println("What is the phone number? [" + allContact.get(item - 1).getNumber() + "]");
	int number = sc.nextInt();
	sc.nextLine();
	allContact.get(item - 1).setNumber(number);
	System.out.println("What is the name? [" + allContact.get(item - 1).getName() + "]");
	String name = sc.nextLine();
	allContact.get(item - 1).setName(name);
	System.out.println("What kind of phone is it? [" + allContact.get(item - 1).getPhone() + "]");
	String phone = sc.nextLine();
	allContact.get(item - 1).setPhone();
	System.out.println("Where is it located? [" + allContact.get(item - 1).getLocation() + "]");
	String location = sc.nextLine();
	allContact.get(item - 1).setLocation();
	System.out.println("When is their Birthday? [" + ((PersonContact)allContact.get(item - 1)).getBirthday() + "]");
	String birthday = sc.nextLine();
	((PersonContact)allContact.get(item - 1)).setBirthday(birthday);
	System.out.println("What description? [" + ((PersonContact)allContact.get(item - 1)).getDescription() + "]");
	String description = sc.nextLine();
	((PersonContact)allContact.get(item - 1)).setDescription(description);
	
	allContact.add(new PersonContact(number, name, phone, location, birthday, description));
}

private void updateBusinessContact(int item) {
	System.out.println("===========");
	System.out.println(" CREATE MENU ");
	System.out.println("===========");
	
	// BusinessContact(int number, String name, String phone, String location, String hours, String website)
	System.out.println("What is the phone number? [" + allContact.get(item - 1).getNumber() + "]");
	int number = sc.nextInt();
	sc.nextLine();
	allContact.get(item - 1).setNumber(number);
	System.out.println("What is the name? [" + allContact.get(item - 1).getName() + "]");
	String name = sc.nextLine();
	allContact.get(item - 1).setName(name);
	System.out.println("What kind of phone is it? [" + allContact.get(item - 1).getPhone() + "]");
	String phone = sc.nextLine();
	allContact.get(item - 1).setPhone();
	System.out.println("Where is it located? [" + allContact.get(item - 1).getLocation() + "]");
	String location = sc.nextLine();
	allContact.get(item - 1).setLocation();
	System.out.println("What are their hours? [" + ((PersonContact)allContact.get(item - 1)).getHours() + "]");
	String hours = sc.nextLine();
	((PersonContact)allContact.get(item - 1)).setHours(hours);
	System.out.println("What is their website? [" + ((PersonContact)allContact.get(item - 1)).getWebsite() + "]");
	String website = sc.nextLine();
	((PersonContact)allContact.get(item - 1)).setWebsite(website);
	
	allContact.add(new BusinessContact(number, name, phone, location, hours, website));
}


private void addBusinessContact() {
	System.out.println("===========");
	System.out.println(" CREATE MENU ");
	System.out.println("===========");
	System.out.println("Adding a Business Contact...");

	// BusinessContact(number, name, phone, location, hours, website)
	System.out.println("What is the number? ");
	int number = sc.nextInt();
	sc.nextLine();
	System.out.println("Whate is their name? ");
	String name = sc.nextLine();
	System.out.println("What type of phone is it? ");
	String phone = sc.nextLine();
	System.out.println("Where are they located? ");
	String location = sc.nextLine();
	System.out.println("what are their hours ");
	String hours = sc.nextLine();
	System.out.println("What is the website? ");
	String website = sc.nextLine();
	 
	allContact.add(new BusinessContact(number, name, phone, location, hours, website));
}

private void addPersonContact() {
	System.out.println("===========");
	System.out.println(" CREATE MENU ");
	System.out.println("===========");
	System.out.println("Adding a Personal Contact...");
	
	// PersonContact(number, name, phone, location, birthday, description)
	System.out.println("What is the number? ");
	int number = sc.nextInt();
	sc.nextLine();
	System.out.println("Whate is their name? ");
	String name = sc.nextLine();
	System.out.println("What type of phone is it? ");
	String phone = sc.nextLine();
	System.out.println("Where are they located? ");
	String location = sc.nextLine();
	System.out.println("What is their birthday? ");
	String birthday = sc.nextLine();
	System.out.println("What is the description? ");
	String description = sc.nextLine();
	 
	allContact.add(new PersonContact(number, name, phone, location, birthday, description));
}

public void viewAllContact() {
	System.out.println("===========");
	System.out.println(" READING MENU ");
	System.out.println("===========");
	
	int counter = 1;
	
	for (AllContact ac : allContact) {
		System.out.println(counter++ + ". " + ac.toString());
	}
}
}