package SearchingAndSorting;

public class WrapperClass {
    public static void main(String[] args){
        int a=10;
        Integer obj=a;
        System.out.println(a);

        //autounboxing
        Integer b=10;
        int c=b;
        System.out.println(c);

        //wrapper class methods
        Integer num = 50;
        System.out.println(num.compareTo(60));
        //equals
        System.out.println(num.equals(50));
        //max
        System.out.println(Integer.max(10,20));
        //min
        System.out.println(Integer.min(10,20));
        //parseInt
        System.out.println(Integer.min(10,20));
    }
}
