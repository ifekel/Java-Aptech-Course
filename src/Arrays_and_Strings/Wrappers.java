package Arrays_and_Strings;

public class Wrappers {

    public void calcResult(int num1, int num2, String choice) {
        // Switch case to evaluate the choice
        switch (choice) {
            case "+" -> {
                System.out.println("Result after addition is: " + (num1 + num2));
            }
            case "-" -> {
                System.out.println("Result after subtraction is: " + (num1 - num2));
            }
            case "*" -> {
                System.out.println("Result after multiplication is: " + (num1 * num2));
            }
            case "/" -> {
                System.out.println("Result after division is: " + (num1 / num2));
            }
        }
    }

    public static void main(String[] args) {
        // Check the number of command line arguments
        if (args.length == 3) {

            // Use the Integer wrapper to convert String argument to int type
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Instantiate the Wrappers class
            Wrappers objWrap = new Wrappers();

            // Invoke the calcResult() method
            objWrap.calcResult(num1, num2, args[2]);
        }
        else {
            System.out.println("Usage: number1 number2 operator");
        }
    }
}
