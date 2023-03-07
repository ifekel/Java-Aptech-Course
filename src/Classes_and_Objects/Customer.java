package Classes_and_Objects;

public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    void changeCustomerAddress(String address) {
        customerAddress = address;
    }

    void displayCustomerInformation() {
        // Display the objCustomer1 object details
        System.out.println("Customer Identification Number: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }

    public static void main(String[] args) {
        Customer objCustomer1 = new Customer();

        objCustomer1.customerID = 100;
        objCustomer1.customerName = "Ifeanyi";
        objCustomer1.customerAddress = "Enugu";
        objCustomer1.customerAge = 19;

        objCustomer1.displayCustomerInformation();
        objCustomer1.changeCustomerAddress("Lagos");
        objCustomer1.displayCustomerInformation();
    }
}
