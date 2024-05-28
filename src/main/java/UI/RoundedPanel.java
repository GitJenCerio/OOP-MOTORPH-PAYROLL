package UI;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RoundedPanel extends JPanel {
    private Color defaultColor = new Color(4, 14, 163);
    private Color backgroundColor = new Color(4, 14, 163);
    private final int cornerRadius = 50;
    private final Color hoverColor = new Color(214, 224, 233  );
    private Color clickedColor = new Color(107, 151, 177);
    private boolean isHovered = false;
    private boolean isClicked = false;
    private static RoundedPanel prevClickedButton = null;
    private JPanel targetPanel;
    private String headerText;

    public RoundedPanel(Color color) {
        super();
        backgroundColor = color;
        setOpaque(false);
        initializeMouseListener();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(isClicked ? clickedColor : isHovered ? hoverColor : defaultColor);
        int width = getWidth();
        int height = getHeight();
        graphics.fillRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);
        graphics.dispose();
    }

    public void setTargetPanel(JPanel panel, String headerText) {
        this.targetPanel = panel;
        this.headerText = headerText;
    }

    public void simulateClick() {
        if (prevClickedButton != null && prevClickedButton != this) {
            prevClickedButton.isClicked = false;
            prevClickedButton.repaint();
        }
        isClicked = true;
        prevClickedButton = this;
        repaint();

        if (targetPanel != null) {
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (parentFrame instanceof UI_AuthorizedUserDashboard) {
                ((UI_AuthorizedUserDashboard) parentFrame).showPanel(targetPanel, headerText);
            } else if (parentFrame instanceof UI_EmployeeDashboard) {
                ((UI_EmployeeDashboard) parentFrame).showPanel(targetPanel, headerText);
            }
        }
    }

    private void initializeMouseListener() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                isHovered = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isHovered = false;
                repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (prevClickedButton != null && prevClickedButton != RoundedPanel.this) {
                    prevClickedButton.isClicked = false;
                    prevClickedButton.repaint();
                }
                isClicked = true;
                prevClickedButton = RoundedPanel.this;
                repaint();

                if (targetPanel != null) {
                    JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(RoundedPanel.this);
                    if (parentFrame instanceof UI_AuthorizedUserDashboard) {
                        ((UI_AuthorizedUserDashboard) parentFrame).showPanel(targetPanel, headerText);
                    } else if (parentFrame instanceof UI_EmployeeDashboard) {
                        ((UI_EmployeeDashboard) parentFrame).showPanel(targetPanel, headerText);
                    }
                }
            }
        });
    }


}


