import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Copier implements ISource, IDestination {
    public FileReader readChar() {
        FileReader inputStream = null;
        try {
            inputStream = new FileReader("src/main/resources/characterinput.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return inputStream;
    }

    public void setChar() throws IOException {

    }

    @Override
    public void setChar(FileReader inputStream) throws IOException {
        FileWriter outputStream = null;
        try {
            outputStream = new FileWriter("src/main/resources/characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != '\n') {
                outputStream.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
