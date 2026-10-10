
class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(1000);
            System.out.println("Thread finished sleeping.");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


public class ThreadLifeCycle {
    public static void main(String[] args)
            throws InterruptedException {

        MyThread t = new MyThread();

        System.out.println("State: " + t.getState());

        t.start();

        System.out.println("State after start: " + t.getState());

        t.join();

        System.out.println("Final state: " + t.getState());
    }
}
