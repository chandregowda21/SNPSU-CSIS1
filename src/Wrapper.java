public class Wrapper {
    public static void main(String[] args){
        int x =10;
        int y = 20;
        Integer obj1=Integer.valueOf(x);//boxing
        Integer obj2=y;//autoboxing
        System.out.println(obj2);
        Integer obj3=Integer.valueOf(50);//unboxing
        int z = obj3.intValue();
        Integer obj4=Integer.valueOf(100);//autounboxing
        int a=obj4;
        System.out.println(obj4);

        //uses
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num*2);
        String s2 = Integer.toString(num);
        System.out.println(s2+"abc");
    }
}