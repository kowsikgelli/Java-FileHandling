import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
