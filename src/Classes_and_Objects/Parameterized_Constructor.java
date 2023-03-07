package Classes_and_Objects;

public class Parameterized_Constructor {
    int width;
    int height;

    Parameterized_Constructor() {
        System.out.println("Constructor Invoked!");
        width = 10;
        height = 20;
    }

    Parameterized_Constructor(int wid, int hig) {
        System.out.println("Parameterized Constructor Invoked!");
        width = wid;
        height = hig;
    }

    void displayInfo() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {
        Parameterized_Constructor objPara = new Parameterized_Constructor();
        Parameterized_Constructor objPara2 = new Parameterized_Constructor(20, 20);
        objPara.displayInfo();
        objPara2.displayInfo();
    }
}
