package com.blridgelab.addressBook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Management System");
        Address address = new Address();
        address.addContact();
        address.display();
    }
}
