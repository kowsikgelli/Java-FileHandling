import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageOperations {
    public static void main(String args[]){
        BufferedImage image = null;
        File f = null;
        try{
            f = new File("cat.jpg");
            image = ImageIO.read(f);
            System.out.println("Reading complete.");
            System.out.println(image);
            ImageIO.write(image,"png",new File("cat.png"));
        }catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
}
