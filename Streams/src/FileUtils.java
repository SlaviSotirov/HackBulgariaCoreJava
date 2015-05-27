import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileUtils {
    
    public static String readFrom(File file){
        String content = "";
        BufferedReader br = null;
        
        try {
 
            String sCurrentLine;
 
            br = new BufferedReader(new FileReader(file));
 
            while ((sCurrentLine = br.readLine()) != null) {
                content += sCurrentLine;
                content += "\n";
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        return content;
    }
    
    public void writeTo(File file, String text){
        
    }
}
