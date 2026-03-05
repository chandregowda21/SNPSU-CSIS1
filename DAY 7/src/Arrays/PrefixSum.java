package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args){
        int[] ar={2,4,3,7,9};
        for(int i=1;i<ar.length;i++){
            ar[i]=ar[i]+ar[i-1];
        }
        System.out.println(Arrays.toString(ar));
    }
}
