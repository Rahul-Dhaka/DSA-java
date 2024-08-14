import java.util.Scanner;

public class NestedSwithch {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter employ id and department");
        int empId = input.nextInt();
        String department = input.next();   

        switch (empId) {
            case 1: System.out.println("Rahul Dhaka"); break;
            case 2: System.out.println("Kunak Kushwah"); break;
            case 3: System.out.println("emp id 3");
             switch (department) {
                case "IT": System.out.println("IT department"); break;
                case "Management": System.out.println("Management Department"); break;
                default: System.out.println("no department");
            } break;

            default: System.out.println("Enter correct emp id");
        }
    }
}
