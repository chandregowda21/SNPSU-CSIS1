public class NestedClasses {
    private int x = 10;
    class Inner{
        void display(){
            System.out.println("The value of x is "+ x);
        }
    }
    public static void main(String[] args){
        NestedClasses n = new NestedClasses();
        //OuterCalss.InnerClass in_obj = out_obj.new InnerClass();
        NestedClasses.Inner in = n.new Inner();
        in.display();
    }
}