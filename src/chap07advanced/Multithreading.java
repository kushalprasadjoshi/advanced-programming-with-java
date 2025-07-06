package chap07advanced;

public class Multithreading implements Runnable {
    Thread t;

    Multithreading() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Multithreading obj = new Multithreading();
        Multithreading obj1 = new Multithreading();
    }
}