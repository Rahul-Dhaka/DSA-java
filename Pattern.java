import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = input.nextInt();

        for (int i = 0; i< n ; i++) {
            for (int j = 0 ; j<= i ; j++) {
                System.out.print('*');
        }
        System.out.println("");
    }
}
}
