class Reader implements Runnable{
    static final Object lock=pg2.lock;
    public void run(){
        synchronized(lock){
            try{
                lock.wait();
                System.out.println("Read A");
                Thread.sleep(500);
                System.out.println("Read B");
                Thread.sleep(500);
            }catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}

class Writer implements Runnable{
    static final Object lock=pg2.lock;
    public void run(){
        synchronized(lock){
        try{
            System.out.println("Write A");
            Thread.sleep(500);
            System.out.println("Write B");
            Thread.sleep(500);
            lock.notifyAll();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    } 
}

public class pg2 {
    static final Object lock=new Object();
    public static void main(String[] args) {
        Reader r=new Reader();
        Writer w=new Writer();
        Thread wt=new Thread(w);
        Thread rt=new Thread(r);
        wt.start();
        rt.start();
    }
}
