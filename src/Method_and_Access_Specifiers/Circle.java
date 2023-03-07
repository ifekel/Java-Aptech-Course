package Method_and_Access_Specifiers;

public class Circle {
    // method to retrieve the value of PI
    public double getPI() {
        return 3.14;
    }
}

// Define another class PassByRef
class PassByRef {
    // Method to calculate the area of a circle that
    // Takes the object of class Circle as parameter
    public void calcArea(Circle objPI, double radius) {
        // Use getPI() method to retrieve the value of PI
        double area = objPI.getPI() * radius * radius;

        // Print the value of area of circle
        System.out.println("Area of the circle is: " + area);
    }

    public static void main(String[] args) {
        // Instantiate the PassByRef class
        PassByRef p1 = new PassByRef();
        p1.calcArea(new Circle(), 3);
    }
}