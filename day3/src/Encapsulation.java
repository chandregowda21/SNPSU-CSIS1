class Student {
    private int usn;
    private String email;
    public void setUsn(int usn){
        this.usn = usn;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getUsn(){
        return this.usn;
    }
    public String getEmail(){
        return this.email;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Student s = new Student();
        //setters
        s.setUsn(101);
        s.setEmail("chandu@123");
        //getters
        System.out.println(s.getUsn());
        System.out.println(s.getEmail());
    }
}