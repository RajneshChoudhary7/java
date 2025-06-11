package filehandling;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class firstfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter file name :");
        String filename = sc.nextLine();
        try {
            File file = new File(filename);
            if(file.createNewFile()){
                System.out.println("file created : "+ file.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
