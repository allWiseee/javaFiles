import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        //getting input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //closing input
        input.close();

        // for loop
        for (int i = 0; i < number; ++i) {
            System.out.println(i);

        // iterating through a list
        int[] array = {1,2,3,4,5,6,7,8,9};
        for(int number2: array){
            System.out.println(number2);
        }
        }
    }
}