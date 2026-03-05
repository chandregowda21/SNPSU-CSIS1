import javax.swing.plaf.IconUIResource;

public class MajorityElement {
    public static void main(String[] args){
        int count=0;
        int maj=0;
        int[] ar={1,2,1,1,2,2,2};
            for(int num:ar){
                if(count==0){
                    maj=num;

                }
                if(num==maj){
                    count++;
                }
                else{
                    count=0;
                }

        }
        System.out.println(maj);
    }
}
