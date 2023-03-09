package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Contact[] contact = new Contact[100];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < contact.length; i++) {
            System.out.println("********************************************************************");
            System.out.println("Do you want to ADD a new Contact to the Address Book?");
            System.out.println("If YES: Press 1 else Press 2");
            int input = in.nextInt();

            switch (input) {
                case 1:
                    contact[i] = new Contact();
                    contact[i].DisplayContact();
                    break;
                default:
                    i = contact.length;
            }
        }
    }

    public static class Contact {
        public String firstName, lastName, address, city, state, zipCode, phoneNumber, email;

        Contact() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the following details to add the Contact to the Address Book:");
            System.out.print("First Name: ");
            firstName = in.nextLine();
            System.out.print("Last Name: ");
            lastName = in.nextLine();
            System.out.print("Address: ");
            address = in.nextLine();
            System.out.print("City: ");
            city = in.nextLine();
            System.out.print("State: ");
            state = in.nextLine();
            System.out.print("ZIP Code: ");
            zipCode = in.nextLine();
            System.out.print("Phone Number: ");
            phoneNumber = in.nextLine();
            System.out.print("E-mail Address: ");
            email = in.nextLine();
        }

        public void DisplayContact() {
            System.out.println("____________________________________________________");
            System.out.println("The Contact Details:");
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Address: " + address + "\n" + city + ", " + state + " - " + zipCode);
            System.out.println("Phone Number: " + phoneNumber + "\nE-mail Address: " + address);
        }
    }
}


