import java.util.Scanner;
public class ArrayIndex {
    static void fetchElements(int[] arr,int index)throws ArrayIndexOutOfBoundsException{
        if(index<0 || index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }
        else {
            System.out.println(arr[index]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("index");
        int index = sc.nextInt();
        try{
            fetchElements(arr,index);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught Exception "+e.getMessage());
        }
        finally {
            System.out.println("prog terminated");
        }

    }

}
