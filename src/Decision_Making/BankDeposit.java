package Decision_Making;

import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        System.out.println("Welcome to Tony Bank");
        System.out.println("slogan: Your money is our money");
        System.out.println("First of all we will need your credentials to open a savings account for you");
        System.out.print("Enter your Full name: ");
        Scanner input = new Scanner(System.in);
        String fullName = input.nextLine();

        if (fullName.contains(" ")) {
            System.out.println("How much do you wish to deposit? ");
            System.out.print(">> ");
            int depositAmount = input.nextInt();
            if (depositAmount > 7000) {
                System.out.println("You have been given an interest of 5%");
                double bal = depositAmount * 0.05;
                System.out.printf("Your bank balance is now: $%d.\nWith an Interest of: $%f", depositAmount, bal);
            }
            else if (depositAmount <= 7000){
                System.out.println("You have been given an interest of 4.5%");
                double bal = depositAmount * 0.045;
                System.out.printf("Your bank balance is now: $%d.\nWith an Interest of: $%f", depositAmount, bal);
            }
            else if (depositAmount <= 2000){
                System.out.println("You have been given an interest of 4%");
                double bal = depositAmount * 0.04;
                System.out.printf("Your bank balance is now: $%d.\nWith an Interest of: $%f", depositAmount, bal);
            }
            else {
                System.out.println("You do not get an interest.");
            }
        }
        else {
            System.out.println("Please put in your full name");
        }
    }
}
