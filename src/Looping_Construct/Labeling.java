package Looping_Construct;

public class Labeling {
    public static void main(String[] args) {
        /*
        int i;
        outer:
        for (i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Hello");
                // Break out of the outer loop
                break outer;
            }
            System.out.println("This is the outer loop");
        }
        System.out.println("Good Bye!");
         */

        outer:
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                } //End of If
                System.out.print(j);
            } // End of inner loop
            System.out.println("\nThis is the outer loop");
        } // End of outer loop
        System.out.println("Good-Bye");
    }
}
