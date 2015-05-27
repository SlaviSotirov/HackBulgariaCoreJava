package ThreadRace;

import java.util.concurrent.atomic.AtomicInteger;

public class MainClass {

    public static AtomicInteger counter = new AtomicInteger();
    public static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    for (int i = 0; i < 2_000_000; i++) {
                        counter.incrementAndGet();
                    }
                }
            }
        });

        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    for (int i = 0; i < 2_000_000; i++) {
                        counter.incrementAndGet();
                    }
                }
            }
        });

        long startTime = System.currentTimeMillis();

        A.start();
        B.start();
        A.join();
        B.join();

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);

        System.out.println(counter);
    }

}
