import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {

        double amountOfGas = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        double costOneHundredMiles; //cost to drive 100 miles
        double fullTankDistanceMax; //max distance capable on full tank

        Scanner in = new Scanner(System.in);
        String trash; //used to store invalid input and inform user
        boolean valid = true;

        do {

            System.out.print("Please input the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                amountOfGas = in.nextDouble();
                valid = true;

            } else {

                trash = in.next();
                System.out.println("'"+trash+"'" +" is not a valid input");
                valid = false;
            }
        }while(!valid);


        do {

            System.out.print("Please input the fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble()) {

                fuelEfficiency = in.nextDouble();

                valid = true;

            } else {

                trash = in.next();
                System.out.println("'"+trash+"'" +" is not a valid input");
                valid = false;
            }
        } while(!valid);

        do {

            System.out.print("Please input the price of gas per gallon: ");

            if (in.hasNextDouble()) {

                pricePerGallon = in.nextDouble();

                valid = true;

            } else {

                trash = in.next();
                System.out.println("'"+trash+"'" +" is not a valid input");
                valid = false;
            }
        }while(!valid);


        costOneHundredMiles = 100 * pricePerGallon;

        fullTankDistanceMax = fuelEfficiency * amountOfGas;

        System.out.println("The cost for you to drive 100 miles is "+costOneHundredMiles);

        System.out.println("Your vehicle is capable of driving "+fullTankDistanceMax+" miles on a full tank of gas.");



    }
}

