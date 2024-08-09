import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int a = 0;
        int b= 1;

        for (int i=0; i<n; i++){
            // System.out.print(a + " ");
            int sum = a+b;
            a = b;
            b = sum;
        }

        System.out.println("required fibonacci number is : " + a);

    }
}
