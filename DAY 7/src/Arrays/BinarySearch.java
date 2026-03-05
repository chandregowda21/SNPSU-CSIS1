package Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] ar={1,2,3,4,5};
        int k=5;
        int l=0,r=0,h=ar.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(ar[mid]==k){
                System.out.println(mid);
                break;
            }
            else if (k>ar[mid]){
                l=mid+1;
            }
            else {
                h=mid-1;
            }
        }

        System.out.println();

    }
}
