package Classes_and_Objects;

public class Rectangle {
    int width;
    int height;

    Rectangle() {
        width = 10;
        height = 20;
    }

    public static void main(String[] args) {
        Rectangle objRec = new Rectangle();

        System.out.println("Width of rectangle is: " + objRec.width);
        System.out.println("Height of rectangle is: " + objRec.height);
    }
}