package Arrays_and_Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayLists {
    // Create an ArrayList instance
    ArrayList<Integer> marks = new ArrayList<>();

    // Store values in ArrayList
    public void storeMarks() {
        System.out.println("Storing marks. Please wait......................");
        marks.add(40);
        marks.add(67);
        marks.add(199);
        marks.add(10);
    }

    public void displayMarks() {
        System.out.println("Marks are: ");
        // Iterating the list using for loop
        System.out.println("Iterating ArrayList using for loop");
        for (int val : marks) {
            System.out.println(val);
        }

        System.out.println("-----------------------------------------------------");
        // Iterate the list using Iterator interface
        Iterator<Integer> imarks = marks.iterator();


        System.out.println("Iterating ArrayList using Iterator");
        while (imarks.hasNext()) {
            System.out.println(imarks.next());
        }

        System.out.println("-----------------------------------------------------");
        // Sort the List
        Collections.sort(marks);
        System.out.println("Sorted list is: " + marks);
    }

    public static void main(String[] args) {
        // Instantiate the class ArrayList
        ArrayLists obj = new ArrayLists();

        // Invoke the storeMarks() method
        obj.storeMarks();

        // Invoke the displayMarks() method
        obj.displayMarks();
    }
}
