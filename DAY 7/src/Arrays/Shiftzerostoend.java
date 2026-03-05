package Arrays;

import java.util.Arrays;

public class Shiftzerostoend {
    public static void main(String[] args){
        int[] ar={1,0,5,0,2,4};
        int nz=0,z=0;
        while (nz<ar.length){
            if(ar[nz]!=0){
                int temp=ar[nz];
                ar[nz]=ar[z];
                ar[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }

        }
        System.out.println(Arrays.toString(ar));
    }

}
