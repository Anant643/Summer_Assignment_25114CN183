//Write a program to Create contact management system.

import java.util.Scanner;

public class Q112
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] contactId = new int[100];
        String[] contactName = new String[100];
        String[] phone = new String[100];
        String[] email = new String[100];

        int ccount = 0;

        while (true)
        {
            System.out.println("==== Contact Management System ====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Exit");

            int choice;
            System.out.print("What do you want to do?: ");
            choice = sc.nextInt();

            if (choice < 1 || choice > 5)
            {
                System.out.println("Invalid Choice");
                continue;
            }

            switch(choice)
            {
                case 1:

                    System.out.println();

                    int n;
                    System.out.print("How many contacts do you want to add?: ");
                    n = sc.nextInt();

                    for(int i = 0; i < n; i++)
                    {
                        System.out.println("\nEnter data for Contact #" + (ccount + 1) + ":-");

                        System.out.print("Enter Contact ID: ");
                        contactId[ccount] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Contact Name: ");
                        contactName[ccount] = sc.nextLine();

                        System.out.print("Enter Phone Number: ");
                        phone[ccount] = sc.nextLine();

                        System.out.print("Enter Email: ");
                        email[ccount] = sc.nextLine();

                        ccount++;
                    }

                    System.out.println("\nContacts added successfully.\n");
                    break;

                case 2:

                    if (ccount == 0)
                    {
                        System.out.println("No data entered yet.");
                    }
                    else
                    {
                        System.out.println("\nShowing data for " + ccount + " Contacts:");

                        for(int i = 0; i < ccount; i++)
                        {
                            System.out.println("\nContact " + (i + 1) + " :-");
                            System.out.println("Contact ID: " + contactId[i]);
                            System.out.println("Contact Name: " + contactName[i]);
                            System.out.println("Phone Number: " + phone[i]);
                            System.out.println("Email: " + email[i]);
                        }
                    }

                    System.out.println();
                    break;

                case 3:

                    if (ccount == 0)
                    {
                        System.out.println("No data entered yet.\n");
                    }
                    else
                    {
                        int cid;
                        boolean found = false;

                        System.out.print("Enter Contact ID to search: ");
                        cid = sc.nextInt();

                        for(int i = 0; i < ccount; i++)
                        {
                            if(cid == contactId[i])
                            {
                                found = true;

                                System.out.println("\nContact Found Successfully.");
                                System.out.println("Contact ID: " + contactId[i]);
                                System.out.println("Contact Name: " + contactName[i]);
                                System.out.println("Phone Number: " + phone[i]);
                                System.out.println("Email: " + email[i]);

                                break;
                            }
                        }

                        if(!found)
                        {
                            System.out.println("Contact ID is invalid.");
                        }
                    }

                    break;

                case 4:

                    if (ccount == 0)
                    {
                        System.out.println("No data entered yet.\n");
                    }
                    else
                    {
                        int uid;
                        boolean ufound = false;

                        System.out.print("Enter Contact ID to update: ");
                        uid = sc.nextInt();

                        for(int i = 0; i < ccount; i++)
                        {
                            if(uid == contactId[i])
                            {
                                ufound = true;

                                System.out.println("\nUpdate Contact Details:-");

                                System.out.print("Enter New Contact ID: ");
                                contactId[i] = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Enter New Contact Name: ");
                                contactName[i] = sc.nextLine();

                                System.out.print("Enter New Phone Number: ");
                                phone[i] = sc.nextLine();

                                System.out.print("Enter New Email: ");
                                email[i] = sc.nextLine();

                                System.out.println("Record Updated Successfully.");

                                break;
                            }
                        }

                        if(!ufound)
                        {
                            System.out.println("Contact ID is invalid.");
                        }
                    }

                    break;

                case 5:

                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }
        }
    }
}