
import java.io.File;
import java.util.Arrays;
import java.util.List;


public class WordCount {
    //private WordCountResult wcr;
    
    
    public static WordCountResult wordCount(File file){
        int wordsCount = 0;
        int linesCount = 0;
        int charsCount = 0;
    
        String content = FileUtils.readFrom(file);
        String[] lines = content.split("\n");
        linesCount = lines.length;
        for(String line: lines){
            charsCount += line.length();
            String[] items = line.split("\\s+");
            wordsCount += items.length;
        }
        charsCount += linesCount;
      
        return new WordCountResult(wordsCount, linesCount, charsCount);
    }
}
