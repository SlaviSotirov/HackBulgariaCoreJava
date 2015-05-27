package ToDoList;

public class Task implements Comparable<Task>{
    private int priority;
    private String info; //??????
    private float requriedTime;
    private static final int DEFAULT_PRIORITY = 2;
    private static final float DEFAULT_TIME = 1;
    
    
    public Task(int priority){
        if(priority <= 10 && priority >= 1){
            this.priority = priority;
        } else {
            this.priority = 10;
        }
        this.requriedTime = DEFAULT_TIME;
    }
    
    public Task(float requiredTime){
        this.requriedTime = requiredTime;
        this.priority = DEFAULT_PRIORITY;
    }
    
    public Task(int priority, float requiredTime){
        this.requriedTime = requiredTime;
        this.priority = priority;
    }
    
    public Task(){
        this.priority = DEFAULT_PRIORITY;
        this.requriedTime = DEFAULT_TIME;
    }
    
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public float getRequriedTime() {
        return requriedTime;
    }

    public void setRequriedTime(float requriedTime) {
        this.requriedTime = requriedTime;
    }

    @Override
    public int compareTo(Task other) {
        return other.priority - this.priority; 
    }
    
}
