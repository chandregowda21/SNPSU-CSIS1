class MyThread extends Thread{
    public void run(){
        try {
            System.out.println("Thread running");
            Thread.sleep(3000);
            System.out.println("Awake");
        }
        catch (Exception e){
        }
    }
}
public class MultiThreading {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();
        //System.out.println("state:"t1.getState());
    }

}
