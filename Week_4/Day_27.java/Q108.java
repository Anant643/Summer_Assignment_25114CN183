import java.util.Scanner;

// Write a program to Create marksheet generation system.

public class Q108 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[100];
        String[] name = new String[100];
        double[] total = new double[100];
        double[] percentage = new double[100];
        char[] grade = new char[100];

        int count = 0;

        while (true) {

            System.out.println("\n===== MARKSHEET GENERATION SYSTEM =====");
            System.out.println("1. Add Student Marks");
            System.out.println("2. View All Marksheets");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll No: ");
                    rollNo[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    double sum = 0;

                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Enter Marks of Subject " + i + ": ");
                        sum += sc.nextDouble();
                    }

                    total[count] = sum;
                    percentage[count] = sum / 5;

                    if (percentage[count] >= 90)
                        grade[count] = 'A';
                    else if (percentage[count] >= 75)
                        grade[count] = 'B';
                    else if (percentage[count] >= 60)
                        grade[count] = 'C';
                    else if (percentage[count] >= 40)
                        grade[count] = 'D';
                    else
                        grade[count] = 'F';

                    count++;

                    System.out.println("Marksheet Generated Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Records Found!");
                    } else {

                        System.out.println("\n===== ALL MARKSHEETS =====");

                        for (int i = 0; i < count; i++) {

                            System.out.println("Roll No: " + rollNo[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Total Marks: " + total[i]);
                            System.out.println("Percentage: " + percentage[i] + "%");
                            System.out.println("Grade: " + grade[i]);
                            System.out.println("------------------------");
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (rollNo[i] == searchRoll) {

                            System.out.println("\nStudent Found");
                            System.out.println("Roll No: " + rollNo[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Total Marks: " + total[i]);
                            System.out.println("Percentage: " + percentage[i] + "%");
                            System.out.println("Grade: " + grade[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 4:

                    System.out.print("Enter Roll No to Update: ");
                    int updateRoll = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (rollNo[i] == updateRoll) {

                            double newTotal = 0;

                            for (int j = 1; j <= 5; j++) {
                                System.out.print("Enter New Marks of Subject " + j + ": ");
                                newTotal += sc.nextDouble();
                            }

                            total[i] = newTotal;
                            percentage[i] = newTotal / 5;

                            if (percentage[i] >= 90)
                                grade[i] = 'A';
                            else if (percentage[i] >= 75)
                                grade[i] = 'B';
                            else if (percentage[i] >= 60)
                                grade[i] = 'C';
                            else if (percentage[i] >= 40)
                                grade[i] = 'D';
                            else
                                grade[i] = 'F';

                            System.out.println("Record Updated Successfully!");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Program...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}