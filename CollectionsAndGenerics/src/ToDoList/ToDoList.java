package ToDoList;
import java.util.PriorityQueue;


public class ToDoList {
    PriorityQueue<Task> tasks;
    private float availableDuration;
    private float taskDuration = 0;
    
    
    public ToDoList(float duration){
        this.availableDuration = duration;
        tasks = new PriorityQueue<Task>();
    }
    
    public void addTask(Task t){
        tasks.offer(t);
        taskDuration += t.getRequriedTime();
    } 
    public void markFinished(Task t){
        removeTask(t);
    }
    public void markCancelled(Task t){
        removeTask(t);
    }
    private void removeTask(Task t){
        tasks.remove(t);
        taskDuration -= t.getRequriedTime();
    }
    
    public Task getTop(){
        //System.out.println(tasks.peek().getPriority());
        return tasks.peek();
    }
    public boolean canFinish(){
        return availableDuration >= taskDuration;       
    }
    public float getRemainigTime(){
        return availableDuration - taskDuration;
    }
}
