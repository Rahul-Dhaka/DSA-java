import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        float temperature = input.nextFloat();
        float fahrenheit = (temperature * 9/5) + 32;
        System.out.println("calculating the value of temperature");
        System.out.println("The temperature in fahrenheit is : " + fahrenheit);
    }
}
