package Time;


public class TimeBuilder {
    private int seconds;
    private int minutes;
    private int hours;
    private int day;
    private int month;
    private int year;
    
    public TimeBuilder(){ }
    
    public Time buildTime(){
        return new Time(seconds, minutes, hours, day, month, year);
    }
    
    public TimeBuilder seconds(int seconds){
        this.seconds = seconds;
        return this;
    }
    public TimeBuilder minutes(int minutes){
        this.minutes = minutes;
        return this;
    }
    public TimeBuilder hours(int hours){
        this.hours = hours;
        return this;
    }
    public TimeBuilder day(int day){
        this.day = day;
        return this;
    }
    public TimeBuilder month(int month){
        this.month = month;
        return this;
    }
    public TimeBuilder year(int year){
        this.year = year;
        return this;
    }
    
    
}
