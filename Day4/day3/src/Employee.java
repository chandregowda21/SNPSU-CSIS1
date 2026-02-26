/*public class Static {
    public static void main(String[] args) {

    }

    static {
        System.out.println("start of execution");
        System.out.println("use to load database");
    }
}
 */

public class Employee{
    int id;
    String name;
    double salary;
    static String company = "tcs";
    Employee(){
        this(0,"not assigned",0.0);
    }
    public Employee(int id, String name){
        this(id, name, 30000);
    }

    public Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(id +" "+name+" "+salary);
    }
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee(201,"chandu");
        Employee e3 = new Employee(202,"arun",10000);

        e1.display();
        e2.display();
        e3.display();
    }
}