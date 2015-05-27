import java.util.ArrayList;

import ToDoList.Task;
import ToDoList.ToDoList;



public class MainClass {

    public static void main(String[] args) {
        //1
//        System.out.println(BracketsProblem.CheckBrackets("((()))"));
//        System.out.println(BracketsProblem.CheckBrackets("(()())"));
//        System.out.println(BracketsProblem.CheckBrackets("(()))"));
//        System.out.println(BracketsProblem.CheckBrackets("())(()"));
//        System.out.println(BracketsProblem.CheckBrackets("(()(()))()()"));
//        
        //2
//        ArrayList<Integer> collection = new ArrayList<Integer>();
//        for(int i = 9; i > 0; i--){
//            collection.add(i);
//        }
//        
//        ReverseCollectionProblem.reverse(collection);
        //3
//        WtfList<Integer> wtf = new WtfList<Integer>();
//        wtf.add(1);
//        wtf.add(2);
//        wtf.add(10);
//        wtf.add(111);
//        
//        wtf.printList();
//        //System.out.println(wtf.size());
//        wtf.add(2);
//        wtf.printList();
        //4
//        BoundedQueue boundedQueue = new BoundedQueue(3);
//        boundedQueue.offer(1);
//        boundedQueue.offer(2);
//        boundedQueue.offer(3);
//        boundedQueue.offer(4);
//        boundedQueue.offer(5);
//        boundedQueue.printQueue();
        
        //5
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        
//        for(int element: list){
//            System.out.println(element);
//        }
//        RotateCollectionProblem.rotate(list, 2);
//        System.out.println("asdasd");
//        for(int element: list){
//            System.out.println(element);
//        }
//        RotateCollectionProblem.rotate(list, 5);
//        System.out.println("qweqweqweq");
//        for(int element: list){
//            System.out.println(element);
//        }
        //9 TO DO LIST

        ToDoList todo = new ToDoList(11);
        
        todo.addTask(new Task()); 
        todo.addTask(new Task(1.5f));  
        todo.addTask(new Task(5)); 
        todo.addTask(new Task(9));
        todo.addTask(new Task(1));
        todo.addTask(new Task(10)); 

        if (todo.canFinish()){
            System.out.println("Woohoo!");
        } else {
            System.out.println("I am ...screwed :(");
        }

        System.out.println(todo.getTop()); 
        System.out.println(todo.getRemainigTime()); 
        
    }
    
    

}

