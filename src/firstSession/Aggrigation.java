package firstSession;

class Department {
    String deptname;
    Department(String deptname){
        this.deptname=deptname;
    }
}
class College{
    String colname;
    Department department;
    College(String colname,Department department){
        this.colname=colname;
        this.department=department;
    }
    void display(){
        System.out.println(colname+"has Department "+department);
    }
}
public class Aggrigation {
    public static void main(String[] args){
        Department d = new Department("cse");
        College c = new College("snpsu",d);
        c.display();
    }
}
