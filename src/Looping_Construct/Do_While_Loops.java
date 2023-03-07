package Looping_Construct;

public class Do_While_Loops {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        do {
            sum = sum + num;
            System.out.printf("Value Of Sum: %d\n", sum);
            num++;
        }
        while (num <= 10);
    }
}
