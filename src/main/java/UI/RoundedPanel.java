
package UI;

import java.awt.*;
import javax.swing.JPanel;

public class RoundedPanel extends JPanel {
    private final int cornerRadius = 30;

    public RoundedPanel(int cornerRadius) {
        super();
        setOpaque(false); // Make the panel transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(getBackground());
        int width = getWidth();
        int height = getHeight();
        graphics.fillRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius); // Fill the panel with rounded rectangle
        graphics.dispose();
    }
}
