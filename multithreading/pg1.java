class ThreadA extends Thread{
    public void run(){
        System.out.println("Square of values from 1 to 10");
        
        try{
            for (int i = 1; i<=10; i++) {
                System.out.println(i+"*"+i+" = "+(i*i));
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class ThreadB implements Runnable{
    public void run(){
        System.out.println("cube values from 1-10");
        try{
            for (int i = 1; i<=10; i++) {
                System.out.println("cube("+i+") = "+Math.pow(i,3));
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class pg1{
    public static void main(String[] args) throws InterruptedException {
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        Thread t=new Thread(b);
        a.start();
        t.start();
        a.join();
        t.join();
    }
} 