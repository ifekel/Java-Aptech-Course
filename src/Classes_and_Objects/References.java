package Classes_and_Objects;

import java.sql.Ref;

public class References {
    String  name;
    int age;

    References() {
        System.out.println("Constructor Invoked!");
        name = "Ifeanyi";
        age = 20;
    }

    References(String _name, int _age) {
        System.out.println("Parameterized Constructor Invoked!");
        name = _name;
        age = _age;
    }

    void displayReference() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Initialize a new object of Reference
        References objRef1 = new References("Ifeanyi", 19);

        References objRef2;

        objRef2 = objRef1;
        objRef2.displayReference();

        // Changing the value references in objRef1
        objRef1.name = "James";
        objRef2.name = "Anthony";
        objRef1.displayReference();
        objRef2.displayReference();
    }
}
