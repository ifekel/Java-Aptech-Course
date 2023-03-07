package Basics;

public class TypeCasting {
    public static void main(String[] args) {
        double dbl = 10;
        long lng = 100;
        int in = 10;

        dbl = lng;
        lng = in;
        System.out.println("value of dbl is: " + dbl);
        System.out.println("value of lng is: " + lng);

        // Explicit Conversion
        float d = 14.245f;
        int b = (int) d + 5;
        System.out.println(b);
    }
}
