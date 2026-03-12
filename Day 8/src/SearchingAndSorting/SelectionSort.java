package SearchingAndSorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] ar = {1,5,2,7,3,4};
        int minindex=0;
        for(int i=0;i<ar.length-1;i++){
            minindex=i;
            for (int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[minindex]){
                    minindex=j;
                }

            }
            int temp = ar[minindex];
            ar[minindex] = ar[i];
            ar[i] = temp;
        }
        System.out.println(Arrays.toString(ar));
    }
}
