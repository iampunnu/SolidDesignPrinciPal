package MainFunction.Scanner;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageFile {
    public static void main(String[] args) throws IOException {
        File  output_file=new File("logo.png");
        int width = 963;

        int height = 640;
        BufferedImage image = new BufferedImage(height,width,BufferedImage.TYPE_INT_ARGB);

        ImageIO.write(image, "png", output_file);

      //  image = ImageIO.read(input_file);

    }
}
