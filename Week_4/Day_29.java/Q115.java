import java.util.Scanner;

public class Q115{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STRING OPERATIONS =====");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Concatenate Strings");
            System.out.println("5. Compare Strings");
            System.out.println("6. Reverse String");
            System.out.println("7. Exit");
            System.out.print("Enter your Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter String: ");
                    String str1 = sc.nextLine();

                    System.out.println("Length = " + str1.length());
                    break;

                case 2:

                    System.out.print("Enter String: ");
                    str1 = sc.nextLine();

                    System.out.println("Uppercase = " + str1.toUpperCase());
                    break;

                case 3:

                    System.out.print("Enter String: ");
                    str1 = sc.nextLine();

                    System.out.println("Lowercase = " + str1.toLowerCase());
                    break;

                case 4:

                    System.out.print("Enter First String: ");
                    String s1 = sc.nextLine();

                    System.out.print("Enter Second String: ");
                    String s2 = sc.nextLine();

                    System.out.println("Concatenated String = " + s1.concat(s2));
                    break;

                case 5:

                    System.out.print("Enter First String: ");
                    s1 = sc.nextLine();

                    System.out.print("Enter Second String: ");
                    s2 = sc.nextLine();

                    if (s1.equals(s2))
                        System.out.println("Strings are Equal.");
                    else
                        System.out.println("Strings are Not Equal.");

                    break;

                case 6:

                    System.out.print("Enter String: ");
                    str1 = sc.nextLine();

                    String reverse = "";

                    for (int i = str1.length() - 1; i >= 0; i--) {

                        reverse += str1.charAt(i);
                    }

                    System.out.println("Reversed String = " + reverse);

                    break;

                case 7:

                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}