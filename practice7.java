public class practice7 {
    public static void main(String[] args) {
        //creating an empty list with 5
        int[] data = new int[5];
        int[][] multi = {
            {1,2,3,4}, 
            {5,6,7,8}, 
            {9,10,11,12}, 
            {13,14,15,16}
        };

        //inputing variables into empty list
        data[0] = 12;
        data[1] = 24;
        data[2] = 36;
        data[3] = 48;
        data[4] = 60;

        //print elements out of multidimentional list via loop
        for (int[] innerArray: multi) {
            for(int number: innerArray) {
                System.out.println(number);
            }
        }
    }
}
