import java.io.FileReader;
import java.io.IOException;

interface ISource {
    public FileReader readChar();

    void setChar(FileReader inputStream) throws IOException;
}
