//single level
/*
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}
class Student1 extends Person{
    int rollNo;
    Student1(int rollNo,String name){
        super(name);
        this.rollNo=rollNo;//calling parent class constructor
    }
    void display(){
        System.out.println(rollNo +" "+name);
    }
}

points to remember
1.super.something -> var or method
2.super() -> parent class const
3.super. -> don't use for const

public class Inheritence {
    public static void main(String[] args){
        Student1 s = new Student1(101,"chandu");
        s.display();
    }
}
*/

/*
//multilevel inheritence
class SimpleCalculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
}
class AdvanceCalculator extends SimpleCalculator{
    void square(int x){
        System.out.println(x*x);
    }
}
class SuperAdvance extends AdvanceCalculator{
    void sub(int y,int z){
        System.out.println(y-z);
    }
}
public class Inheritence {
    public static void main(String[] args){
        SuperAdvance sa = new SuperAdvance();
        sa.add(2,3);
        sa.square(3);
        sa.sub(3,2);

    }
}

 */


//hierarchical inheritance

class User{
    void role(){
        System.out.println("generic user");
    }
}
class Admin extends User{
    @Override
    void role(){
        System.out.println("Admin user");
    }
}
class Guest extends User{
    @Override
    void  role(){
        System.out.println("guest user");
    }
}
public class Inheritence {
    public static void main(String[] args){
        User u3 = new Guest();
        User u2 = new Admin();
        User u1 = new User();
        u1.role();
        u2.role();
        u3.role();
    }
}