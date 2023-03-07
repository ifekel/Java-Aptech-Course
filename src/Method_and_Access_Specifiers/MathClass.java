package Method_and_Access_Specifiers;

public class MathClass {
    public void add(int num1, int num2) {
        System.out.println("Result after addition is: " + (num1 + num2));
    }

    // Overloading add() method as it now takes 3 arguments instead of 2
    public void add(int num1, int num2, int num3) {
        System.out.println("Result after addition is: " + (num1 + num2 + num3));
    }

    // Overloading add() method as it now takes a float and an int as arguments
    public void add(float num1, int num2) {
        System.out.println("Result after addition is: " + (num1 + num2));
    }

    // Overloading add() method as it now takes a float and an int but in a different sequence
    public void add(int num1, float num2) {
        System.out.println("Result after addition is: " + (num1 + num2));
    }

    // Overloading add() method as it takes a float and a float
    public void add(float num1, float num2) {
        System.out.println("Result after addition is: " + (num1 + num2));
    }

    public static void main(String[] args) {
        // Instantiate the MathClass class
        MathClass objMath = new MathClass();

        // Invoke the overloaded method with relevant arguments
        objMath.add(3.5f, 3);
        objMath.add(3, 3);
        objMath.add(3.5f, 3.5f);
    }
}
