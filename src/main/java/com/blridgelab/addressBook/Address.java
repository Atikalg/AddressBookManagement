package com.blridgelab.addressBook;
/* author atik
 * Address book of contacts
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Address {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contact = new ArrayList<Contact>();

    //adding contacts
    public void addContact() {
        System.out.println("Enter the first name : ");
        String firstName = sc.next();
        System.out.println("Enter the last name : ");
        String lastName = sc.next();
        System.out.println("Enter the phone no : ");
        String phoneNumber = sc.next();
        System.out.println("Enter the city : ");
        String city = sc.next();
        System.out.println("Enter the state : ");
        String state = sc.next();
        System.out.println("Enter the pincode : ");
        String pincode = sc.next();
        System.out.println("Enter Email id : ");
        String email = sc.next();

        contact.add(new Contact(firstName, lastName, phoneNumber, city, state, pincode, email));
        System.out.println(contact);
    }

    //To display contacts
    public void display() {
        System.out.println("Number of contacts : " + contact.size());
        if (contact.isEmpty()) {
            System.out.println("There is no contact");
        } else {
            for (int i = 0; i < contact.size(); i++) {
                System.out.println(contact.get(i));
            }
        }
    }

    //To edit contacts
    public void editContact() {
        System.out.println("Please Enter original first name for verification : ");
        String editName = sc.next();
        if (contact.isEmpty()) {
            System.out.println("Contact list is empty");
        } else {
            for (int i = 0; i < contact.size(); i++) {
                String name = contact.get(i).getFirstName();
                if (editName.equalsIgnoreCase(name)) {
                    System.out.println("Enter the first name : ");
                    String firstName = sc.next();
                    System.out.println("Enter the last name : ");
                    String lastName = sc.next();
                    System.out.println("Enter the phone no : ");
                    String phoneNumber = sc.next();
                    System.out.println("Enter the city : ");
                    String city = sc.next();
                    System.out.println("Enter the state : ");
                    String state = sc.next();
                    System.out.println("Enter the pincode : ");
                    String pincode = sc.next();
                    System.out.println("Enter Email id : ");
                    String email = sc.next();
                    contact.get(i).setFirstName(firstName);
                    contact.get(i).setLastName(lastName);
                    contact.get(i).setPhoneNumber(phoneNumber);
                    contact.get(i).setCity(city);
                    contact.get(i).setState(state);
                    contact.get(i).setPincode(pincode);
                    contact.get(i).setEmail(email);
                } else {
                    System.out.println("Invalid first name");
                    System.out.println("Please Enter valid first name");
                }
            }
            System.out.println(contact);
        }
    }
        //To delete contacts
        public void deleteContact () {
            System.out.println("Enter original first name for verification:");
            String deleteName = sc.next();

            if (contact.isEmpty()) {
                System.out.println("Contact list is empty");
            } else {
                for (int i = 0; i < contact.size(); i++) {
                    String name = contact.get(i).getFirstName();
                    if (deleteName.equalsIgnoreCase(name)) {
                        contact.remove(i);
                        System.out.println("Contact deleted successfully");
                    } else {
                        System.out.println("Invalid first name");
                        System.out.println("Please Enter valid first name");
                    }
                }
                System.out.println(contact);
            }
   }
        // Function for operations of user's choice
        public void getmenu() {
            System.out.println("Menu of Address Book");
            boolean check = false;
            do {
                System.out.println("Enter your choice \n 1. Add contact \n 2. Edit contact \n 3. Delete contact \n 4. Display \n 5. Exit");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        addContact();
                        System.out.println("Contact added successfully");
                        break;
                    case 2:
                        editContact();
                        System.out.println("Contact edited successfully");
                        break;
                    case 3:
                        deleteContact();
                        break;
                    case 4:
                        display();
                        break;
                    case 5:
                        check = true;
                        break;
                    default:
                        System.out.println("Please choose a valid option");
                        break;
                }
            }
            while (!check);
        }
    }


