package filehandling;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class readfile {
    public static void main(String[] args) {
        try{
            File file = new File("rajnesh.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        
    }
}
