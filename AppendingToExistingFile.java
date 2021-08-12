import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendingToExistingFile {
    public static void main(String[] args) {
        try{
            File f = new File("test.txt");
            FileWriter file = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(file);
            Scanner scan = new Scanner(System.in);
            System.out.println("Write text to append");
            bw.write(scan.nextLine());
            bw.close();
            scan.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
