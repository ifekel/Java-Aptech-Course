package Basics;

public class Enums {

    // Creating enums
    enum Direction {
        North, West, South, East
    }
    public static void main(String[] args) {

        // Declares a variable of type Direction
        Direction direction;
        direction = Direction.North;

        // Prints the value of the enum
        System.out.println("Value " + direction);
    }
}
