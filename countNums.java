public class countNums {
    public static void main(String[] args) {
        int n = 3462302; 

        int result = 0 ;

        while (n>0){
            int rem = n%10;
            result = result*10 + rem;
            n = n/10;
        }

        System.out.println("Ans is - " + result);
    }
}
