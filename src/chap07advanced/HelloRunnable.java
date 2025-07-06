package chap07advanced;

class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from a runnable thread!");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new HelloRunnable());
        t.start();
    }
}
