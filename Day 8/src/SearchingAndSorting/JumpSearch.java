package SearchingAndSorting;

public class JumpSearch {
    public static int jumpSum(int[] ar,int target){
        int n=ar.length;
        int jump=(int)Math.sqrt(n);
        int prev=0;
        while(prev<n && ar[Math.min(jump,n)-1]<target){
            prev = jump;
            jump+=(int)Math.sqrt(n);
            if(prev>=n){
                return -1;
            }
        }
        //linesr search
        for(int i=prev;i<Math.min(jump,n);i++){
            if(ar[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] ar={10,20,30,40,50,60,70,80,90,100};
        int target=90;
        System.out.println(jumpSum(ar,target));
    }

}
