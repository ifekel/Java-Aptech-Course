package Arrays_and_Strings;

public class OneDimension {
    // Declare a single-dimensional array named marks
    int[] marks;

    /*
        Instantiate and initializes a single-dimensional array
     */

    public void storeMarks() {
        // Instantiate the array
        marks = new int[4];
        System.out.println("Storing Marks. Please wait...");

        // Initialize array elements
        marks[0] = 65;
        marks[1] = 47;
        marks[2] = 75;
        marks[3] = 50;
    }

    /*
        Display marks from a single dimensional array
     */

    public void displayMarks() {
        System.out.println("Marks are: ");

        // Display the marks
        /*
            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);
            System.out.println(marks[3]);
         */
        // Display the marks using a standard for loop
        /*
            for (int i = 0; i < marks.length; i++) {
                System.out.println(marks[i]);
            }
         */

        // Display the marks using the enhanced for loop
        for (int count : marks) {
            System.out.println(count);
        }

        // Display in a two-dimensional array
        // Displ
        // Outer Loop

    }

    public static void main(String[] args) {
        // Instantiate class OneDimension

        OneDimension oneDimenObj = new OneDimension();

        // Invoke the storeMarks() method
        oneDimenObj.storeMarks();

        // Invoke the displayMarks() method
        oneDimenObj.displayMarks();
    }
}
