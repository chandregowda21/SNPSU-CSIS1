package Afternoon;
class Parent{
     void show(){    //final
        System.out.println("Parent class");
    }
}
class child extends Parent{
    void show(){
        System.out.println("child class");
    }
}
public class FinalMethod {
    public static void main(String[] args){
        Parent c = new child();
        c.show();
    }
}
