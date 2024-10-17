import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {

        Random generator = new Random();
        int targetNum = generator.nextInt(10) + 1;  // val is 1 to 10

        Scanner in = new Scanner(System.in);
        int guess = 0;


        boolean valid = true;
        String trash = "";

        do{
            System.out.print("Guess a number between 1-10: ");

            if (in.hasNextInt() ){

                guess = in.nextInt();

                if (guess >= 1 && guess <= 10) {

                    int result = Integer.compare(guess, targetNum); // returns a switch case friendly value

                    switch (result) {

                        case 0:

                            System.out.println("Correct! You guessed on the money!");

                            break;

                        case 1:

                            System.out.println("Number is too high! Try again.");

                            break;

                        case -1:

                            System.out.println("Number is too low! Try again.");

                            break;
                    }

                    valid = true;

                }else{

                    System.out.println("'"+guess+"'"+" is not a valid input");

                    valid = false;
                }

            }else{

                trash = in.next();

                System.out.println("'"+trash+"'"+" is not a valid input");

                valid = false;
            }

        }while(!valid);
    }
}