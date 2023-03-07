package Looping_Construct;

import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the menu calculator program");

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Do you wish to proceed? ");
            String proceed = input.nextLine();
            startProgram:
            if (proceed.equals("yes")) {
                System.out.print("Enter a number: ");
                int num1, num2;
                num1 = input.nextInt();
                System.out.print("Enter another number: ");
                num2 = input.nextInt();
                System.out.println("Choose an operation you wish to perform with the 2 numbers you entered");
                System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
                System.out.print("Choose one: ");
                String operation = input.next();
                switch (operation) {
                    case "1" -> {
                        System.out.printf("Addition\nThe numbers you entered are %d and %d and the sum of both is: %d\n", num1, num2, num1 + num2);
                    }case "2" -> {
                        System.out.printf("Subtraction\nThe numbers you entered are %d and %d and the subtraction of both is: %d\n", num1, num2, Math.abs(num1 - num2));
                    }case "3" -> {
                        System.out.printf("Multiplication\nThe numbers you entered are %d and %d and the product of both is: %d\n", num1, num2, num1 * num2);
                    }case "4" -> {
                        System.out.printf("Division\nThe numbers you entered are %d and %d and the quotient of both is: %d\n", num1, num2, num1 / num2);
                    }
                }
                System.out.print("Do you wish to continue: ");
                String cont = input.next();
                if (cont.equals("yes")) {
                    break startProgram;
                }
                else {
                    break;
                }
            }
            else {
                break;
            }
        }
    }
}
