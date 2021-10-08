package com.bl.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.printf("Welcome to Address Book Program \n");
		Scanner sc = new Scanner(System.in);
		AddressBook person = new AddressBook();
		person.addContact();
		System.out.println("Enter Y To Edit The Contact");
		String option = sc.nextLine();

		if (option.equals("y") || option.equals("Y")) {
			person.editContact();
			System.out.println("You have Entered following data");
			System.out.println("The Contact Details After Editing : " + person);
		}
	}
}
