package com.bl.bridgelabz;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.printf("Welcome to Address Book Program \n");
		ContactDetails newContact = new ContactDetails();
		newContact.setFirstName("Srikanth \n");
		newContact.setLastName("Housinoor \n");
		newContact.setAddressCity("Nizamabad \n");
		newContact.setState("Telangana \n");
		newContact.setZip(506167);
		newContact.setPhoneNumber(967650195);
		newContact.setEmail("srikanthh994@gmail.com .\n");
		System.out.println("The Contact is : \n" + newContact);

	}
}
