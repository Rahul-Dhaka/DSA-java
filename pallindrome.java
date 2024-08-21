import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string you want to check : ");
        String test = input.next();
        System.out.println("the length of the string is :" + test.length());
        if (test.length()%2 !=0){
            int n = test.length() -1;
            int i=0;
            boolean result = true;
            while (i < n){
                // System.out.println("value of i : " + test.charAt(i) + "---" + "value of n : " + test.charAt(n));
                if ( test.charAt(i) != test.charAt(n)){
                    result = false;
                }
                n--;
                i++;
            }

            if (result==true){
                System.out.println("The given string is pallindrome");
            }
            if (result==false){
                System.out.println("The given string is not :P");
            }
        }
        if (test.length()%2==0){
            int n = test.length() -1;
            int i=0;
            boolean result = true;
            while (i <= n){
                System.out.println("value of i : " + test.charAt(i) + "---" + "value of n : " + test.charAt(n));
                if ( test.charAt(i) != test.charAt(n)){
                    result = false;
                }
                n--;
                i++;
            }

            if (result==true){
                System.out.println("The given string is pallindrome");
            }
            if (result==false){
                System.out.println("The given string is not :P");
            }
        }
    }
}
