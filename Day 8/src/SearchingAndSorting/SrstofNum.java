package SearchingAndSorting;

public class SrstofNum {
    public static int  SqrtofNum(int k, int[] ar){
        int l=0,h= ar.length;
        int m = 0;
        int res = 0;
        while (l<h){
            m = (l+h)/2;
            if(m*m==k){
                return m;
            }
            else if (m*m<k){
                l=m+1;
                res = m;
            }
            else{
                h=m-1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] ar={1,2,3,4,5};
        System.out.println(SqrtofNum(9,ar));

    }
}
