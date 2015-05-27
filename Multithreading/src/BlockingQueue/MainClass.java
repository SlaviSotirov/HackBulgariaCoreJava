package BlockingQueue;

public class MainClass {

    public static void main(String[] args) {
        BlockingQueue asd = new BlockingQueue();
        Consumer consumer = new Consumer(asd);
        Producer producer = new Producer(asd);
//        producer.add(1);
//        producer.add(2);
//        producer.add(7);
//        producer.add(6);
//        producer.add(17);
//        consumer.poll();
//        consumer.poll();
//        consumer.poll();
//        consumer.poll();
//        consumer.poll();
        Thread P = new Thread(producer);
        Thread C = new Thread(consumer);
        C.start();
        P.start();
//        asd.printAll();
    }

}
