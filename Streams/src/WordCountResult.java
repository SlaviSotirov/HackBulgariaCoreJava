

public class WordCountResult {
    private int wordsCount;
    private int linesCount;
    private int charsCount;
    
    WordCountResult(int words, int lines, int chars){
        wordsCount = words;
        linesCount = lines;
        charsCount = chars;
    }
    
    public int getLinesCount() {
        return linesCount;
    }
    public void setLinesCount(int linesCount) {
        this.linesCount = linesCount;
    }
    public int getCharsCount() {
        return charsCount;
    }
    public void setCharsCount(int charsCount) {
        this.charsCount = charsCount;
    }
    public int getWordsCount() {
        return wordsCount;
    }
    public void setWordsCount(int wordsCount) {
        this.wordsCount = wordsCount;
    }

    @Override
    public String toString() {
        return "wordsCount = " + wordsCount + "\nlinesCount = " + linesCount + "\ncharsCount = "
                + charsCount;
    }
    
    
    
}
