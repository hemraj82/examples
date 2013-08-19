import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.io.*;
import java.awt.*;
import java.util.*;
public class CaptchaGenerator {
 public String get(OutputStream outputStream)throws IOException 
   { 
	Font font=new Font("Verdana", Font.CENTER_BASELINE , 26); 
	BufferedImage image = new BufferedImage(250, 50, BufferedImage.TYPE_INT_RGB); 
	Graphics2D graphics2D = image.createGraphics();
	Random r = new Random();
    String token = Long.toString(Math.abs(r.nextLong()), 36);
    String ch = token.substring(0,6);
    Color c = new Color(0.6662f, 0.4569f, 0.3232f);
    GradientPaint gp = new GradientPaint(30, 30, c, 15, 25, Color.white, true);
    graphics2D.setPaint(gp);
    graphics2D.setFont(font);
    graphics2D.drawString(ch,2,20);
    graphics2D.dispose();
    ImageIO.write(image, "jpeg", outputStream);
    outputStream.close();
    return ch;
 }
}