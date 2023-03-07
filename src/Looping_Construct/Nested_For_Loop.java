package Looping_Construct;

public class Nested_For_Loop {
    public static void main(String[] args) {

        int row, col;

        // The outer for loop executes 5 times
        for (row = 1; row <= 20; row++) {
            // For each iteration, the inner loop will execute from col = 1
            // and will continue, till the value of col is less than or equal to row

            for (col = 1; col <= row; col++) {
                System.out.print("*");
            } // End of Inner loop

            System.out.println();
        } // End of outer loop
    }
}
