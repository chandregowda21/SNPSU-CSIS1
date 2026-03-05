package Arrays;
/*
public class Rotatearrayby1 {
    public static void main(String[] args){
        int[] ar={1,2,3,4,5};
        int temp=ar[0];
        for (int i=1;i<5;i++){
          ar[i-1]=ar[i];
        }
        ar[ar.length-1]=temp;
        for (int i=0;i<5;i++) {
            System.out.println(ar[i]);
        }
    }
}

 */
public class Rotatearrayby1 {
    public static void main(String[] args){
        int[] ar={1,2,3,4,5};
        int temp=ar[ar.length-1];
        for (int i=ar.length-1;i>0;i--){
            ar[i]=ar[i-1];
        }
        ar[0]=temp;
        for (int i=0;i<5;i++) {
            System.out.println(ar[i]);
        }
    }
}
