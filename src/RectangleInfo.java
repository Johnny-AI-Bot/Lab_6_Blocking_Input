
import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;

        String trash = "";
        boolean valid = true;

        //length of rectangle
        do {

            System.out.print("Enter the length of your rectangle: ");

            if (in.hasNextDouble()){
                length = in.nextDouble();
                valid = true;

            }else{

                trash = in.next();
                System.out.println("'"+trash+"'"+ " is not a valid input");
                valid = false;
            }

        }while(!valid);


        //width of rectangle
        do {

            System.out.print("Enter the width of your rectangle: ");

            if (in.hasNextDouble()){
                width = in.nextDouble();
                valid = true;

            }else{

                trash = in.next();
                System.out.println("'"+trash+"'"+ " is not a valid input");
                valid = false;
            }

        }while(!valid);

        area = length * width;

        System.out.println("The area of your rectangle is "+area + " ft squared");

        perimeter = (2 * length) + (2 * width);

        System.out.println("The perimeter of your rectangle is "+perimeter + " ft");

        diagonal = Math.sqrt(Math.pow(length,2)+ Math.pow(width,2));

        System.out.println("The length of the diagonal of your rectangle is "+diagonal + " ft");






    }
}