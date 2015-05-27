import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;



public class MainClass {

    public static void main(String[] args) throws ClientProtocolException, IOException {
        List<String> asd = new ArrayList<String>();
        String content = Crawler.getContent("http://ebusiness.free.bg");
        asd.addAll(Crawler.getAllLinks(content));
        for (String s: asd){
            System.out.println(s);
        }
        System.out.println(asd);
    }

}
