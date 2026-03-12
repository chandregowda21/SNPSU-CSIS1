package FirstSession;

import java.util.ArrayList;

public class ArrayListNoGenerics {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("Hii");
        al.add(3.13);
        al.add(true);
        System.out.println(al);
        for(int i=0;i<al.size();i++){
            Integer num = (Integer)al.get(i);
            System.out.println("number :"+num);
        }
    }
}
