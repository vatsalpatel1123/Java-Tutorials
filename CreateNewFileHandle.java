import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFileHandle {
    public static void main(String[] args) {

        File myFile = new File("file1.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}