package com.bl.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.printf("Welcome to Address Book Program \n");
		Scanner sc = new Scanner(System.in);
		AddressBook Book = new AddressBook();
		Book.getMenu();
		Book.showContact();
	}
}
