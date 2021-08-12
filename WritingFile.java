import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingFile {
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("test.txt");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter num of lines to add");
            int n = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter "+n+" lines");
            for(int i=0;i<n;i++){
                file.write(scan.nextLine()+"\n");
            }
            file.close();
            System.out.println("Data is written to the file :)");
        }catch(IOException e) {
            System.out.println(e);
        }
    }
}
