import java.util.Random;
import java.util.Scanner;

// Write a program to Create number guessing game.

public class Q101 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean again = true;

        while (again) {

            int correct = random.nextInt(100) + 1;
            int attempts = 0;
            int guess;

            while (true) {

                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();

                attempts++;

                if (guess > correct) {
                    System.out.println("Go lower!");
                } 
                else if (guess < correct) {
                    System.out.println("Go higher!");
                } 
                else {
                    System.out.println("Correct! You got it.");
                    break;
                }
            }

            System.out.println("You guessed it right in " + attempts + " attempts");

            System.out.print("Play again? (y/n): ");
            char choice = scanner.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                again = false;
            }
        }

        scanner.close();
    }
}