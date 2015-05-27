package BlockingQueue;

public class Consumer extends Thread{
    BlockingQueue queue;
    
    Consumer(BlockingQueue queue){
        this.queue = queue;
    }
    
    public int poll(){
        return queue.poll();
    }
    
    @Override
    public void run() {
        synchronized(queue){
            while(true){
                try {
                    sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                while(queue.size() == 0){
                    try {
                        System.out.println("Consumer waiting...");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(queue.poll());
                queue.notifyAll();
            }
        }
    }
    
}
