import javax.swing.text.TabSet;

class GC extends Exception{
    GC(String message) {
        super(message);
    }
}
public class Library {
    static void checkAttendance(boolean absent)throws GC{
        if(absent){
            throw new GC("penalty to submit 3 books");
        }
        else{
            System.out.println("present in class: no penalty");
        }
    }
    public static void main(String[] args){
        try{
            checkAttendance(true);
        }
        catch (GC e){
            System.out.println("caught Exception: "+e.getMessage());
        }
        finally {
            System.out.println("welcome to snpsu");
        }

    }
}
