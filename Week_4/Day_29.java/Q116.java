import java.util.Scanner;

public class Q116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] productId = new int[100];
        String[] productName = new String[100];
        double[] price = new double[100];
        int[] quantity = new int[100];

        int count = 0;

        while (true) {

            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    productId[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    productName[count] = sc.nextLine();

                    System.out.print("Enter Price: ");
                    price[count] = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();

                    count++;

                    System.out.println("Product Added Successfully.");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Products Found.");
                    } else {

                        System.out.println("\n------ Product Records ------");

                        for (int i = 0; i < count; i++) {

                            System.out.println("Product ID : " + productId[i]);
                            System.out.println("Product Name : " + productName[i]);
                            System.out.println("Price : " + price[i]);
                            System.out.println("Quantity : " + quantity[i]);
                            System.out.println("----------------------------");
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Product ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (productId[i] == searchId) {

                            System.out.println("Product Found");
                            System.out.println("Product ID : " + productId[i]);
                            System.out.println("Product Name : " + productName[i]);
                            System.out.println("Price : " + price[i]);
                            System.out.println("Quantity : " + quantity[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Product ID to Update: ");
                    int updateId = sc.nextInt();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {

                        if (productId[i] == updateId) {

                            sc.nextLine();

                            System.out.print("Enter New Product Name: ");
                            productName[i] = sc.nextLine();

                            System.out.print("Enter New Price: ");
                            price[i] = sc.nextDouble();

                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();

                            updated = true;

                            System.out.println("Product Updated Successfully.");
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Product Not Found.");

                    break;

                case 5:

                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {

                        if (productId[i] == deleteId) {

                            for (int j = i; j < count - 1; j++) {

                                productId[j] = productId[j + 1];
                                productName[j] = productName[j + 1];
                                price[j] = price[j + 1];
                                quantity[j] = quantity[j + 1];
                            }

                            count--;

                            deleted = true;

                            System.out.println("Product Deleted Successfully.");
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Product Not Found.");

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