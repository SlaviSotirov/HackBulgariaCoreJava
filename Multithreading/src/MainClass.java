public class MainClass {

    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread A = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 2_000_000; i++) {
                    count++;
                }
            }
        });
        
        Thread B = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 2_000_000; i++) {
                    count++;
                }
            }
        });
        
        long startTime = System.currentTimeMillis();

        A.start();
        A.join();
        B.start();
        B.join();

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
        
        System.out.println(count);
    }

}
