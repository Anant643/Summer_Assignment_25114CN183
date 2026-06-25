//Write a program to Create ticket booking system.

import java.util.Scanner;

public class Q111
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] ticketId = new int[100];
        String[] passengerName = new String[100];
        String[] destination = new String[100];
        int[] tickets = new int[100];

        int tcount = 0;

        while (true)
        {
            System.out.println("==== Ticket Booking System ====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Bookings");
            System.out.println("3. Search Booking");
            System.out.println("4. Update Booking");
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
                    System.out.print("How many bookings do you want to add?: ");
                    n = sc.nextInt();

                    for(int i = 0; i < n; i++)
                    {
                        System.out.println("\nEnter data for Booking #" + (tcount + 1) + ":-");

                        System.out.print("Enter Ticket ID: ");
                        ticketId[tcount] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Passenger Name: ");
                        passengerName[tcount] = sc.nextLine();

                        System.out.print("Enter Destination: ");
                        destination[tcount] = sc.nextLine();

                        System.out.print("Enter Number of Tickets: ");
                        tickets[tcount] = sc.nextInt();

                        tcount++;
                    }

                    System.out.println("\nBookings added successfully.\n");
                    break;

                case 2:

                    if (tcount == 0)
                    {
                        System.out.println("No data entered yet.");
                    }
                    else
                    {
                        System.out.println("\nShowing data for " + tcount + " Bookings:");

                        for(int i = 0; i < tcount; i++)
                        {
                            System.out.println("\nBooking " + (i + 1) + " :-");
                            System.out.println("Ticket ID: " + ticketId[i]);
                            System.out.println("Passenger Name: " + passengerName[i]);
                            System.out.println("Destination: " + destination[i]);
                            System.out.println("Number of Tickets: " + tickets[i]);
                        }
                    }

                    System.out.println();
                    break;

                case 3:

                    if (tcount == 0)
                    {
                        System.out.println("No data entered yet.\n");
                    }
                    else
                    {
                        int tid;
                        boolean found = false;

                        System.out.print("Enter Ticket ID to search: ");
                        tid = sc.nextInt();

                        for(int i = 0; i < tcount; i++)
                        {
                            if(tid == ticketId[i])
                            {
                                found = true;

                                System.out.println("\nBooking Found Successfully.");
                                System.out.println("Ticket ID: " + ticketId[i]);
                                System.out.println("Passenger Name: " + passengerName[i]);
                                System.out.println("Destination: " + destination[i]);
                                System.out.println("Number of Tickets: " + tickets[i]);

                                break;
                            }
                        }

                        if(!found)
                        {
                            System.out.println("Ticket ID is invalid.");
                        }
                    }

                    break;

                case 4:

                    if (tcount == 0)
                    {
                        System.out.println("No data entered yet.\n");
                    }
                    else
                    {
                        int uid;
                        boolean ufound = false;

                        System.out.print("Enter Ticket ID to update: ");
                        uid = sc.nextInt();

                        for(int i = 0; i < tcount; i++)
                        {
                            if(uid == ticketId[i])
                            {
                                ufound = true;

                                System.out.println("\nUpdate Booking Details:-");

                                System.out.print("Enter New Ticket ID: ");
                                ticketId[i] = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Enter New Passenger Name: ");
                                passengerName[i] = sc.nextLine();

                                System.out.print("Enter New Destination: ");
                                destination[i] = sc.nextLine();

                                System.out.print("Enter New Number of Tickets: ");
                                tickets[i] = sc.nextInt();

                                System.out.println("Record Updated Successfully.");

                                break;
                            }
                        }

                        if(!ufound)
                        {
                            System.out.println("Ticket ID is invalid.");
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