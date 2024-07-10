package UI;

import DatabaseConnection.DatabaseUserDAO;
import DatabaseConnection.DatabaseUserDAO.DatabaseException;
import DatabaseConnection.DatabaseUtility;
import entities.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class UpdateUserFrame extends javax.swing.JFrame {

    private CustomTable usersTable;
    private int selectedUserId; // Changed from selectedUserId to avoid confusion with method parameter
    private User currentUser;

    public UpdateUserFrame(CustomTable usersTable, int userId) throws DatabaseException {
        this.usersTable = usersTable;
        this.selectedUserId = userId;

        initComponents();
        loadDropdownItems();
        loadUserDetails(userId);
        setupConfirmButtonAction();
    }
    
    // Initialize components, set layouts, etc.
    // Assuming auto-generated code or custom initialization

    private void loadDropdownItems() {
        String[] dropdownItems = DatabaseUtility.fetchDropdownItems("roles", "RoleType");
        customDropdown.setItems(dropdownItems);
    }

    public void loadUserDetails(int userId) throws DatabaseException {
    DatabaseUserDAO userDAO = new DatabaseUserDAO();
    User user = userDAO.getUserByUserId(userId);
    userIdField.setText(String.valueOf(user.getUserId()));
    employeeIdField.setText(String.valueOf(user.getEmployeeId()));
    usernameField.setText(user.getUsername());

    // Mask the password
    passwordField.setText(userDAO.maskPassword(user.getPassword()));

    // Fetch role type based on roleId from user object and set it in the dropdown
    String roleType = user.getRoleType();
    customDropdown.setSelectedRoleType(roleType);
    }

    private void setupConfirmButtonAction() {
        confirmAddUserBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateUser();
            }
        });
    }

 private void updateUser() {
    try {
        int row = usersTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Retrieve userId from the selected row
        String userIdStr = usersTable.getValueAt(row, 0).toString();
        
        // Fetch user details from database based on userId
        DatabaseUserDAO userDAO = new DatabaseUserDAO();
        User user = userDAO.getUserByUserId(Integer.parseInt(userIdStr));

        // Current details from the database
        String currentUsername = user.getUsername();
        int employeeId = user.getEmployeeId();
        String roleType = user.getRoleType();

        // New details from the form fields
        String newUsername = usernameField.getText().trim(); // Get the new username from the field
        String newPassword = passwordField.getText().trim(); // Trim to remove leading/trailing spaces

        // Validate username
        if (newUsername.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty.", "Invalid Username", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Check if the new username is different from the current username
        if (!newUsername.equals(currentUsername)) {
            // Check if the new username already exists in the database
            try {
                if (userDAO.usernameExists(newUsername)) {
                    JOptionPane.showMessageDialog(this, "Username already exists. Please choose a different username.", "Username Exists", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateUserFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Validate password length if newPassword is not null
        if (newPassword.isEmpty()) {
            newPassword = null; // No new password provided
        } else if (newPassword.length() < 6) {
            JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long.", "Invalid Password", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Update user in database
        userDAO.updateUserInDatabase(user.getUserId(), employeeId, newUsername, roleType, newPassword);

        // Update usersTable if needed
        if (usersTable != null) {
            usersTable.updateTableData("users", new String[]{"UserID", "EmployeeID", "Username", "UserPassword", "RoleID"}, true);
        }

        JOptionPane.showMessageDialog(this, "User updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        dispose(); // Close the update frame after successful update
    } catch (NumberFormatException | DatabaseException ex) {
        JOptionPane.showMessageDialog(this, "Error updating user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

public void populateFields(String userId, String employeeId, String username, String password, String roleType) {
    userIdField.setText(userId);
    employeeIdField.setText(employeeId);
    usernameField.setText(username);
    passwordField.setText("********"); // Display masked password
    customDropdown.setSelectedRoleType(roleType); // Assuming roleType is retrieved correctly
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        confirmAddUserBtn = new UI.RoundedButton();
        jLabel2 = new javax.swing.JLabel();
        userIdField = new UI.RoundedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        employeeIdField = new UI.RoundedTextField();
        jLabel5 = new javax.swing.JLabel();
        usernameField = new UI.RoundedTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordField = new UI.RoundedTextField();
        customDropdown = new UI.CustomDropdown();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(471, 349));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("ADD NEW USER");

        confirmAddUserBtn.setBorder(null);
        confirmAddUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmAddUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-add-user-24.png"))); // NOI18N
        confirmAddUserBtn.setText("Confirm");
        confirmAddUserBtn.setBorderColor(new java.awt.Color(0, 102, 204));
        confirmAddUserBtn.setBorderPainted(false);
        confirmAddUserBtn.setColor(new java.awt.Color(4, 14, 163));
        confirmAddUserBtn.setColorClick(new java.awt.Color(0, 102, 204));
        confirmAddUserBtn.setColorOver(new java.awt.Color(0, 102, 204));
        confirmAddUserBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        confirmAddUserBtn.setRadius(30);
        confirmAddUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddUserBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("User ID");

        userIdField.setEditable(false);

        jLabel3.setText("Role");

        jLabel4.setText("Employee ID");

        employeeIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIdFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Username");

        jLabel6.setText("Password");

        customDropdown.setBackground(new java.awt.Color(255, 255, 255));
        customDropdown.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(customDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmAddUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(employeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(customDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(confirmAddUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeeIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIdFieldActionPerformed

    private void confirmAddUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddUserBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmAddUserBtnActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UI.RoundedButton confirmAddUserBtn;
    private UI.CustomDropdown customDropdown;
    private UI.RoundedTextField employeeIdField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private UI.RoundedTextField passwordField;
    private UI.RoundedTextField userIdField;
    private UI.RoundedTextField usernameField;
    // End of variables declaration//GEN-END:variables


}