import java.lang.reflect.Array;
import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
    
}