package alexeystrunets.ht4;

import java.util.Arrays;

public  class ht4_arrays_dop5 {
    public static void main(String[] args) {
        int[] arr = {1,6,7,10,4,6,8,1};
        System.out.println(Arrays.toString(arr));
        for (int i =0;i<= arr.length;i++){
            if (i%2!=0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
