import java.io.*;

class Copy {
    public static void main(String[] args) throws IOException {
        Copier gcc = new Copier();
        FileReader inputStream = gcc.readChar();
        System.out.println(inputStream);
        gcc.setChar(inputStream);
    }
}
