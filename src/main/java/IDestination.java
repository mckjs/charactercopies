import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public interface IDestination extends ISource
{
    static void WriteChar(String inputfilename, String outputfilename) throws IOException {
        FileReader inputStream = ISource.ReadChar(inputfilename);
        FileWriter outputStream = new FileWriter(outputfilename);

        int c;
        while ((c = inputStream.read()) != '\n' ){
            outputStream.write(c);
        }
    }


    static void main(String[] args) throws IOException {
        String inputStream = "src/main/resources/characterinput.txt";
        String outputStream = "src/main/resources/characteroutput.txt";

        ISource.ReadChar(inputStream);
        IDestination.WriteChar(inputStream, outputStream);

    }
}