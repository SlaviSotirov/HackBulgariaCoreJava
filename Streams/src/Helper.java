import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Helper {
    
    public static List<String> stringToList(String s){
        List<String> items = Arrays.asList(s.split("\\s*=\\s*"));
        return items;
    }
    
//    public static Map<String, String> toMap(List<String> list){
//        Map<String,String> map = new HashMap<String,String>();
//        for (String i : list) 
//            map.put(i.getKey(),i);
//    }
}
