
package UI;

import AccessControl.RoleAccess;
import AccessControl.Roles;
import UI.AuthorizedFrame;

import javax.swing.JOptionPane;

public class UI_Main extends javax.swing.JFrame {
    private final int userId;
    private String userRole;

    public UI_Main(int userId) {
        this.userId = userId;
        initComponents();
        fetchUserRole();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        empButton = new javax.swing.JButton();
        authorizedUserButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MotorPH-Big.png"))); // NOI18N
        Logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Payroll System");

        empButton.setBackground(new java.awt.Color(0, 0, 163));
        empButton.setFont(new java.awt.Font("Montserrat Medium", 0, 30)); // NOI18N
        empButton.setForeground(new java.awt.Color(255, 255, 255));
        empButton.setText("EMPLOYEE LOGIN");
        empButton.setBorder(null);
        empButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empButtonMouseClicked(evt);
            }
        });

        authorizedUserButton.setBackground(new java.awt.Color(0, 0, 163));
        authorizedUserButton.setFont(new java.awt.Font("Montserrat Medium", 0, 30)); // NOI18N
        authorizedUserButton.setForeground(new java.awt.Color(255, 255, 255));
        authorizedUserButton.setText("AUTHORIZED USER");
        authorizedUserButton.setBorder(null);
        authorizedUserButton.setFocusPainted(false);
        authorizedUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                authorizedUserButtonMousePressed(evt);
            }
        });
        authorizedUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorizedUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(authorizedUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(empButton, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(262, 262, 262))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorizedUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void fetchUserRole() {
        // Assuming you have a method to fetch userRole based on userId
        int roleId = RoleAccess.getRoleId(userId);
        if (Roles.isAdmin(roleId) || Roles.isPayroll(roleId) || Roles.isHR(roleId)) {
            // Assigning userRole based on fetched roleId
            if (Roles.isAdmin(roleId)) {
                userRole = "Admin";
            } else if (Roles.isPayroll(roleId)) {
                userRole = "Payroll";
            } else if (Roles.isHR(roleId)) {
                userRole = "HR";
            }
        } else {
            JOptionPane.showMessageDialog(this, "Unauthorized access!", "Access Denied", JOptionPane.ERROR_MESSAGE);
            // Handle unauthorized access scenario
        }
    }
    private void empButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empButtonMouseClicked
        int roleId = RoleAccess.getRoleId(userId);
        openEmpSelfServiceFrame(userId, roleId);
        
    }//GEN-LAST:event_empButtonMouseClicked

    private void authorizedUserButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorizedUserButtonMousePressed
      
       int roleId = RoleAccess.getRoleId(userId);

    if (Roles.isAdmin(roleId) || Roles.isPayroll(roleId) || Roles.isHR(roleId)) {
        
        openAuthorizedFrame(userId, roleId); // Pass userId and roleId to openAuthorizedFrame
    } else {
        JOptionPane.showMessageDialog(this, "Unauthorized access!", "Access Denied", JOptionPane.ERROR_MESSAGE);
    }
    }
    public void openAuthorizedFrame(int userId, int roleId) {
        AuthorizedFrame authorizedFrame = new AuthorizedFrame(userId,roleId);
        authorizedFrame.setVisible(true);
        this.dispose();
    }
        
     public void openEmpSelfServiceFrame(int userId, int roleId) {
       EmpSelfServiceFrame empUI = new EmpSelfServiceFrame(userId,roleId);
        empUI.setVisible(true);
        this.dispose();
    
 
    }//GEN-LAST:event_authorizedUserButtonMousePressed

    private void authorizedUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorizedUserButtonActionPerformed

    }//GEN-LAST:event_authorizedUserButtonActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton authorizedUserButton;
    private javax.swing.JButton empButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
