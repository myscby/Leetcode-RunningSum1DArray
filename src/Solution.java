import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] num = new int[5];
        num = new int[]{1,3,5,7,9};
        int total = 0;
        int[] arr = new int[5];

        for (int i = 0; i < num.length; i++) {
            total += num[i];
            arr[i] = total;
        }
        System.out.print(Arrays.toString(arr));
        
        //Try
    }

}
