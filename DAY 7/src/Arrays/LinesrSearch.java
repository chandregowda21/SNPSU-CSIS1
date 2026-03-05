package Arrays;

public class LinesrSearch {
    public static void main(String[] args){
        int[] ar={1,2,3,4,5};
        int key=3;
        for(int i=0;i<ar.length;i++) {
            if (ar[i] == key) {
                System.out.println(i);
            }
        }
    }
}
