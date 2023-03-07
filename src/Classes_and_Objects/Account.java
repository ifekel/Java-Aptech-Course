package Classes_and_Objects;

public class Account {
    private int accountID;
    private String holderName;
    private String accountType;


    /*
      Initialization Block
     */

    {
        accountID = 100;
        holderName = "Justin";
        accountType = "Savings";
    }

    /*
    Displays the details of the Account Object
     */
    public void displayAccountDetails() {
        System.out.println("Account Details");
        System.out.println("==============");
        System.out.println("Account ID: " + accountID + "\nAccount Type: " + accountType + "\nHolder: " + holderName);
    }

    public static void main(String[] args) {
        Account objAccount = new Account();
        objAccount.displayAccountDetails();
    }
}
