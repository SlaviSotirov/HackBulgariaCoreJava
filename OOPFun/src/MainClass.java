import Pair.Pair;
import Time.Time;
import Time.TimeBuilder;


public class MainClass {

    public static void main(String[] args) {
//        Car audi = new Car("Audi", 100);
//        Car bentley = new Car("Bentley");
//        
//        System.out.println("brand: " + audi.GetBrand() + " milage: " + audi.GetMilage());
//        System.out.println("brand: " + bentley.GetBrand());
//        
        Time time = new TimeBuilder().hours(4).minutes(20).seconds(30).day(6).month(10).year(1994).buildTime();
        Time time2 = new TimeBuilder().hours(13).minutes(50).seconds(50).day(22).month(12).year(1985).buildTime();
        Pair<Time> pair = new Pair<Time>(time, time2);
        System.out.println(pair);
    }

}
