import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VideoOperations {
    public static void main(String[] args) {
        try{
            FileInputStream fileIn = new FileInputStream(new File("btctrade.mp4"));
            FileOutputStream fileOut = new FileOutputStream(new File("btctradecopy.mp4"));
            byte[] buffer = new byte[4*1024];
            while(fileIn.available() !=0){
                fileIn.read(buffer);
                fileOut.write(buffer);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
