package Method_and_Access_Specifiers;

public class ThisKeyword {
    float area;

    public float getPI() {
        return 3.14f;
    }

    /*
        Calculate the area of a circle
        A parameter rad to store the radius
     */

    public void calcArea(int rad) {
        // this.area = getPI() * rad * rad;
        // Or We can also use the 'this' int getPI()
        this.area = this.getPI() * rad * rad;
    }
}