public class Ternary{
    public static void main(String[] args){
        String v = (2 > 1) ? "True": "False";
        System.out.println(v);

        // bitwise
        System.out.println(~6);
        System.out.println(~-5000);
        int n = 8;
        if((n&(n-1))==0){   // imp leetcode
            System.out.println("po2");
        }
        else{
            System.out.println("npo2");
        }

        //conditional stat

    }
}