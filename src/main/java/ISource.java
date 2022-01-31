import java.io.FileNotFoundException;
import java.io.FileReader;

public interface ISource
{

    static FileReader ReadChar(String filename) throws FileNotFoundException {
         FileReader inputStream = new FileReader(filename);
        return inputStream;
    }

    static void main(String[] args) throws FileNotFoundException {
        String inputStream = "src/main/resources/characterinput.txt";
        FileReader is = ISource.ReadChar(inputStream);
        System.out.println(is.getEncoding());
    }
}