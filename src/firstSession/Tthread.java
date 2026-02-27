package firstSession;

class BufferTask implements Runnable{
    private  StringBuffer sb;
    public BufferTask(StringBuffer sb){
        this.sb = sb;
    }
    public void run(){
        for(int i=0;i<2000;i++){
            sb.append("a");
        }
    }
}

public class Tthread {
    public static void main(String[] args) throws InterruptedException{
        StringBuffer sb = new StringBuffer("start");
        Thread t1 = new Thread(new BufferTask(sb));
        Thread t2 = new Thread(new BufferTask(sb));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }


}
