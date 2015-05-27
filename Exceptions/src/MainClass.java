
public class MainClass {

    public static void main(String[] args) throws DatabaseCorruptedException{
        
        try{
            DatabaseConnection.add(0);
        }catch(DatabaseCorruptedException e){
            System.out.println(e.getMessage());
        }
        DatabaseConnection.add(1);

    }

}
