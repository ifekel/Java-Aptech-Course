package Looping_Construct;

public class While_Loop {
    public static void main(String[] args) {
        /*
        int num = 1;
        int product = 0;

        while (num <= 5) {
            product = num * 10;
            System.out.printf("\n%d * 10 = %d", num, product);
            num++;
        }
         */

        // Null Statements in loop
        int num1 = 1;
        int num2 = 30;

        // An empty while loop with no statement
        while (++num1 < --num2);
        // The statement executes after the while loop is complete
        System.out.println("Midpoint is: " + num1);
    }
}
