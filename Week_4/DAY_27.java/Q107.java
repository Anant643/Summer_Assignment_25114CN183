import java.util.Scanner;

// Write a program to Create salary management system.

public class Q107 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] empId = new int[100];
        String[] name = new String[100];
        double[] basicSalary = new double[100];
        double[] hra = new double[100];
        double[] da = new double[100];
        double[] grossSalary = new double[100];

        int count = 0;

        while (true) {

            System.out.println("\n===== SALARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    empId[count] = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Employee Name: ");
                    name[count] = scanner.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    basicSalary[count] = scanner.nextDouble();

                    hra[count] = basicSalary[count] * 0.20;
                    da[count] = basicSalary[count] * 0.10;
                    grossSalary[count] = basicSalary[count] + hra[count] + da[count];

                    count++;

                    System.out.println("Salary Record Added Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Records Found!");
                    } else {

                        System.out.println("\n===== EMPLOYEE SALARY RECORDS =====");

                        for (int i = 0; i < count; i++) {

                            System.out.println("\nEmployee " + (i + 1));
                            System.out.println("ID: " + empId[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Basic Salary: " + basicSalary[i]);
                            System.out.println("HRA: " + hra[i]);
                            System.out.println("DA: " + da[i]);
                            System.out.println("Gross Salary: " + grossSalary[i]);
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = scanner.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (empId[i] == searchId) {

                            System.out.println("\nRecord Found!");
                            System.out.println("ID: " + empId[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Basic Salary: " + basicSalary[i]);
                            System.out.println("HRA: " + hra[i]);
                            System.out.println("DA: " + da[i]);
                            System.out.println("Gross Salary: " + grossSalary[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }

                    break;

                case 4:

                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = scanner.nextInt();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {

                        if (empId[i] == updateId) {

                            System.out.print("Enter New Basic Salary: ");
                            basicSalary[i] = scanner.nextDouble();

                            hra[i] = basicSalary[i] * 0.20;
                            da[i] = basicSalary[i] * 0.10;
                            grossSalary[i] = basicSalary[i] + hra[i] + da[i];

                            System.out.println("Salary Updated Successfully!");

                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee Not Found!");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Program...");
                    scanner.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}