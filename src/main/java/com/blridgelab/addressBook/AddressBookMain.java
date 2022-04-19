package com.blridgelab.addressBook;
/* author atik
*   Address book management
 */
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Management System");
        Address address = new Address();
        address.getmenu();
    }
}
