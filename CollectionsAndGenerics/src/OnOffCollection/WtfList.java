package OnOffCollection;
import java.util.Arrays;


public class WtfList<E> {
    private int size;
    private Object elements[];
    private int capacity = 5;
    
    WtfList(){
        elements = new Object[capacity];
    }
    
    public int size(){
        return this.size;
    }
    
    public void add(E element){
        if(element != null){
            if(contains(element)){
                remove(element);
                return;
            }
            if(size == elements.length){
                resize();
            }
            elements[size++] = element;
        }
    }
    
    private void resize(){
        capacity = capacity * 2;
        elements = Arrays.copyOf(elements, capacity);
    }
    
    public boolean contains(E element){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(element)){
                return true;
            }
        }
        return false;
    }
    
    public void printList(){
        for(int i = 0; i < size; i++){
            System.out.println(elements[i]);
        }
    }
    
    public void remove(E element){
        boolean toFix = false;
        if(contains(element)){
            for(int i = 0; i < size - 1; i++){
                if(elements[i].equals(element)){
                    toFix = true;
                }
                if(toFix){
                    elements[i] = elements[i+1];
                }
                
            }
            elements[size] = null;
            size--;
        }
    }
    
}
