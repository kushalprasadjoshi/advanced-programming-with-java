package chap01basics;

public class AccessDemo {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3; // default access
    private int privateVar = 4;

    public void show() {
        System.out.println(publicVar);      // Accessible
        System.out.println(protectedVar);   // Accessible
        System.out.println(defaultVar);     // Accessible
        System.out.println(privateVar);     // Accessible
    }
}
