package SearchingAndSorting;

public class InterpolationSearch {
    public static int interpolationSearch(int[] ar,int target){
        int low=0;
        int high=ar.length-1;
        while (low<high && target>=ar[low]&& target<=ar[high]){
            if(low==high){
                if(ar[low]==target){
                    return low;
                }
                else{
                    return -1;
                }
            }
            int pos = low+((target-ar[low])*(high-low))/(ar[high]-ar[low]);
            if(ar[pos]==target){
                return pos;
            }
            else if(ar[pos]<target){
                low=pos+1;
            }
            else{
                high = pos-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] ar = {10,20,30,40,50,60};
        int target = 40;
        System.out.println(interpolationSearch(ar,target));
    }
}
