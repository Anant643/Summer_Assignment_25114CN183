// EMPLOYEE MANAGEMENT SYSTEM

import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] empId = new int[100];
        String[] name = new String[100];
        double[] salary = new double[100];

        int ecount = 0;

        while (true) {

            System.out.println("\n==== EMPLOYEE RECORDS ====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Exit");

            System.out.print("What would you like to do?: ");
            int choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid Choice");
                continue;
            }

            switch (choice) {

                case 1:

                    System.out.print("How many employee records would you like to add?: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        System.out.println("\nData Entry for Employee " + (ecount + 1));

                        System.out.print("Enter Employee ID: ");
                        empId[ecount] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        name[ecount] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[ecount] = sc.nextDouble();
                        sc.nextLine();

                        ecount++;
                    }

                    System.out.println("Employee data added successfully.");
                    break;

                case 2:

                    if (ecount == 0) {
                        System.out.println("No data entered yet.");
                    } else {

                        System.out.println("\nShowing data for " + ecount + " Employees:");

                        for (int i = 0; i < ecount; i++) {

                            System.out.println("\nEmployee " + (i + 1) + " :-");
                            System.out.println("Employee ID: " + empId[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Salary: " + salary[i]);
                        }
                    }

                    break;

                case 3:

                    if (ecount == 0) {
                        System.out.println("No data entered yet.");
                    } else {

                        System.out.print("Enter Employee ID to search: ");
                        int key = sc.nextInt();
                        sc.nextLine();

                        boolean found = false;

                        for (int i = 0; i < ecount; i++) {

                            if (key == empId[i]) {

                                System.out.println("\nEmployee Found.");
                                System.out.println("Employee ID: " + empId[i]);
                                System.out.println("Name: " + name[i]);
                                System.out.println("Salary: " + salary[i]);

                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Employee not found.");
                        }
                    }

                    break;

                case 4:

                    if (ecount == 0) {
                        System.out.println("No data entered yet.");
                    } else {

                        System.out.print("Enter Employee ID to update: ");
                        int key = sc.nextInt();
                        sc.nextLine();

                        boolean found = false;

                        for (int i = 0; i < ecount; i++) {

                            if (key == empId[i]) {

                                System.out.println("Employee Found.");

                                System.out.print("Enter New Name: ");
                                name[i] = sc.nextLine();

                                System.out.print("Enter New Salary: ");
                                salary[i] = sc.nextDouble();
                                sc.nextLine();

                                found = true;

                                System.out.println("Record Updated Successfully.");
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Employee not found.");
                        }
                    }

                    break;

                case 5:

                    System.out.println("Program Exited.");
                    sc.close();
                    return;
            }
        }
    }
}