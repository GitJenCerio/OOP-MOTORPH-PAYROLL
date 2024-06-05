package UI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ButtonMouseAdapter extends MouseAdapter {

    private final Color clickColor = new Color(45, 51, 241);
    private final Color originalColor = new Color(107, 151, 177); 
    private static JButton prevClickedButton;

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }


    @Override
    public void mouseExited(MouseEvent e) {
        JButton button = (JButton) e.getSource();
        if (!button.getBackground().equals(clickColor)) {
            button.setBackground(originalColor);
        }
    }

   
    @Override
   public void mouseClicked(MouseEvent e) {
        JButton button = (JButton) e.getSource();
        if (prevClickedButton != null && prevClickedButton != button) {
            prevClickedButton.setBackground(originalColor);
           
        }
        button.setBackground(clickColor);
        
        prevClickedButton = button;
    }

}
