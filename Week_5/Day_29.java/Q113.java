import java.util.Scanner;

public class Q113 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== MENU DRIVEN CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch (choice) {

                case 1:
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Division by zero is not allowed.");
                    break;

                case 5:
                    if (b != 0)
                        System.out.println("Result = " + (a % b));
                    else
                        System.out.println("Modulus by zero is not allowed.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }

        sc.close();
    }
}