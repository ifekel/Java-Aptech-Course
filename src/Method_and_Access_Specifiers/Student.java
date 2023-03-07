package Method_and_Access_Specifiers;

public class Student {
    int rollNo; // Variable to store roll number
    String name; // Variable to store student name
    String address; // Variable to store address
    float marks; // Variable to store marks

    /*
       No argument constructor
    */
    public Student() {
        rollNo = 0;
        name = "";
        address = "";
        marks = 0;
    }

    /*
        Overloaded constructor that has an integer storing a user rollNumber and name
    */
    public Student(int rNo, String _name) {
        rollNo = rNo;
        name = _name;
    }

    /*
        Overloaded constructor that has a float storing a marks rollNumber and a string storing the user's address
    */
    public Student(float _marks, String _address) {
        address = _address;
        marks = _marks;
    }

    /*
        Overloaded constructor that has a string storing student name and a string storing the user's address
    */
    public Student(String _name, String _address) {
        name = _name;
        address = _address;
    }

    /*
        Create a method to display the student details
     */
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNo);
        System.out.println("Student Address: " + address);
        System.out.println("Student Mark: " + marks);
    }

    public static void main(String[] args) {
        // Instantiate the Student class
        Student student = new Student();
        student.displayDetails();
        Student student1 = new Student("Maxwell", "Enugu");
        student1.displayDetails();
    }
}
