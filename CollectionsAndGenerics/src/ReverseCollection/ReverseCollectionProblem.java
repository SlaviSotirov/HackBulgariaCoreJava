package ReverseCollection;
import java.util.Collection;
import java.util.Stack;


public class ReverseCollectionProblem {
    static <T> void reverse (Collection<T> collection){
        Stack<T> stack = new Stack<T>();
        
        for(T element: collection){
            stack.push(element);
            System.out.println(element);
        }

        collection.clear();
        int size = stack.size();
        for(int i = size; i > 0; i--){
            collection.add(stack.pop());
        }
        
        for(T element: collection){
            //stack.push(element);
            System.out.println(element);
        }
        
    }
}
