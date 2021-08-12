import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            if (file.createNewFile()) {
                System.out.println("File "+file.getName()+" is created :)");
            }else{
                System.out.println("File already exists or memory is full");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
