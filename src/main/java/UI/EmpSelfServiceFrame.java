
package UI;

import AccessControl.Roles;
import entities.Employee;
import DatabaseConnection.*;
import authentication.AuthenticateUser;
import authentication.AuthenticationService;
import authentication.LoginController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class EmpSelfServiceFrame extends javax.swing.JFrame {

    private final DatabaseEmployeeDAO employeeDAO;
    private DatabaseUserDAO userDAO = new DatabaseUserDAO();
    private LoginController loginController;
    
    
    // User details
    private int userId;
    private int userRole;
    
    public EmpSelfServiceFrame(int userId, int userRole) {
       
        this.userId = userId;
        this.userRole = userRole;
        this.employeeDAO = new DatabaseEmployeeDAO();
   
        initComponents();
        displayUserInfo(userId);
        initializeDependencies();
        simulateHomeButtonClick(); 
        
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
        headerLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        homeBtn = new UI.RoundedButton();
        profileBtn = new UI.RoundedButton();
        payslipBtn = new UI.RoundedButton();
        requestsBtn = new UI.RoundedButton();
        disputesBtn = new UI.RoundedButton();
        logoutBtn = new UI.RoundedButton();
        jLabel2 = new javax.swing.JLabel();
        loggedInUserName = new javax.swing.JLabel();
        loggedInUserPosition = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        profilePanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        payslipPanel = new javax.swing.JPanel();
        requestsPanel = new javax.swing.JPanel();
        disputesPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MotorPH-Small.png"))); // NOI18N

        headerLabel.setFont(new java.awt.Font("MuseoModerno Medium", 0, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(700, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(4, 14, 163));
        jPanel2.setPreferredSize(new java.awt.Dimension(260, 580));

        homeBtn.setBackground(new java.awt.Color(0, 182, 206));
        homeBtn.setBorder(null);
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("Home");
        homeBtn.setAlignmentY(0.0F);
        homeBtn.setBorderColor(new java.awt.Color(4, 14, 163));
        homeBtn.setBorderPainted(false);
        homeBtn.setColor(new java.awt.Color(0, 182, 206));
        homeBtn.setColorClick(new java.awt.Color(153, 153, 153));
        homeBtn.setColorOver(new java.awt.Color(0, 102, 204));
        homeBtn.setFocusPainted(false);
        homeBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        homeBtn.setIconTextGap(3);
        homeBtn.setMargin(new java.awt.Insets(2, 14, 2, 14));
        homeBtn.setPreferredSize(new java.awt.Dimension(150, 32));
        homeBtn.setRadius(25);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        profileBtn.setBackground(new java.awt.Color(0, 182, 206));
        profileBtn.setBorder(null);
        profileBtn.setForeground(new java.awt.Color(255, 255, 255));
        profileBtn.setText("Profile");
        profileBtn.setAlignmentY(0.0F);
        profileBtn.setBorderColor(new java.awt.Color(4, 14, 163));
        profileBtn.setColor(new java.awt.Color(0, 182, 206));
        profileBtn.setColorClick(new java.awt.Color(153, 153, 153));
        profileBtn.setColorOver(new java.awt.Color(0, 102, 204));
        profileBtn.setFocusPainted(false);
        profileBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        profileBtn.setIconTextGap(3);
        profileBtn.setMargin(new java.awt.Insets(2, 14, 2, 14));
        profileBtn.setPreferredSize(new java.awt.Dimension(150, 32));
        profileBtn.setRadius(25);
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        payslipBtn.setBackground(new java.awt.Color(0, 182, 206));
        payslipBtn.setBorder(null);
        payslipBtn.setForeground(new java.awt.Color(255, 255, 255));
        payslipBtn.setText("Payslip");
        payslipBtn.setAlignmentY(0.0F);
        payslipBtn.setBorderColor(new java.awt.Color(4, 14, 163));
        payslipBtn.setColor(new java.awt.Color(0, 182, 206));
        payslipBtn.setColorClick(new java.awt.Color(153, 153, 153));
        payslipBtn.setColorOver(new java.awt.Color(0, 102, 204));
        payslipBtn.setFocusPainted(false);
        payslipBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        payslipBtn.setIconTextGap(3);
        payslipBtn.setMargin(new java.awt.Insets(2, 14, 2, 14));
        payslipBtn.setPreferredSize(new java.awt.Dimension(150, 32));
        payslipBtn.setRadius(25);
        payslipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payslipBtnActionPerformed(evt);
            }
        });

        requestsBtn.setBackground(new java.awt.Color(0, 182, 206));
        requestsBtn.setBorder(null);
        requestsBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestsBtn.setText("Requests");
        requestsBtn.setAlignmentY(0.0F);
        requestsBtn.setBorderColor(new java.awt.Color(4, 14, 163));
        requestsBtn.setColor(new java.awt.Color(0, 182, 206));
        requestsBtn.setColorClick(new java.awt.Color(153, 153, 153));
        requestsBtn.setColorOver(new java.awt.Color(0, 102, 204));
        requestsBtn.setFocusPainted(false);
        requestsBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        requestsBtn.setIconTextGap(3);
        requestsBtn.setMargin(new java.awt.Insets(2, 14, 2, 14));
        requestsBtn.setPreferredSize(new java.awt.Dimension(150, 32));
        requestsBtn.setRadius(25);
        requestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsBtnActionPerformed(evt);
            }
        });

        disputesBtn.setBackground(new java.awt.Color(0, 182, 206));
        disputesBtn.setBorder(null);
        disputesBtn.setForeground(new java.awt.Color(255, 255, 255));
        disputesBtn.setText("Disputes");
        disputesBtn.setAlignmentY(0.0F);
        disputesBtn.setBorderColor(new java.awt.Color(4, 14, 163));
        disputesBtn.setColor(new java.awt.Color(0, 182, 206));
        disputesBtn.setColorClick(new java.awt.Color(153, 153, 153));
        disputesBtn.setColorOver(new java.awt.Color(0, 102, 204));
        disputesBtn.setFocusPainted(false);
        disputesBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        disputesBtn.setIconTextGap(3);
        disputesBtn.setMargin(new java.awt.Insets(2, 14, 2, 14));
        disputesBtn.setPreferredSize(new java.awt.Dimension(150, 32));
        disputesBtn.setRadius(25);
        disputesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disputesBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(0, 182, 206));
        logoutBtn.setBorder(null);
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setAlignmentY(0.0F);
        logoutBtn.setBorderColor(new java.awt.Color(4, 14, 163));
        logoutBtn.setColor(new java.awt.Color(0, 182, 206));
        logoutBtn.setColorClick(new java.awt.Color(102, 102, 102));
        logoutBtn.setColorOver(new java.awt.Color(0, 102, 204));
        logoutBtn.setFocusPainted(false);
        logoutBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        logoutBtn.setIconTextGap(3);
        logoutBtn.setMargin(new java.awt.Insets(2, 14, 2, 14));
        logoutBtn.setPreferredSize(new java.awt.Dimension(150, 32));
        logoutBtn.setRadius(25);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-test-account-64.png"))); // NOI18N

        loggedInUserName.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        loggedInUserName.setForeground(new java.awt.Color(255, 255, 255));

        loggedInUserPosition.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        loggedInUserPosition.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payslipBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disputesBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loggedInUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(loggedInUserPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(loggedInUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(loggedInUserPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payslipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disputesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        contentPanel.setBackground(new java.awt.Color(255, 204, 255));
        contentPanel.setLayout(new java.awt.CardLayout());

        profilePanel.setBackground(new java.awt.Color(240, 243, 252));

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        contentPanel.add(profilePanel, "card2");

        homePanel.setBackground(new java.awt.Color(240, 243, 252));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MotorPH-Big.png"))); // NOI18N
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel23.setFont(new java.awt.Font("Poppins Medium", 1, 60)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 153));
        jLabel23.setText("Payroll System");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel23))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        contentPanel.add(homePanel, "card3");

        payslipPanel.setBackground(new java.awt.Color(240, 243, 252));

        javax.swing.GroupLayout payslipPanelLayout = new javax.swing.GroupLayout(payslipPanel);
        payslipPanel.setLayout(payslipPanelLayout);
        payslipPanelLayout.setHorizontalGroup(
            payslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        payslipPanelLayout.setVerticalGroup(
            payslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        contentPanel.add(payslipPanel, "card4");

        requestsPanel.setBackground(new java.awt.Color(240, 243, 252));

        javax.swing.GroupLayout requestsPanelLayout = new javax.swing.GroupLayout(requestsPanel);
        requestsPanel.setLayout(requestsPanelLayout);
        requestsPanelLayout.setHorizontalGroup(
            requestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        requestsPanelLayout.setVerticalGroup(
            requestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        contentPanel.add(requestsPanel, "card6");

        disputesPanel.setBackground(new java.awt.Color(240, 243, 252));

        javax.swing.GroupLayout disputesPanelLayout = new javax.swing.GroupLayout(disputesPanel);
        disputesPanel.setLayout(disputesPanelLayout);
        disputesPanelLayout.setHorizontalGroup(
            disputesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        disputesPanelLayout.setVerticalGroup(
            disputesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        contentPanel.add(disputesPanel, "card8");

        getContentPane().add(contentPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
       headerLabel.setText(homeBtn.getText()); 
       hideAllPanels();
       homePanel.setVisible(true);
       
       
    }//GEN-LAST:event_homeBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed

        if (Roles.isAdmin(userRole)) {
            headerLabel.setText(profileBtn.getText()); 
            hideAllPanels();
            profilePanel.setVisible(true);
        } else {
            denyAccess();
        }
    }//GEN-LAST:event_profileBtnActionPerformed

    private void payslipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payslipBtnActionPerformed
     
    }//GEN-LAST:event_payslipBtnActionPerformed

    private void requestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestsBtnActionPerformed

    }//GEN-LAST:event_requestsBtnActionPerformed

    private void disputesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disputesBtnActionPerformed
    
    }//GEN-LAST:event_disputesBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
       UI_Login uiLogin = new UI_Login();
       uiLogin.goToLoginUI();
    }//GEN-LAST:event_logoutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpSelfServiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpSelfServiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpSelfServiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpSelfServiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private UI.RoundedButton disputesBtn;
    private javax.swing.JPanel disputesPanel;
    private javax.swing.JLabel headerLabel;
    private UI.RoundedButton homeBtn;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loggedInUserName;
    private javax.swing.JLabel loggedInUserPosition;
    private UI.RoundedButton logoutBtn;
    private UI.RoundedButton payslipBtn;
    private javax.swing.JPanel payslipPanel;
    private UI.RoundedButton profileBtn;
    private javax.swing.JPanel profilePanel;
    private UI.RoundedButton requestsBtn;
    private javax.swing.JPanel requestsPanel;
    // End of variables declaration//GEN-END:variables
    
    private void initializeDependencies() {
        AuthenticationService authenticationService = new AuthenticateUser(); 
        this.loginController = new LoginController(authenticationService, employeeDAO);
    }
    private void simulateHomeButtonClick() {
        SwingUtilities.invokeLater(() -> {
            homeBtn.setBackground(homeBtn.getColorClick()); // Set background to clicked color
            // Perform any additional actions related to homeBtn being "clicked"
        });
    }
     private void denyAccess() {
        JOptionPane.showMessageDialog(this, "Access Denied, You do not have permission view this Panel", "Error", JOptionPane.ERROR_MESSAGE);
        // Optionally, redirect to home panel or handle as needed
    }

    

    
    private void displayUserInfo(int userId) {
        Employee employee = employeeDAO.getEmployeeById(userId);
        if (employee != null) {
            loggedInUserName.setText(employee.getFirstName() + " " + employee.getLastName());
            loggedInUserPosition.setText(employee.getPosition());
            
        } else {
            JOptionPane.showMessageDialog(this, "User not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void hideAllPanels() {
        homePanel.setVisible(false);
        profilePanel.setVisible(false);
        payslipPanel.setVisible(false);
        requestsPanel.setVisible(false);
        disputesPanel.setVisible(false);
    }
    
}

