package BlockingQueue;

public class BlockingQueue{
    private Node head;
    private Node current;
    public int size;
    
    BlockingQueue(int value){
        this.head = new Node(value);
        this.head.next = null;
        this.current = this.head;
        size = 1;
    }
    
    BlockingQueue(){
        this.head = null;
        size = 0;
    }
    
    public void add(int value){
        if(head != null){
            Node temp = new Node(value);
            current.next = temp; 
            current = temp;
            size++;
            
        } else {
            this.head = new Node(value);
            current = head;
            size++;
        }
    }
    
    public int poll(){
        int result = head.data;
        head = head.next;
        size--;
        return result;
    }
    
    public int size(){
        return size;
    }
    
    public void printAll(){
        Node iterator = this.head;
        while(iterator != null){
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }
}
