package Arrays_and_Strings;

public class CommandLine {
    public static void main(String[] args) {
        // Check the number of command line arguments
        if (args.length == 3) {
            // Display the values of individual arguments
            System.out.println("First name is: " + args[0]);
            System.out.println("Last name is: " + args[1]);
            System.out.println("Designation is: " + args[2]);
        }
        else {
            System.out.println("Specify the first name, last name and designation");
        }
    }
}
