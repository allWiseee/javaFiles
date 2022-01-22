public class multipleForloops {
    public static void main(String[] args) {
        //for every integer between 10 and including 20, prints I am the greatest
        for (int i = 10; i <= 20; ++i) {
            System.out.println("I am the greatest");
        }
        
        //for every integer between 10 and 20 adds to the total value of sum
        int sum = 0;
        for (int n = 10; n < 20; ++n) {
            sum +=n;
        }
        
        System.out.println(sum); 

        //create an array
        int[] numbers = {2,4,6,8};

        //print every number in the array
        for (int number: numbers) {
            System.out.println(number);
        }

        //creat another array
        int[] numbers2 = {1,2,3,4,5,6,7,8,9};
        int sum2 = 0;

        //for-each loop
        for (int number2: numbers2) {
            sum2+= number2;
        }
        System.out.println(sum2);
    }   
}
