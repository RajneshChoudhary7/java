package finalpractices;
import java.io.*;
public class que7 {
    public static void main(String[] args) {
    int max = Integer.MIN_VALUE;
    boolean hasNumbers = false;
    
    try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            try {
                int num = Integer.parseInt(line.trim());
                if(num > max) max = num;
                hasNumbers = true;
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid value: " + line);
            }
        }
    } catch (IOException e) {
        System.err.println("Error reading file: " + e.getMessage());
        return;
    }
    
    if(hasNumbers) {
        System.out.println("max = " + max);
    } else {
        System.out.println("No valid numbers found");
    }
}
    
}
