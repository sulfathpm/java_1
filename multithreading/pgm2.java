class Reader implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Read A");
            Thread.sleep(500);
            System.out.println("Read B");
            Thread.sleep(500);
            System.out.println("Read C");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Writer implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Write A");
            Thread.sleep(500);
            System.out.println("Write B");
            Thread.sleep(500);
            System.out.println("Write C");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class pgm2 {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Writer writer = new Writer();

        Thread readerThread = new Thread(reader);
        Thread writerThread = new Thread(writer);

        // Both start nearly at the same time
        writerThread.start();
        readerThread.start();
    }
}