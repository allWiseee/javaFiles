import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args){
        //creating input object
        Scanner input = new Scanner(System.in);
        //prompt user for input
        System.out.print("Enter number: ");
        // text field for input
        int number = input.nextInt();
        //aggregate
        int sum = 0;

        //while loop that adds only positive numbers
        do {
            sum += number;
            System.out.print("Enter a number: ");
            number = input.nextInt();
        }while (number >= 0);
        
        System.out.println("Total is: " + sum);
        input.close();
    }
}
