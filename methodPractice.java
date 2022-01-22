public class methodPractice {
    
    static class Main {
        public int multiply(int a, int b) {
            int c = a*b;
            return c; 
        }
    
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 25;

        // create an object of main
        Main obj = new Main();
        int result = obj.multiply(num1, num2);
        
        //print result
        System.out.println("num1 * num2 = " + result);
        }
    }
}
