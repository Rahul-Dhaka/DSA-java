import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // program for finding the sum of two numbers
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum of the numbers is - " + sum);
    }
}
