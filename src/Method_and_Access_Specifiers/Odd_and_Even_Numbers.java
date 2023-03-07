package Method_and_Access_Specifiers;

public class Odd_and_Even_Numbers {
    public void get_odd_and_even_numbers(int ...num) {
        for (int number : num) {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        }
    }

    public static void main(String[] args) {
        Odd_and_Even_Numbers oddEvenNumOj = new Odd_and_Even_Numbers();

        oddEvenNumOj.get_odd_and_even_numbers(1, 4, 1, 2, 1,5, 7, 3, 8, 10);
    }
}
