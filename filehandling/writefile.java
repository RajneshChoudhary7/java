package filehandling;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class writefile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("rajnesh.txt");
            writer.write("Hello this is a text message written by rajnesh this is a first message for wirte file ");
            writer.close();
            System.out.println("file writing is complete ");
        }catch( IOException e){
            System.out.println("an error occurred");
            e.printStackTrace();
        }
    }
    
}
