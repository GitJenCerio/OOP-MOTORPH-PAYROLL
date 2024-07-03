package DatabaseConnection;


import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ComboBoxUtils {

   public static void populateComboBox(JComboBox<String> comboBox, String columnName, String tableName) {
    try {
        Set<String> valuesSet = fetchUniqueValues(columnName, tableName);

        // Convert Set to List and sort alphabetically
        List<String> sortedValues = valuesSet.stream()
                                             .sorted()
                                             .collect(Collectors.toList());

        // Add the "All + Column Name" option at the beginning
        sortedValues.add(0, "All " + columnName);

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(sortedValues.toArray(new String[0]));
        comboBox.setModel(model);
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle database connection or query errors
    }
}



    private static Set<String> fetchUniqueValues(String columnName, String tableName) throws SQLException {
        Set<String> valuesSet = new HashSet<>();
        try (Connection connection = DatabaseConnector.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT DISTINCT " + columnName + " FROM " + tableName)) {

            while (resultSet.next()) {
                String value = resultSet.getString(columnName);
                valuesSet.add(value);
            }
        }
        return valuesSet;
    }
}
