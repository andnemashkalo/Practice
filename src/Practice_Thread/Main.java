package Practice_Thread;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
/*        System.out.println("ID: "+Thread.currentThread().getId());
        System.out.println("Name: "+Thread.currentThread().getName());
        System.out.println("State: "+Thread.currentThread().getState());
        System.out.println("Priority: "+Thread.currentThread().getPriority());
        System.out.println("Group: "+Thread.currentThread().getThreadGroup());
        new MyThread().start();*/
new Thread(new MyThread2()).start();
        Thread.sleep(5000);
new Thread(() -> {
    out.println("ID: "+Thread.currentThread().getId());
    out.println("Name: "+Thread.currentThread().getName());
    out.println("State: "+Thread.currentThread().getState());
    out.println("Priority: "+Thread.currentThread().getPriority());
}).start();
    }
}
