//without constructor
/*
public class Oops {
    int usn;//instance variable because each object will have have access
    String name;
    int marks;
    //method
    void evaluateMarks(){
        if(marks>=40){
            System.out.println(name+" has passed");
        }
        else {
            System.out.println(name+" has failed");
        }
    }

    public static void main(String[] args){
        //object creation
        Oops o = new Oops();
        o.name = "chandu";
        o.usn = 101;
        o.marks = 100;

        Oops o1 = new Oops();
        o1.name = "arun";
        o1.usn = 102;
        o1.marks= 39;
        o.evaluateMarks();
        o1.evaluateMarks();

    }

}

 */

//with constructor
/*
public class Oops {
    int usn;//instance variable because each object will have have access
    String name;
    int marks;
    static String college="snpsu";// if we declare the static here we can use it in anywhere

    Oops(int usn,String name,int marks){
        this.usn=usn;
        this.name=name;
        this.marks=marks;
    }
    //method
    void evaluateMarks(){
        if(marks>=40){
            System.out.println(name+" has passed");
        }
        else {
            System.out.println(name+" has failed");
        }
    }
    void studentDetails(){
        System.out.println("usn "+this.usn);
        System.out.println("name "+ this.name);
        System.out.println("marks "+this.marks);
        System.out.println("college "+college);
    }


    public static void main(String[] args){
        //object creation
        Oops o = new Oops(101,"chandu",100);
        Oops o1 = new Oops(102,"jeevan",39);
        o.evaluateMarks();
        o1.evaluateMarks();
        o.studentDetails();
        o1.studentDetails();
    }

}
 */

/*
 public class Oops {
     String i;

     void change(String i){
         this.i = i;
     }
     void display(){
         System.out.println("the value of i is "+i);
     }
     public static void main(String[] args){
         Oops o = new Oops();
         o.change("cse");
         o.display();
     }
}
 */


/*
public class Oops {
    int accountno;
    static int totalacc;

    Oops(){
        totalacc++;
        accountno=totalacc;
    }
    static void showTotalacc(){
        System.out.println("total :" + totalacc);
    }
    public static void main(String[] args){
        new Oops();
        new Oops();
        Oops.showTotalacc();
    }
}
 */



