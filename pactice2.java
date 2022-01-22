public class pactice2 {
    public static void main(String[] args) {
        int a = 12, b = 5, c = 6;
        int newA = ++a; //incriment by 1
        int newB = --b; // decrements by 1
        String result;
        result = (a==b) ? "a and b are equal" : "a and b are not equal";
        System.out.println("a + b is " + (a+b));
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a>c && c>b); // and logic operator
        System.out.println(a>c || b>c); // or logic operator
        System.out.println(!(a==c)); // not logic operator
        System.out.println(newA);
        System.out.println(newB);
        System.out.println(result);
    }
}
