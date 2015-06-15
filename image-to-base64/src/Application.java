import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by sameer.ismail on 6/10/2015.
 */
public class Application {
    public static void main(String[] args){
        if(!args[0].isEmpty()){
            BufferedImage img = null;

            try {
                img = ImageIO.read(new File(args[0].replace("\"", "")));
            } catch (IOException e) {
                System.out.println(args[0]);
                e.printStackTrace();
            }

            //C:\Users\sameer.ismail\Desktop\JensenIT (new)\images\services\129.gif
            //C:\Users\sameer.ismail\Desktop\JensenIT (new)\images\services\Laptop_1_Videvo.gif
            //C:\Users\sameer.ismail\Desktop\JensenIT (new)\images\services\a20.gif
            System.out.println(Base64.encodeToString(img, "gif"));
        }
    }
}
