import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copier implements IDestination{
        String inputStream = "src/main/resources/characterinput.txt";
        String outputStream = "src/main/resources/characteroutput.txt";


    public Copier(ISource source, IDestination destination) throws IOException {

    }
    public void Copy() {}


}