import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while(true) {
            System.out.print("Enter opertor: ");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                System.out.print("Enter two numbers two perform calculations: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op=='+'){
                    ans = num1+num2;
                }
                if (op=='-'){
                    ans = num1-num2;
                }
                if (op=='*'){
                    ans = num1*num2;
                }
                if (op=='/'){
                    if(num2!=0){
                        ans = num1/num2;
                    }
                    
                }
                if(op=='%'){
                    ans = num1%num2;
                };
                System.out.println("Result: " + ans);
            }

            else if (op == 'x' || op == 'X'){
                System.out.print("exit calculator");
                break;
            }
            else {
                System.out.println("Invalid operator. Please try again.");
            }
        }
    }
}
