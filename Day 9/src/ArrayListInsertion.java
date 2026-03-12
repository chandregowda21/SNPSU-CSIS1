import java.util.ArrayList;
import java.util.List;
public class ArrayListInsertion {
    public static void main(String[] args){
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        //adding at begining
        al.add(0,5);
        //specific position
        al.add(1,50);
        System.out.println(al);
    }
}
