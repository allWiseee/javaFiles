import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        System.out.print("Enter a float: ");
        float number2 = input.nextFloat();
        System.out.println("You entered " + number2);

        //Closing the scanner object
        input.close();
    }
}
