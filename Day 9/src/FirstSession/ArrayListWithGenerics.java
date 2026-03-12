package FirstSession;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListWithGenerics {
        public static void main(String[] args){
            ArrayList<Object> al = new ArrayList<Object>();
            al.add(10);
            al.add("Hii");
            al.add(3.13);
            al.add(true);
            System.out.println(al);
            for(int i=0;i<al.size();i++){
                Object num = (Object) al.get(i);
                System.out.println("number :"+num);
            }
        }


}
