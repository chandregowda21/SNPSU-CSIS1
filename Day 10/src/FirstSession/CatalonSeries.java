package FirstSession;

public class CatalonSeries {
    static int catalon(int n){
        if(n==0 || n==1)return 1;
        int res=0;
        for(int i=0;i<n;i++){
            res+=catalon(i)*catalon(n-1-i);
        }
        return res;
    }
    public static void main(String[] args){
        int terms = 3;
        System.out.println("catalon number series:");
        for(int i=0;i<terms;i++){
            System.out.print(catalon(i)+" ");
        }
    }
}
