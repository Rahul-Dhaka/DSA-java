import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        boolean result = isPrime(number);
        System.out.println(result);

    }

    static boolean isPrime(int number) {
        if (number <= 2){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(number); i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
