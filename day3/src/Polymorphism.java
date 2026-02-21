/*
//method overloading
public class Polymorphism {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);

    }
    static void add(double a,double b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        Polymorphism.add(10,20);
        Polymorphism.add(10,20,30);
        Polymorphism.add(10.0,20.0);
    }
}
 */

//overriding

class Rbi{
    double roi(){
        return 6.5;
    }
}
class icici extends Rbi{
    @Override
    double roi() {
        return 7.2;
    }
}
class hdc extends Rbi{
    @Override
    double roi() {
        return 7.8;
    }
}
public class Polymorphism {
    public static void main(String[] args){
        hdc h = new hdc();//Rbi hdc = new hdc
        icici i = new icici();//Rbi icici = new icici
        Rbi r = new Rbi();//Rbi rbi = new Rbi
        System.out.println(r.roi());
        System.out.println(i.roi());
        System.out.println(h.roi());
    }
}