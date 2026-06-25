//Write a program to Create library management system.

import java.util.Scanner;

public class Q109
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bookId = new int[100];
        String[] bookName = new String[100];
        String[] author = new String[100];
        int[] quantity = new int[100];

        int bcount = 0;

        while (true)
        {
            System.out.println("====Library Management System====");
            System.out.println("1. Add Books");
            System.out.println("2. View Books");
            System.out.println("3. Search Books");
            System.out.println("4. Update Books");
            System.out.println("5. Exit");

            int choice;
            System.out.print("What do you want to do?: ");
            choice = sc.nextInt();
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid Choice");
                continue;
            }

            switch(choice)
            {
                case 1:
                    System.out.println("\n");

                    int n;
                    System.out.print("How many books do you want to add?: ");
                    n = sc.nextInt();

                    for(int i = 0;i<n;i++)
                    {

                        System.out.println("Enter data for book #"+(bcount+1)+":-");

                        System.out.print("Enter Book ID:- ");
                        bookId[bcount] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Name:- ");
                        bookName[bcount] = sc.nextLine();

                        System.out.print("Enter Author's Name:- ");
                        author[bcount] = sc.nextLine();

                        System.out.print("Enter Quantity:- ");
                        quantity[bcount] = sc.nextInt();
                        sc.nextLine();
                        System.out.println("\n");

                        bcount++;
                    }
                    System.out.println("Books added successfully.\n\n");
                    break;

                case 2:

                    if (bcount == 0) {
                        System.out.println("No data entered yet.");
                    } else {

                        System.out.println("\nShowing data for " + bcount + " Books:");

                        for (int i = 0; i < bcount; i++) {

                            System.out.println("\nBook " + (i + 1) + " :-");
                            System.out.println("Book ID: " + bookId[i]);
                            System.out.println("Book Name: " + bookName[i]);
                            System.out.println("Author: " + author[i]);
                            System.out.println("Quantity: "+ quantity[i]);
                        }
                    }
                    System.out.println("\n");

                    break;

                case 3:
                    if (bcount == 0) {
                        System.out.println("No data entered yet.\n");
                    }
                    else
                    {
                        int bid;
                        System.out.print("Enter Book ID to search: ");
                        bid = sc.nextInt();
                        boolean found = false;

                        for(int i = 0; i < bcount; i++)
                        {
                            if(bid == bookId[i])
                            {
                                found = true;
                                System.out.println("Book found successfully.");
                                System.out.print("\nBookID: "+ bookId[i]);
                                System.out.print("\nBook Name: "+ bookName[i]);
                                System.out.print("\nAuthor: "+author[i]);
                                System.out.print("\nQuantity: "+quantity[i]);

                                break;
                            }
                        }
                            if (!found)
                            {
                                System.out.println("Book ID is invalid.");
                                break;
                            }
                    }
                    break;

                case 4:
                    if (bcount == 0) {
                        System.out.println("No data entered yet.\n");
                    }
                    else
                    {
                        int uid;
                        System.out.print("Enter Book ID to search: ");
                        uid = sc.nextInt();
                        boolean ufound = false;

                        for(int i = 0; i < bcount; i++)
                        {
                            if(uid == bookId[i])
                            {
                                ufound = true;
                                System.out.println("Update the details:- \n");
                                System.out.print("Enter New Book ID: ");
                                bookId[i] = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Enter New Name: ");
                                bookName[i] = sc.nextLine();

                                System.out.print("Enter Author's Name: ");
                                author[i] = sc.nextLine();

                                System.out.print("Enter Available Quantity: ");
                                quantity[i] = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Record Updated Successfully.");
                                break;

                            }
                        }
                            if (!ufound)
                            {
                                System.out.println("Book ID is invalid.");
                                break;
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