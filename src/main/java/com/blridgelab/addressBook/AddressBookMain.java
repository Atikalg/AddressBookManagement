package com.blridgelab.addressBook;
/* author atik
*   Address book management
 */
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Management System");
        Address address = new Address();
        address.addContact();
        address.display();

        System.out.println("Do you want edit or delete  contacts ? ");
        System.out.println(" Enter E for edit ");
        System.out.println(" Enter D for delete");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("e") || input.equals("E")) {
            System.out.println("Enter Following data : ");
            address.editContact();
        }
        else if (input.equals("d") || input.equals("D")) {
            address.deleteContact();
        }
        else {
            System.out.println(" Thank you ");
        }
    }
}
