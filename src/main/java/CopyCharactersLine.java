import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class CopyCharactersLine {
     public static void main(String[] args) throws IOException {
         String line;
         int readedValue;
         String s = "hello James!\n\rHow are you today!";
         StringReader input = new StringReader(s);
         BufferedReader lineReader= new BufferedReader (input);

         while((line=lineReader.readLine())!=null) {
             StringReader input2 = new StringReader(line);
             BufferedReader charReader= new BufferedReader (input2);
             while((readedValue = charReader.read()) != -1) {
                 char ch = (char) readedValue;
                 System.out.print(ch);
             }
         }
    }
}
