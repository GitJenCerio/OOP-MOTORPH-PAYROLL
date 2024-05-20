
package UI;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelSwitcher {
    public static void showPanel(JPanel panelToShow, String headerText, JLabel headerLabel, JPanel... panels) {
        for (JPanel panel : panels) {
            panel.setVisible(false);
        }
        panelToShow.setVisible(true);
        headerLabel.setText(headerText);
    }
}
