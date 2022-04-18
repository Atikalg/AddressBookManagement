package com.blridgelab.addressBook;

import java.util.Scanner;

public class Address {
    Contact contact;
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        contact = new Contact();
        System.out.println("Enter the first name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();
        System.out.println("Enter the phone no : ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter the city : ");
        String city = sc.nextLine();
        System.out.println("Enter the state : ");
        String state = sc.nextLine();
        System.out.println("Enter the pincode : ");
        String pincode = sc.nextLine();
        System.out.println("Enter Email id : ");
        String email = sc.nextLine();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhoneNumber(phoneNumber);
        contact.setCity(city);
        contact.setState(state);
        contact.setPincode(pincode);
        contact.setEmail(email);
        System.out.println(contact);

    }

    public void display() {
        String str = contact.getFirstName();
        System.out.println("str = " + str);
    }
    public void editContact() {
        System.out.println("Please Enter original first name to edit : ");
        String editName = sc.nextLine();

        if(editName.equalsIgnoreCase(contact.getFirstName())) {
            addContact();
        } else {
            System.out.println("Invalid first name");
            System.out.println("Please Enter valid first name");
            editContact();
        }
    }
}
