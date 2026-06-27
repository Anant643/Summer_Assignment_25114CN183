import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "What is the capital of India?",
                "Which language is used for Android development?",
                "How many bits are there in a byte?",
                "What is 10 + 20?",
                "Which company developed Java?"
        };

        String[] answers = {
                "Delhi",
                "Java",
                "8",
                "30",
                "Oracle"
        };

        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ". " + questions[i]);
            System.out.print("Your Answer: ");

            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer: " + answers[i] + "\n");
            }
        }

        System.out.println("===== RESULT =====");
        System.out.println("Score: " + score + "/" + questions.length);

        if (score == questions.length) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        scanner.close();
    }
}