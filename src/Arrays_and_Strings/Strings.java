package Arrays_and_Strings;

public class Strings {
    public static void main(String[] args) {
        String mary = "Mary";
        // this is equivalent to
        char newName[] = {'M', 'A', 'R', 'Y'};

        // An instance of the string class can also be created using the new keyword
        /*
            String str = new String("Hello world");
            System.out.println(str);
         */

        // Converting a char array to a string
        char name[] = {'I', 'f', 'e', 'a', 'n', 'y', 'i'};

        String empName = new String(name);
        System.out.println(empName);


        // ================ String Builder Class
        StringBuilder str = new StringBuilder(100);
        System.out.println(str.capacity());
    }
}
