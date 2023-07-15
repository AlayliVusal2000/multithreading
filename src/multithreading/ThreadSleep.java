package multithreading;

public class ThreadSleep implements Runnable {

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadSleep());
        t.start();

        Thread t2 = new Thread(new ThreadSleep());
        t2.start();
    }

    Thread t;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}