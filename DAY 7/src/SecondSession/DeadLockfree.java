package SecondSession;

//Synchronization only allow 1 thread at a time

class a1{}
class b1{}
public class DeadLockfree {
    static a1 obja = new a1();
    static b1 objb=new b1();
    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            synchronized (obja){
                synchronized (objb){
                    System.out.println("Thread 1 is finished its excecution safely");
                }
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (objb){
                synchronized (obja){
                    System.out.println("Thread 2 is finished its excecution safely");
                }
            }
        });
        t1.start();
        t2.start();
    }

}
