import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter char : ");
        char ch = input.next().trim().charAt(0);
        System.out.println("this is the char : " + ch);
    }
}
