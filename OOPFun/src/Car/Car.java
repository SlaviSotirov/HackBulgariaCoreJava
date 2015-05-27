package Car;

public class Car {
    private String brand;
    private int milage = 0;
    
    Car(String brand){
        this.brand = brand;
    }
    
    Car(String brand, int milage){
        this.brand = brand;
        this.milage = milage;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public int getMilage(){
        return this.milage;
    }
}
