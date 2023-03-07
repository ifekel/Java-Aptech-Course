package MadMax;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create an object and passes the input strem object
        Scanner num = new Scanner(System.in);

        System.out.println("Enter a number:");

        // Accepts integer value from the user
        int intVal = num.nextInt();
        System.out.printf("Value entered: %d.%n", intVal);


        System.out.println("Enter a string");
        // Accepts string from the user
        String value = num.next();
        System.out.print("Value entered is: " + value);
    }
}
