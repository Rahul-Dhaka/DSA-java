import java.util.Arrays;
public class testarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
    
            System.out.println(Arrays.toString(arr));
        
        
        int[][] arr2 = new int[2][2];
        for (int i = 0; i < arr2.length; i++){
            for (int j : arr2[i]){
                j = j + 1;
        }
    }
    // System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));
    
    }
}
