package BlockingQueue;


public class Producer extends Thread {
    BlockingQueue queue;
    public final int MAX_SIZE = 5;

    Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void add(int value) {
        queue.add(value);
    }

    @Override
    public void run() {
        
        int i = 0;
        while(true){
            try {
                sleep(1);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            synchronized(queue){
                while(queue.size() == MAX_SIZE){
                    try {
                        System.out.println("Producer waiting....");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.add(i);
                System.out.println("i = " + i);
                queue.notifyAll();
            }
            i++;
            if(i == 1000){
                break;
            }
        }
    
    }
    
}
