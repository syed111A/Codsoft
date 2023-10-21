package prac;
import java.util.Scanner;
import java.util.Random;

public class challenge1 {
    public static void main(String[] args) {
        System.out.println("You have only five attempts to guess the number!");
        guess();
    }

    public static void guess() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String repeat = "y";

        while (repeat.equalsIgnoreCase("y")) { 
            int ran = rand.nextInt(100) + 1;
            int inp;
              System.out.println("Guess the number between 1 and 100: ");
            for (int i = 0; i < 5; i++) {
                
                inp = input.nextInt();

                if (inp > ran) {
                    System.out.println("Number is too high!");
                } else if (inp < ran) {
                    System.out.println("Number is too low!");
                } else if (inp == ran) {
                    System.out.println("Correct!");
                    break;
                } else {
                    System.out.println("Best of luck next time!");
                }
            }

            System.out.println("Do you want to repeat? (y/n): ");
            repeat = input.next(); // Read user's choice to repeat
        }
    }
}
