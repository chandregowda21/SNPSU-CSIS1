class MyThread3 extends Thread{
    public void run(){
        System.out.println(getName() + "staarted");
        Thread.yield();
        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            System.out.println(getName() + "interrupted exception");
        }
        System.out.println(getName() + "finished, state "+getState());
    }

}
public class ThreadMethods {
    public static void main(String[] args){
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        System.out.println("Before start, t1 is alive or not "+t1.isAlive());

        t1.start();
        t2.start();

        //check whether state is alive or not
        System.out.println("After start t1="+t1.getState());
        System.out.println("After start t2="+t2.getState());

        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println("Maib Thread interrupted "+e.getMessage());
        }
        System.out.println("After join t1 state ="+t1.getState());
        System.out.println("After join t2 state ="+t2.getState());
        System.out.println("Check t1 is Alive= "+t1.isAlive());
        System.out.println("Check t2 is Alive= "+t2.isAlive());
    }
}

// Thread.yield()->it only hints to thread schedular/only request
//priority basis->can only req but does not gurantee that current thread will stop or not
//Main decider->jvm and os decides which thread gets paused