package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static int lastRecord=-1;
    public static String takeInput() {
        System.out.println("Enter the First Name of the Contact you want to Edit/Delete: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Contact[] contact = new Contact[100];
        Scanner in = new Scanner(System.in);


        for (int i = 0; i < contact.length; i++) {
            System.out.println("**********************************ADDRESS BOOK MENU:**********************************");
            System.out.println("=>Do you want to ADD a new Contact to the Address Book? PRESS 1");
            System.out.println("=>Do you want to EDIT an Existing Contact? PRESS 2");
            System.out.println("=>Do you want to DELETE a Contact? PRESS 3");
            System.out.println("=>To EXIT.....PRESS 4");
            int input = in.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter the following details to add the Contact to the Address Book:");
                    contact[i] = new Contact();
                    System.out.println("!!!CONTACT ADDED!!!");
                    contact[i].DisplayContact();
                    lastRecord++;
                    break;

                case 2:
                    if (lastRecord >= 0) {
                        String name = takeInput();
                        for (int j = 0; j <=lastRecord; j++) {
                            if (name.equals(contact[j].firstName)) {
                                contact[j].DisplayContact();
                                System.out.println("Enter the following details to edit the Contact in the Address Book:");
                                contact[j] = new Contact();
                                System.out.println("!!!CONTACT EDITED!!!");
                                contact[j].DisplayContact();
                            }
                            else
                                System.out.println("The given name is NOT FOUND!!!");
                        }
                    }
                    else
                        System.out.println("Address Book is EMPTY!!!");
                    break;

                case 3:
                    if(lastRecord >= 0) {
                        String name = takeInput();
                        for (int j = 0; j <= lastRecord; j++) {
                            if (name.equals(contact[j].firstName)) {
                                contact[j].DeleteContact();
                                System.out.println("!!!CONTACT DELETED!!!");
                            } else
                                System.out.println("The given name is NOT FOUND!!!");
                        }
                    }
                    else
                        System.out.println("Address Book is EMPTY!!!");

                    break;

                default:
                    System.out.println("EXITING ADDRESS BOOK.....");
                    i=contact.length;
                    break;
            }
        }
    }

    public static class Contact {
        public String firstName, lastName, address, city, state, zipCode, phoneNumber, email;

        Contact() {
            Scanner in = new Scanner(System.in);
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

        public void DeleteContact(){
            firstName=lastName=address=city=state=zipCode=phoneNumber=email=null;
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


