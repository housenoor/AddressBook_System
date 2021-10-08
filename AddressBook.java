package com.bl.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);

	ContactDetails person = new ContactDetails();

	public void addContact() {

		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter your addressCity: ");
		String addressCity = sc.nextLine();
		System.out.println("Enter your state: ");
		String state = sc.nextLine();
		System.out.println("Enter zip code : ");
		Long zip = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter phone number: ");
		Long phoneNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your EMail ID: ");
		String email = sc.nextLine();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddressCity(addressCity);
		person.setState(state);
		person.setZip(zip.intValue());
		person.setPhoneNumber(phoneNumber.intValue());
		person.setEmail(email);
		System.out.println("The Contact Details of " + firstName + "\n" + person);
	}

	public void editContact() {

		System.out.println("Enter the firstName of person");
		String editName = sc.nextLine();
		if (editName.equalsIgnoreCase(person.getFirstName()))
			addContact();
		else
			System.out.println("The Entered First Name Is Not Match");
		editContact();
	}
}
