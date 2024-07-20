
package components;

import DatabaseConnection.CSVUploader;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class CSVFileChooser {

    private JTextField filePathTextField;
    private ActionListener fileSelectedListener;

    public CSVFileChooser(JTextField filePathTextField, ActionListener fileSelectedListener) {
        this.filePathTextField = filePathTextField;
        this.fileSelectedListener = fileSelectedListener;

    }
    public void showFileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        // Set filter to allow only CSV files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String selectedFilePath = selectedFile.getAbsolutePath();
            filePathTextField.setText(selectedFilePath);

            // Notify listener with the selected file path
            if (fileSelectedListener != null) {
                fileSelectedListener.actionPerformed(new java.awt.event.ActionEvent(this, java.awt.event.ActionEvent.ACTION_PERFORMED, selectedFilePath));
            }
        }
    }
}
