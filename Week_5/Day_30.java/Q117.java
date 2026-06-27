// Write a program to Create student record system using arrays and strings


import java.util.Scanner;

public class Q117 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] rollno = new int[100];
        String[] name = new String[100];
        double[] cgpa = new double[100];

        int scount = 0;

        while (true) {

            System.out.println("\n==== STUDENT RECORDS ====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");

            System.out.print("What would you like to do?: ");
            int choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid Choice");
                continue;
            }

            switch (choice) {

                case 1:

                    System.out.print("How many students data would you like to add?: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        System.out.println("\nData Entry for Student " + (scount + 1));

                        System.out.print("Enter Roll Number: ");
                        rollno[scount] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        name[scount] = sc.nextLine();

                        System.out.print("Enter CGPA: ");
                        cgpa[scount] = sc.nextDouble();
                        sc.nextLine();

                        scount++;
                    }

                    System.out.println("Student data added successfully.");
                    break;

                case 2:

                    if (scount == 0) {
                        System.out.println("No data entered yet.");
                    } else {

                        System.out.println("\nShowing data for " + scount + " Students:");

                        for (int i = 0; i < scount; i++) {

                            System.out.println("\nStudent " + (i + 1) + " :-");
                            System.out.println("Roll Number: " + rollno[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("CGPA: " + cgpa[i]);
                        }
                    }

                    break;

                case 3:

                    if (scount == 0) {
                        System.out.println("No data entered yet.");
                    } else {

                        System.out.print("Enter the roll number to search: ");
                        int key = sc.nextInt();
                        sc.nextLine();

                        boolean found = false;

                        for (int i = 0; i < scount; i++) {

                            if (key == rollno[i]) {

                                System.out.println("\nStudent Found.");
                                System.out.println("Roll Number: " + rollno[i]);
                                System.out.println("Name: " + name[i]);
                                System.out.println("CGPA: " + cgpa[i]);

                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student not found.");
                        }
                    }

                    break;

                case 4:

                    if (scount == 0) {
                        System.out.println("No data entered yet.");
                    } else {

                        System.out.print("Enter Roll Number to update: ");
                        int key = sc.nextInt();
                        sc.nextLine();

                        boolean found = false;

                        for (int i = 0; i < scount; i++) {

                            if (key == rollno[i]) {

                                System.out.println("Student Found.");

                                System.out.print("Enter New Name: ");
                                name[i] = sc.nextLine();

                                System.out.print("Enter New CGPA: ");
                                cgpa[i] = sc.nextDouble();
                                sc.nextLine();

                                found = true;

                                System.out.println("Record Updated Successfully.");
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student not found.");
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