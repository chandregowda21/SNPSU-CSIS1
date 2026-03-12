package SearchingAndSorting;
import java.util.*;
public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> al  = new ArrayList<>();
        for(int i=1;i<=10;i++){
            al.add(i);
        }
        for(int i=0;i<=al.size();i++){
            if(al.get(i)>7){
                al.remove(i);
            }
        }
        System.out.println(al);
    }
}
