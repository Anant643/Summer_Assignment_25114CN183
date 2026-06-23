//Write a program to Create voting eligibility system

import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
        
    
}
