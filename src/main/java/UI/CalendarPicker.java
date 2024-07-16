package UI;

import com.toedter.calendar.JCalendar;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarPicker extends JPanel {

    private RoundedTextField textField;
    private JDialog dialog;
    private JCalendar calendar;

    public CalendarPicker() {
        setLayout(new BorderLayout());

        textField = new RoundedTextField();
        textField.setEditable(false); // Make the text field non-editable
        textField.setBackground(Color.WHITE); // Set background color to white

        // Overlay panel for calendar icon
        JPanel overlayPanel = new JPanel(new BorderLayout());
        overlayPanel.setOpaque(false);

        // Calendar icon setup
        Icon calendarIcon = new ImageIcon(getClass().getResource("/resources/icon-calendar.png")); // Ensure the icon path is correct
        JLabel calendarLabel = new JLabel(calendarIcon);
        calendarLabel.setBorder(new EmptyBorder(0, 0, 0, 5)); // Adjust padding as needed

        overlayPanel.add(calendarLabel, BorderLayout.EAST);

        // Layered pane to overlay calendar icon on text field
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(new OverlayLayout(layeredPane));

        layeredPane.add(textField, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(overlayPanel, JLayeredPane.PALETTE_LAYER);

        add(layeredPane, BorderLayout.CENTER);

        // Set up the calendar in a dialog
        calendar = new JCalendar();
        calendar.setWeekOfYearVisible(false);
        dialog = new JDialog((Frame) null, "Select Date", true);
        dialog.setUndecorated(true);
        dialog.add(calendar);
        dialog.pack();
        dialog.setSize(new Dimension(300, 300));

        // Listener to show the calendar dialog when text field or calendar icon is clicked
        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showCalendarDialog();
            }
        });

        calendarLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showCalendarDialog();
            }
        });

        // Listener to update text field with selected date from calendar
        calendar.getDayChooser().addPropertyChangeListener("day", evt -> {
            if ("day".equals(evt.getPropertyName())) {
                Date selectedDate = calendar.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                textField.setText(sdf.format(selectedDate));
                dialog.setVisible(false);
            }
        });

        // Listener to keep the dialog open when month or year is changed
        calendar.getMonthChooser().addPropertyChangeListener("month", evt -> {
            if ("month".equals(evt.getPropertyName())) {
                calendar.repaint();
            }
        });

        calendar.getYearChooser().addPropertyChangeListener("year", evt -> {
            if ("year".equals(evt.getPropertyName())) {
                calendar.repaint();
            }
        });
    }

    private void showCalendarDialog() {
        Point location = textField.getLocationOnScreen();
        dialog.setLocation(location.x, location.y + textField.getHeight());
        dialog.setVisible(true);
    }

    // Getter for selected date
    public String getSelectedDate() {
        return textField.getText();
    }

    // Setter for selected date
    public void setSelectedDate(String date) {
        textField.setText(date);
    }
}