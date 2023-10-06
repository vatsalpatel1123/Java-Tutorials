import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFileHandli {
    public static void main(String[] args) {

        File myFile = new File("file1.txt");
        try {
            FileWriter fileWriter = new FileWriter("CWH_file1.txt");
            fileWriter.write("Hello World!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
