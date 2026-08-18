class D1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hii");
        }
    }
}

class D2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        D1 obj = new D1();
        D2 obj1 = new D2();

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj.start();   // Starts thread D1
        obj1.start();  // Starts thread D2
    }
}