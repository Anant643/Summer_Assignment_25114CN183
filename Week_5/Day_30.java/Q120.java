import java.util.Scanner;

public class Q120 {

    static Scanner sc = new Scanner(System.in);

    static int[] studentId = new int[100];
    static String[] studentName = new String[100];
    static int[] age = new int[100];
    static double[] marks = new double[100];

    static int count = 0;

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== STUDENT RECORD MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }

    static void addStudent() {

        System.out.print("Enter Student ID: ");
        studentId[count] = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        studentName[count] = sc.nextLine();

        System.out.print("Enter Age: ");
        age[count] = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();

        count++;

        System.out.println("Student Added Successfully.");
    }

    static void displayStudents() {

        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\n----- Student Records -----");

        for (int i = 0; i < count; i++) {

            System.out.println("Student ID : " + studentId[i]);
            System.out.println("Student Name : " + studentName[i]);
            System.out.println("Age : " + age[i]);
            System.out.println("Marks : " + marks[i]);
            System.out.println("---------------------------");
        }
    }

    static void searchStudent() {

        System.out.print("Enter Student ID: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (studentId[i] == searchId) {

                System.out.println("Student Found");
                System.out.println("Student ID : " + studentId[i]);
                System.out.println("Student Name : " + studentName[i]);
                System.out.println("Age : " + age[i]);
                System.out.println("Marks : " + marks[i]);

                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Student Not Found.");
    }

    static void updateStudent() {

        System.out.print("Enter Student ID to Update: ");
        int updateId = sc.nextInt();

        boolean updated = false;

        for (int i = 0; i < count; i++) {

            if (studentId[i] == updateId) {

                sc.nextLine();

                System.out.print("Enter New Name: ");
                studentName[i] = sc.nextLine();

                System.out.print("Enter New Age: ");
                age[i] = sc.nextInt();

                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextDouble();

                updated = true;

                System.out.println("Student Updated Successfully.");
                break;
            }
        }

        if (!updated)
            System.out.println("Student Not Found.");
    }

    static void deleteStudent() {

        System.out.print("Enter Student ID to Delete: ");
        int deleteId = sc.nextInt();

        boolean deleted = false;

        for (int i = 0; i < count; i++) {

            if (studentId[i] == deleteId) {

                for (int j = i; j < count - 1; j++) {

                    studentId[j] = studentId[j + 1];
                    studentName[j] = studentName[j + 1];
                    age[j] = age[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;

                deleted = true;

                System.out.println("Student Deleted Successfully.");
                break;
            }
        }

        if (!deleted)
            System.out.println("Student Not Found.");
    }
}