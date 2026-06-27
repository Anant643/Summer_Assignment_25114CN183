//Write a program to Create bank account management system.

import java.util.Scanner;

public class Q110
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] accountId = new int[100];
        String[] accountName = new String[100];
        String[] accountType = new String[100];
        double[] balance = new double[100];

        int acount = 0;

        while(true)
        {
            System.out.println("==== Bank Account Management System ====");
            System.out.println("1. Add Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Update Account");
            System.out.println("5. Exit");

            System.out.print("What do you want to do?: ");
            int choice = sc.nextInt();

            if(choice < 1 || choice > 5)
            {
                System.out.println("Invalid Choice");
                continue;
            }

            switch(choice)
            {
                case 1:

                    System.out.print("How many accounts do you want to add?: ");
                    int n = sc.nextInt();

                    for(int i = 0; i < n; i++)
                    {
                        System.out.println("\nEnter data for Account #" + (acount + 1));

                        System.out.print("Enter Account ID: ");
                        accountId[acount] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Account Holder Name: ");
                        accountName[acount] = sc.nextLine();

                        System.out.print("Enter Account Type: ");
                        accountType[acount] = sc.nextLine();

                        System.out.print("Enter Balance: ");
                        balance[acount] = sc.nextDouble();

                        acount++;
                    }

                    System.out.println("\nAccounts added successfully.\n");
                    break;

                case 2:

                    if(acount == 0)
                    {
                        System.out.println("No data entered yet.");
                    }
                    else
                    {
                        System.out.println("\nShowing data for " + acount + " Accounts:");

                        for(int i = 0; i < acount; i++)
                        {
                            System.out.println("\nAccount " + (i + 1));
                            System.out.println("Account ID: " + accountId[i]);
                            System.out.println("Account Holder: " + accountName[i]);
                            System.out.println("Account Type: " + accountType[i]);
                            System.out.println("Balance: " + balance[i]);
                        }
                    }

                    System.out.println();
                    break;

                case 3:

                    if(acount == 0)
                    {
                        System.out.println("No data entered yet.");
                    }
                    else
                    {
                        boolean found = false;

                        System.out.print("Enter Account ID to search: ");
                        int aid = sc.nextInt();

                        for(int i = 0; i < acount; i++)
                        {
                            if(aid == accountId[i])
                            {
                                found = true;

                                System.out.println("\nAccount Found Successfully.");
                                System.out.println("Account ID: " + accountId[i]);
                                System.out.println("Account Holder: " + accountName[i]);
                                System.out.println("Account Type: " + accountType[i]);
                                System.out.println("Balance: " + balance[i]);

                                break;
                            }
                        }

                        if(!found)
                        {
                            System.out.println("Account ID is invalid.");
                        }
                    }

                    break;

                case 4:

                    if(acount == 0)
                    {
                        System.out.println("No data entered yet.");
                    }
                    else
                    {
                        boolean ufound = false;

                        System.out.print("Enter Account ID to update: ");
                        int uid = sc.nextInt();

                        for(int i = 0; i < acount; i++)
                        {
                            if(uid == accountId[i])
                            {
                                ufound = true;

                                System.out.println("\nUpdate Account Details:");

                                System.out.print("Enter New Account ID: ");
                                accountId[i] = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Enter New Account Holder Name: ");
                                accountName[i] = sc.nextLine();

                                System.out.print("Enter New Account Type: ");
                                accountType[i] = sc.nextLine();

                                System.out.print("Enter New Balance: ");
                                balance[i] = sc.nextDouble();

                                System.out.println("Record Updated Successfully.");

                                break;
                            }
                        }

                        if(!ufound)
                        {
                            System.out.println("Account ID is invalid.");
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