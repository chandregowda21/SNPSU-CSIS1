package firstSession;

public class StringPool {
    public static void main(String[] args){
        String s1="Ben10";//stored in string pool
        String s2="Ben10";
        String s3 = new String("Ben10");//stored in heap
        String s4 = new String("Ben10");
        System.out.println("s1==s2: "+s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1.equals(s2));


        //intern() method
        String s5=s3.intern();//convert string into String pool
        System.out.println(s1==s5);
        System.out.println(s1.equals(s5));
    }
}
