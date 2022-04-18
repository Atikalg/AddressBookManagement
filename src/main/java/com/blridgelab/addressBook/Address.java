package com.blridgelab.addressBook;
/* author atik
* Address book controller
 */
import java.util.Scanner;

public class Address {
    Contact contact;
    Scanner sc = new Scanner(System.in);
    //adding contacts
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
    //display function
    public void display() {
        String str = contact.getFirstName();
        System.out.println("str = " + str);
    }
    //to edit contacts edit function
    public void editContact() {
        System.out.println("Please Enter original first name for verification : ");
        String editName = sc.nextLine();

        if(editName.equalsIgnoreCase(contact.getFirstName())) {
            System.out.println("Enter new contact details");
            addContact();
        } else {
            System.out.println("Invalid first name");
            System.out.println("Please Enter valid first name");
            editContact();
        }
    }
    //to delete contacts
    public void deleteContact() {
            System.out.println("Enter original first name for verification:");
            String deleteName = sc.next();

                if (deleteName.equals(contact.getFirstName())) {
                    contact.setFirstName(null);
                    contact.setLastName(null);
                    contact.setPhoneNumber(null);
                    contact.setCity(null);
                    contact.setState(null);
                    contact.setPincode(null);
                    contact.setEmail(null);
                    System.out.println("Contact:" + contact.getFirstName() + " " + "deleted successfully...");
                }
                else {
                    System.out.println("Invalid first name");
                    System.out.println("Please Enter valid first name");
                    deleteContact();
                }
            }
    }


