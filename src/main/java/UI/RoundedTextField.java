package UI;

import javax.swing.*;
import java.awt.*;

public class RoundedTextField extends JTextField {
    private int radius;
    
    // Constructor with parameters
    public RoundedTextField(int columns, int radius) {
        super(columns);
        this.radius = 30;
        setOpaque(false); // Make the text field transparent so that the rounded border is visible
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Add some padding
    }

    // No-argument constructor
    public RoundedTextField() {
        this(10, 20); // Default values for columns and radius, adjust as needed
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint background
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

        // Paint border
        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

        g2.dispose();

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Don't paint the default border
    }

    // Optional: Override getPreferredSize to ensure the component has a preferred size
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(150, 30); // Adjust size as needed
    }
}
