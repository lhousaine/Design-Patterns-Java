package patterns.structural.proxy.vitual;

import java.awt.*;
import java.net.URL;

public class ImageIcon implements Icon {
    ImageIcon imageIcon;
    URL imageURL;

    public ImageIcon(URL imageURL, String cd_cover) {
        this.imageURL = imageURL;
    }

    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }
}
