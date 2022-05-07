package com.blridgelab.addressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressRepository {
    static Map<String, Address> addressBookMap = new HashMap<>();
//    public AddressRepository addressRepository;
//    public Address address;
    AddressRepository addressRepository = new AddressRepository();

    public static Map<String, Address> getAddressBookMap() {
        return addressBookMap;
    }

    public static void setAddressBookMap(Map<String, Address> addressBookMap) {
        AddressRepository.addressBookMap = addressBookMap;
    }

    static Scanner sc = new Scanner(System.in);

    public static void addNewAddressBook() {
        System.out.println("Enter the Address Book Name :");
        String addressbookName = sc.next();
        if(addressBookMap.containsKey(addressbookName)) {
            System.out.println("Entered AddressBook is Already Available");
        } else {
            Address addressBook = new Address();
            addressBookMap.put(addressbookName,addressBook);
        }
    }

    public static void displayAddressBooks() {
        for(String key: addressBookMap.keySet()){
            System.out.println(key);
        }
    }

    public static void selectAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the Address Book Name :");
        String addressbookName = sc.next();
        if(addressBookMap.containsKey(addressbookName)) {
            addressBookMap.get(addressbookName).getmenu(addressBookMap.get(addressbookName));
        } else {
            System.out.println("Entered Address Book Name is Invalid");
        }
    }
    public static void deleteAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the Address Book Name :");
        String addressbookName = sc.next();
        if(addressBookMap.containsKey(addressbookName)) {
            addressBookMap.remove(addressbookName);
            System.out.println("Address Book is Deleted");
        } else {
            System.out.println("Entered Address Book Name is Invalid");
        }
    }

    public static final int userInput() {
        return sc.nextInt();
    }
}
