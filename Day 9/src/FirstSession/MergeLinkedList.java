package FirstSession;
import java.util.Arrays;
import java.util.LinkedList;
public class MergeLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> ll1 = new LinkedList<>(Arrays.asList(1,2,3,45));
        LinkedList<Integer> ll2 = new LinkedList<>(Arrays.asList(6,7,8,9,10));

        ll1.addAll(ll2);
        System.out.println(ll1);
    }
}
