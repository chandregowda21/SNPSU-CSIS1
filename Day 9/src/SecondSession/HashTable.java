package SecondSession;

public class HashTable {
    static int TableSize = 10;
    static int hashTable[] = new int[TableSize];
    static void insert(int key){
        int index = key%TableSize;
        hashTable[index]=key;
    }
    static boolean display(){
        for(int i=0;i<TableSize;i++){
            System.out.println(i+" ->"+hashTable[i]);
        }
        return false;
    }
    public static void main(String[] args){
        insert(32);
        insert(24);
        insert(33);
        insert(48);
        insert(44);
        System.out.println(HashTable.display());
    }
}
