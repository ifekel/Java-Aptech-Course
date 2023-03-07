package Classes_and_Objects;

public class Points {
    private int x;
    private int y;

    public void setX(int _x) {
        x = _x;
    }

    public void setY(int _y) {
        y = _y;
    }

    public void displayPoints() {
        System.out.println("Point X: " + x);
        System.out.println("Point Y: " + y);
    }

    Points() {
        System.out.println("Point Object Created");
    }
    Points(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public static void main(String[] args) {
        Points x = new Points();
        x.setY(20);
        x.setX(100);
        Points y = new Points();
        y.setY(10);
        y.setX(100);

        if (x.y == y.x) {
            System.out.println("They are the same co-ordinates");
        }
        else
            System.out.println("They are not of the same co-ordinates");
    }
}
