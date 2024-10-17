import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double celsius;
        double fahrenheit;
        String trash;

        do {
            System.out.print("Please input a temperature to convert to f: ");
            if (in.hasNextDouble()){

                celsius = in.nextDouble();
                System.out.println(celsius);
                done = true;
                fahrenheit = (celsius * 9 / 5) + 32;

                System.out.println("your temperature in fahrenheit is: "+fahrenheit);

            }
            else{
                trash = in.nextLine();
                System.out.println("Please enter a valid input, not "+trash);

            }
        }
        while(!done);
    }
}