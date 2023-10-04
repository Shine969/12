import java.util.Random;
import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(11);

        System.out.println("  ");
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME.");
        System.out.println("  ");
        System.out.println("Guess a random number from 0 to 10.  or Type 'quit' to exit. ");

        boolean Guessed = true;

        while (!Guessed) {

                System.out.println("Enter a number between 0 and 10: ");
                int guess = sc.nextInt();

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the secret number.");
                    break;
                }
                System.out.print("DO YOU WANT TO QUIT?, TYPE 'quit' TO QUIT THE GAME or 'play' to play the game: ");
                    String leave = sc.next();
                    System.out.println("        ");

                if (leave.equals("quit")) {
                    System.out.println("Thanks for playing.");
                    break;

            }
        }
    }
}
