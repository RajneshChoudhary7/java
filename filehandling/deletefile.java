package filehandling;
import java.io.IOException;
import java.io.File;
public class deletefile {
    public static void main(String[] args) {
        File file = new File("rajnesh.txt");
        file.delete();
        System.out.println("file was deleted");
    }
    
}
