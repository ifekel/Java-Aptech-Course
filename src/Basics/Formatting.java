package Basics;

public class Formatting {
    public static void main(String[] args) {
        int i = 55/22;
        // Decimal Integer
        System.out.printf("55/22: %d%n", i);

        // Pad with zeros
        double q = 1.0 / 2.0;
        System.out.printf("1.0 / 2.0 = %09.10f %n", q);

        // Format Specifier
        int num = 5;
        double result = num * num;
        System.out.format("The square root of %d is %f.%n", num, result);
    }
}
