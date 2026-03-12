package SearchingAndSorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] ar={1,4,2,6,3};
        for(int i=1;i<ar.length;i++){
            int key = ar[i];
            int j=i-1;
            while (j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;
        }
        System.out.println(Arrays.toString(ar));
    }
}
