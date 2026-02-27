package firstSession;
class Teacher{
    static String name;
    Teacher(String name){
        this.name=name;
    }
}
class student{
    static String name;
    student(String name){
        this.name=name;
    }
}
public class Association {
    public static void main(String[] args){
        Teacher t = new Teacher("Chandu");
        student s =new student("aruna");
        System.out.println(student.name+" is taught by "+ Teacher.name);
    }
}
