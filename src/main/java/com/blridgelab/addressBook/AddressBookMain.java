package com.blridgelab.addressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Management System");
        Address address = new Address();
        address.addContact();
        address.display();

        System.out.println("Do you want edit the contacts ? ");
        System.out.println(" Enter yes to edit ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("yes") || input.equals("Yes")) {
            System.out.println("Enter Following data : ");
            address.editContact();
        } else {
            System.out.println(" Thank you ");
        }
    }
}
