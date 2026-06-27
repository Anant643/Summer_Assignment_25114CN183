import java.util.Scanner;

public class Q114{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int count = 0;

        while (true) {

            System.out.println("\n===== ARRAY OPERATIONS =====");
            System.out.println("1. Insert Element");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Update Element");
            System.out.println("5. Delete Element");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Element: ");
                    arr[count] = sc.nextInt();
                    count++;

                    System.out.println("Element Inserted.");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("Array is Empty.");
                    } else {

                        System.out.println("Array Elements:");

                        for (int i = 0; i < count; i++) {
                            System.out.print(arr[i] + " ");
                        }

                        System.out.println();
                    }

                    break;

                case 3:

                    System.out.print("Enter Element to Search: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (arr[i] == search) {

                            System.out.println("Element Found at Index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Element Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Index to Update: ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < count) {

                        System.out.print("Enter New Value: ");
                        arr[index] = sc.nextInt();

                        System.out.println("Element Updated.");

                    } else {

                        System.out.println("Invalid Index.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Element to Delete: ");
                    int delete = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {

                        if (arr[i] == delete) {

                            for (int j = i; j < count - 1; j++) {

                                arr[j] = arr[j + 1];
                            }

                            count--;
                            deleted = true;

                            System.out.println("Element Deleted.");
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Element Not Found.");

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
}