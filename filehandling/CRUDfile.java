package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CRUDfile {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- File Handling Menu ---");
            System.out.println("1. Create File");
            System.out.println("2. Read File");
            System.out.println("3. Update File (Append)");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();  
            
            switch (choice) {
                case 1:
                    createFile();
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    updateFile();
                    break;
                case 4:
                    deleteFile();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter 1-5");
            }
        }
    }

    private static void createFile() {
        System.out.print("\nEnter filename to create: ");
        String filename = sc.nextLine();
        
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
                
                System.out.print("Add initial content? (y/n): ");
                if (sc.nextLine().equalsIgnoreCase("y")) {
                    writeContent(filename, false);
                }
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    private static void readFile() {
        System.out.print("\nEnter filename to read: ");
        String filename = sc.nextLine();
        
        try (Scanner fileReader = new Scanner(new File(filename))) {
            System.out.println("\n--- File Content ---");
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void updateFile() {
        System.out.print("\nEnter filename to update: ");
        String filename = sc.nextLine();
        
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File doesn't exist!");
            return;
        }
        
        writeContent(filename, true);
    }

    private static void writeContent(String filename, boolean append) {
        try (FileWriter writer = new FileWriter(filename, append)) {
            System.out.println("Enter content (type 'END' on new line to finish):");
            StringBuilder content = new StringBuilder();
            
            String line;
            while (!(line = sc.nextLine()).equalsIgnoreCase("END")) {
                content.append(line).append("\n");
            }
            
            writer.write(content.toString());
            System.out.println("Content " + (append ? "appended" : "written") + " successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void deleteFile() {
        System.out.print("\nEnter filename to delete: ");
        String filename = sc.nextLine();
        
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("File doesn't exist or delete failed");
        }
    }
}