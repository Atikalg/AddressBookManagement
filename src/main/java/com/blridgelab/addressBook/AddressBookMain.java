package com.blridgelab.addressBook;
/* author atik
 *   Address book management program
 */
import java.util.Hashtable;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Management System");
        Address address = new Address();
        int choice;
        do {
            System.out.println("***** ADDRESS BOOK MANAGEMENT *****");
            System.out.println("1. ADD NEW ADDRESSBOOK\n2. SELECT ADDRESSBOOK\n3. DELETE ADDRESSBOOK" +
                    "\n4. DISPLAY ADDRESSBOOKS\n5. EXIT");
            System.out.println("Please Select the Operation Number : ");
            choice = AddressRepository.userInput();

            switch (choice) {
                case 1:
                    AddressRepository.addNewAddressBook();    //Adding New Address Book to System
                    break;
                case 2:
                    //Edit Address Book Details
                    AddressRepository.selectAddressBook();
                    break;
                case 3:
                    AddressRepository.deleteAddressBook();    //Delete the Address Book Details
                    break;
                case 4:
                    AddressRepository.displayAddressBooks();  //Show Contact Details
                    break;
                case 5:
                    System.out.println("Thank You for using Address Book System.");
                    break;
                default:
                    System.out.println("Please Select the Operation between 1 to 5 only.");
                    break;
            }
        }while( choice != 5 );
    }
    }


