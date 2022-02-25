import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WordFinder {
   public static void main(String args[]) throws IOException {
      // Initializing the URL class
      URL url = new URL(args[0]);

      // Reading the html page
      Scanner read = new Scanner(url.openStream());

      // Passing the content to a buffer
      StringBuffer buffer = new StringBuffer();
      while(read.hasNext()) {
         buffer.append(read.next());
      }

      // Transforming all to string
      String result = buffer.toString();

      //  Checking for the specific words: "senha", "black friday", "promoção" in the content
      if (result.indexOf("senha") != -1 || result.indexOf("blackfriday") != -1 || result.indexOf("promoção") != -1){
         System.out.println("suspicious");
      }
      else {
         System.out.println("safe");
      }
   }
}
