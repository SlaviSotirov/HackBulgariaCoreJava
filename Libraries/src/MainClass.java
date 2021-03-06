import java.io.*;
import java.util.*;
import java.util.logging.*;

import javax.swing.*;

import syntaxhighlight.SyntaxHighlighter;
import syntaxhighlighter.brush.*;
import syntaxhighlighter.SyntaxHighlighterParser;
import syntaxhighlighter.theme.ThemeRDark;





public class MainClass {

    public static void main(String[] args) throws IOException {
//        String imageUrl = "http://www.avajava.com/images/avajavalogo.jpg";
//        String destinationFile = "image.jpg";
//
//        SaveImage.saveImage(imageUrl, destinationFile);
        
        
        //qucik code inspector
        SwingUtilities.invokeLater(new Runnable() {

          @Override
          public void run() {
            SyntaxHighlighterParser parser = new SyntaxHighlighterParser(new BrushXml());
            parser.setHtmlScript(true);
            parser.setHTMLScriptBrushes(Arrays.asList(new BrushCss(), new BrushJScript(), new BrushPhp()));

            SyntaxHighlighter highlighter = new SyntaxHighlighter(parser, new ThemeRDark());
           
            highlighter.setHighlightedLineList(Arrays.asList(13, 27, 28, 38, 42, 43, 53));
            try {
              highlighter.setContent(new File("src/MainClass.java"));
            } catch (IOException ex) {
              Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            }

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(highlighter);
            frame.setLocationByPlatform(true);
            frame.pack();
            frame.setVisible(true);
          }
        });
      }


}
