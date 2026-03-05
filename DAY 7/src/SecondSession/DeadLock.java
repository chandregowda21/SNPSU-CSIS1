package SecondSession;
class A{}
class B{}

public class DeadLock {
    static A a=new A();
    static B b=new B();
    public static void main(String[] args){
        Thread t1=new Thread(()->{

            synchronized(a){
                System.out.println("Thread 1 acquired lock on a");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException _){}
                System.out.println("Thread 1 waiting for Obj B: ");
                synchronized(b){
                    System.out.println("Thread 1 acquired lock on b");
                }

            }
        });
        Thread t2=new Thread(()->{
            synchronized(b){
                System.out.println("Thread 2 acquired lock on b");
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
            System.out.println("Thread 2 waiting for Obj A: ");
            synchronized(a){
                System.out.println("Thread 2 acquired lock on a");

            }
        });
        t1.start();
        t2.start();
    }
}