import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        while (playAgain) {
            int numberGues = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempt = 3;
            boolean hasWon = false;

            System.out.println("I Have selected a number between 1 to 100. can you guess");
            System.out.println("you have " + maxAttempt + "attempts.");

            while (attempts < maxAttempt) {
                System.out.println(" enter you guess : ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberGues) {
                    hasWon = true;
                    break;
                } else if (userGuess < numberGues) {
                    System.out.println("too low !");
                } else {
                    System.out.println("too high !");
                }

                System.out.println("Attempts left : " + (maxAttempt - attempts));
            }
            if (hasWon) {
                System.out.println("congratulations! you guessed the number in " + attempts + "attepmts.");
            } else {
                System.out.println(" sorry , you have used all your attempts .  the number was : " + numberGues);
            }

            System.out.println("do you want to play again ? (yes/no) : ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }
        System.out.println("thank you for playing ! ");
        sc.close();
    }
}
