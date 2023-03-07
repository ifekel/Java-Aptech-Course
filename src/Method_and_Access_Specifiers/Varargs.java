package Method_and_Access_Specifiers;

public class Varargs {
    // Variable argument method taking variable number of integer arguments
    public void addNumber(int...num) {
        int sum = 0;
        // Use enhanced for loop to iterate through num
        for (int i : num) {
            // Add up the values
            sum = sum + i;
        }
        // Print sum
        System.out.println("Sum of number is: " + sum);
    }

    public static void main(String[] args) {
        // instantiate the Varargs class;
        Varargs obj = new Varargs();

        // Invoke the addNumber() method with multiple arguments
        obj.addNumber(20, 30, 10, 110, 11);
    }
}
