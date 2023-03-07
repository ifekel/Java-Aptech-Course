package Looping_Construct;

import java.util.Scanner;

public class Break_Statement
{
    public static void main(String[] args) {
        int cnt, number; // cnt is the count variable

        for (cnt = 1, number = 0; cnt <= 10; cnt++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == 0) {
                break;
            } // End of If
        } // End of for
    }
}
