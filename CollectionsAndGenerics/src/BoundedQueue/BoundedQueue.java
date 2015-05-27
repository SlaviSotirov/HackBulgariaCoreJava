package BoundedQueue;

public class BoundedQueue <E>{
    private int limit;
    private Object elements[];
    private int size = 0;
    
    BoundedQueue(int limit){
        this.limit = limit;
        elements = new Object[this.limit];
    }
    
    public void offer(E element){
        if(size == limit){
            for(int i = 0; i < size - 1; i++){
                elements[i] = elements[i+1];
            }
            size--;
        }
        elements[size++] = element;
    }
    
    public void printQueue(){
        for(int i = 0; i < size; i++){
            System.out.println(elements[i]);
        }
    }
    
    
    
}
