package FirstSession;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LinkedListInsertion {
    public static void main(String[] args){
        List<Integer> al = new LinkedList<>();
        al.add(10);
        al.addLast(20);
        //adding at begining
        al.addFirst(5);
        //specific position
        al.add(1,50);
        System.out.println(al);

    }
}
