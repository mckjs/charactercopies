import java.io.*;

class Copy {
    public static void main(String[] args) throws IOException {
        Copier gcc = new Copier();
        FileReader inputStream = gcc.readChar();
        gcc.setChar(inputStream);
    }
}
