package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public String firstName, lastName, address, city, state, zipCode, phoneNumber, email;
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner in= new Scanner(System.in);
        AddressBookMain contact= new AddressBookMain();
        System.out.println("Enter the following details to add the Contact to the Address Book:");
        System.out.print("First Name: ");
        contact.firstName= in.nextLine();
        System.out.print("Last Name: ");
        contact.lastName= in.nextLine();
        System.out.print("Address: ");
        contact.address= in.nextLine();
        System.out.print("City: ");
        contact.city= in.nextLine();
        System.out.print("State: ");
        contact.state= in.nextLine();
        System.out.print("ZIP Code: ");
        contact.zipCode= in.nextLine();
        System.out.print("Phone Number: ");
        contact.phoneNumber= in.nextLine();
        System.out.print("E-mail Address: ");
        contact.email= in.nextLine();

        System.out.println("____________________________________________________");
        System.out.println("The Contact Details:");
        System.out.println("Name: "+contact.firstName+" "+contact.lastName);
        System.out.println("Address: "+contact.address+"\n"+contact.city+", "+contact.state+" - "+ contact.zipCode);
        System.out.println("Phone Number: "+contact.phoneNumber+"\nE-mail Address: "+contact.address);
    }
}
