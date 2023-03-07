package Decision_Making;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        // int first = 400, second = 700, result;
        // result = first + second;

        // if (result > 1000) {
            // second = second + 100;
        // }

        // System.out.println("The value of second: " + second);

        // IF ELSE
        int number  = 10, remainder;

        remainder = number % 2;

        if (remainder == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // The Scanner class gets input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        /*
        int num = input.nextInt();

        // Checks whether a number is divisible by 3

        if (num % 3 == 0) {
            System.out.println("Inside outer if block");

            if (num % 5 == 0) {
                System.out.println("Number is divisible by 3 and 5");
            }
            else {
                System.out.println("Number is divisible by 3 and not by 5");
            }
        }
        else {
            System.out.println("Number is not divisible by 3");
        }
         */

        System.out.print("Enter Score: ");
        int totalMarks = input.nextInt();

        if (totalMarks >= 90) {
            System.out.println("Grade = A+");
        }

        else if (totalMarks >= 60) {
            System.out.println("Grade = A");
        }

        else if (totalMarks >= 40) {
            System.out.println("Grade = b");
        }

        else if (totalMarks >= 30) {
            System.out.println("Grade = c");
        }

        else {
            System.out.println("Fail");
        }
    }
}
