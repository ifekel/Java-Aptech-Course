package Arrays_and_Strings;

public class StringArray {
    // Instantiate a new string array
    String[] empID = new String[5];

    public void createArray() {
        System.out.println("Creating Array. Please wait....");

        // Use for loop to initialize the array
        for (int count = 1; count < empID.length; count++) {
            empID[count] = "E00" + count; // Storing values in the array
        }
    }

    public void printArray() {
        System.out.println("The array is: ");

        // Use a for loop to print the array
        for (int count = 1; count < empID.length; count++) {
            System.out.println("Employee ID is: " + empID[count]);
        }
    }

    public static void main(String[] args) {
        // Instantiate the class StringArray
        StringArray objStrArr = new StringArray();

        // Invoke the createArray() method
        objStrArr.createArray();

        // Invoke the printArray() method
        objStrArr.printArray();
    }
}
