package apps;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

public class Utilidades implements Border {

    public BufferedImage back;

    public Utilidades() {
        try {
            URL imagePath = new URL(getClass().getResource("/img/draw_principal.jpg").toString());
            back = ImageIO.read(imagePath);
        } catch (Exception ex) {
            System.out.println("El error es " + ex.getMessage());
        }

    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back, (x + (width - back.getWidth()) / 2), (y + (height - back.getHeight()) / 2), null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

}
