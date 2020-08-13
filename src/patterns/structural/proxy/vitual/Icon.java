package patterns.structural.proxy.vitual;

import java.awt.*;

public interface Icon {
    void paintIcon(Component c, Graphics g, int x, int y);

    public int getIconWidth();

    public int getIconHeight();
}
