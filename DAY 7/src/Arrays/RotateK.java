package Arrays;

public class RotateK {
    public static void reverse(int[] ar,int str,int end){
        int st=str,en=end;
        while (st<en){
            int temp=ar[st];
            ar[st]=ar[end];
            ar[end]=temp;
            st++;
            en--;
        }
    }
    public static void rotate(int[] ar,int k){
        k=k%ar.length-1;
        if(k<0){
            k=k+ar.length-1;
        }
        reverse(ar,0,k-1);
        reverse(ar,k,ar.length-1);
        reverse(ar,0,ar.length-1);

    }
    public static void main(String[] args){
        int[] ar={1,2,3,4,5};
        rotate(ar,3);
        for (int i=0;i<5;i++) {
            System.out.println(ar[i]);
        }
    }
}
