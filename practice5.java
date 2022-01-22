import java.util.Scanner; 
public class practice5 {
    public static void main(String[] args) {
        //Gathers user's numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Finds and prints out the greater of the two numbers
        if (number > number2) {
            System.out.println("First number is greater than second number");
        }

        else{
            System.out.println("Second number is greater than first number");
        }
    }
}
