import java.io.File;
import java.util.List;


public class MainClass {

    public static void main(String[] args) {
//        File readFile = new File("asd.txt");
//        System.out.println(FileUtils.readFrom(readFile));
//        
//        List<String> list = Helper.stringToList(FileUtils.readFrom(readFile));
//        for(String s: list){
//            System.out.println(s);
//        }
        
        System.out.println(WordCount.wordCount(new File("asd.txt")));

    }

}
