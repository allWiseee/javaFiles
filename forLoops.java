import java.util.Scanner;
public class forLoops {
    public static void main(String[] args) {
        //Gather user's first number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //Gather user's second number
        System.out.print("Enter the second #: ");
        int number2 = input.nextInt();
        int sum = 0;

        //close scanner
        input.close();

        // For loops
        for (int i = 1; i < number; ++i) {
            System.out.println("I am the greatest");
        } 

        for (int n = 1000; n < number2; ++n) {
            sum += n;
        }
        System.out.println(sum);
    }
}
