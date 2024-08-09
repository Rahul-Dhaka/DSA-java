import java.util.Scanner;

public class TypeCasting {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        float number = input.nextFloat();
        int result = (int)number;
        System.out.println("COnverted value is " + result);

    }
}
