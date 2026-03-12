package LastSession;

import java.util.*;
public class SeperateChaining {
    static int tableSize=10;
    static LinkedList<Integer>[] Table=new LinkedList[tableSize];
    static void insert(int key){
        int index=key%tableSize;
        if(Table[index]==null){
            Table[index]=new LinkedList<Integer>();
        }
        Table[index].add(key);
    }
    static void display(){
        for(int i=0;i<tableSize;i++){
            System.out.print("Index: " + i + " Values: ");
            if(Table[i]!=null){
                for(int value: Table[i]){
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insert(25);
        insert(35);
        insert(45);
        insert(15);
        insert(5);

        display();
    }
}