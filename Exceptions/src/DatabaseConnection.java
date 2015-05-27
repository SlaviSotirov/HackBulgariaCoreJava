
public class DatabaseConnection{
    

    public static void add(int a){
        if(a == 0){
            throw new DatabaseCorruptedException("Cannot add 0");
        }else if(a == 1){
            throw new DatabaseCorruptedException("Wadafak???");
        }
    }
}
