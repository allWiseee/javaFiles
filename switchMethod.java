import java.util.Scanner;

public class switchMethod {
    public static void main(String[] args) {
        
        //Getting user's shoesize
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your shoe size: ");
        int size = input.nextInt();

        //close scanner
        input.close();

        String description;

        switch(size) {
            case (4):
                description = "Small foot";
                break;
            
            case 8:
                description = "Medium foot";
                break;
            
            case 10:
                description = "Large foot";
                break;
            
            default:
                description = "Who knows";
                break;

        }
        System.out.println("you have a " + description);
    }
}
