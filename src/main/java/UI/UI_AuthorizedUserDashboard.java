
package UI;


import java.awt.Color;
import javax.swing.JPanel;
import authentication.AuthenticateUser;
import authentication.AuthenticationService;
import authentication.LoginController;
import DatabaseConnection.*;
import entities.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class UI_AuthorizedUserDashboard extends javax.swing.JFrame {
    private int loggedInUserId;
    private LoginController loginController;
    private EmployeeDAO employeeDAO;
    private DatabaseUserDAO userDAO = new DatabaseUserDAO();
    
 
 
   public UI_AuthorizedUserDashboard(int loggedInUserId) {
       this.loggedInUserId = loggedInUserId;
        initComponents();
        setLocationRelativeTo(null);
        initializeDependencies();
        displayUserInfo(loggedInUserId);
        
       
        

    
        
        
       ((RoundedPanel) dashboardBtn).setTargetPanel(dashboardPanel, "Dashboard");
        ((RoundedPanel) employeeMgmtBtn).setTargetPanel(empMgmtPanel, "Employee Management");
        ((RoundedPanel) attendanceBtn).setTargetPanel(attendancePanel, "Attendance");
        ((RoundedPanel) disputesBtn).setTargetPanel(disputesPanel, "Disputes");
        ((RoundedPanel) payrollMgmtBtn).setTargetPanel(payrollMgmtPanel, "Payroll Management");
        ((RoundedPanel) requestsBtn).setTargetPanel(requestsPanel, "Requests");
        ((RoundedPanel) taxReportsBtn).setTargetPanel(taxReportsPanel, "Tax Reports");
        ((RoundedPanel) userMgmtBtn).setTargetPanel(userMgmtPanel, "User Management");

        // Simulate click to show the initial panel
        ((RoundedPanel) dashboardBtn).simulateClick();
       
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanel = new javax.swing.JPanel();
        adminMenuPanel = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        dashboardBtn = new RoundedPanel(new Color(4,14,163));
        adminMenuLabel1 = new javax.swing.JLabel();
        employeeMgmtBtn = new RoundedPanel(new Color(4,14,163));
        adminMenuLabel2 = new javax.swing.JLabel();
        payrollMgmtBtn = new RoundedPanel(new Color(4,14,163));
        adminMenuLabel3 = new javax.swing.JLabel();
        attendanceBtn = new RoundedPanel(new Color(4,14,163));
        adminMenuLabel4 = new javax.swing.JLabel();
        requestsBtn = new RoundedPanel(new Color(4,14,163));
        adminMenuLabel5 = new javax.swing.JLabel();
        disputesBtn = new RoundedPanel(new Color(4,14,163));
        adminMenuLabel6 = new javax.swing.JLabel();
        taxReportsBtn = new RoundedPanel(new Color(4,14,163));
        adminMenuLabel7 = new javax.swing.JLabel();
        logoutBtn = new RoundedPanel(new Color(4,14,163));
        adminLogoutLbl = new javax.swing.JLabel();
        userMgmtBtn = new RoundedPanel(new Color(4,14,163));
        adminMenuLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loggedInUserName = new javax.swing.JLabel();
        loggedInUserPosition = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        motorPHLogo = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        dashboardPanel = new javax.swing.JPanel();
        userMgmtPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable =  createStyledTable("Users");
        addUserBtn = new javax.swing.JButton();
        updateUserBtn = new javax.swing.JButton();
        deleteUserBtn = new javax.swing.JButton();
        addUserPanel = new javax.swing.JPanel();
        userIDTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        empIDTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userNameTxtField = new javax.swing.JTextField();
        generateUserIDBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        roleIDTxtField = new javax.swing.JTextField();
        confirmAddUserBtn = new javax.swing.JButton();
        deleteUserPanel = new javax.swing.JPanel();
        userIDTxtField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        empIDTxtField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userNameTxtField1 = new javax.swing.JTextField();
        generateUserIDBtn1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        passwordTxtField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        roleIDTxtField1 = new javax.swing.JTextField();
        confirmAddUserBtn1 = new javax.swing.JButton();
        updateUserPanel = new javax.swing.JPanel();
        userIDTxtField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        empIDTxtField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        userNameTxtField2 = new javax.swing.JTextField();
        generateUserIDBtn2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        passwordTxtField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        roleIDTxtField2 = new javax.swing.JTextField();
        confirmAddUserBtn2 = new javax.swing.JButton();
        empMgmtPanel = new javax.swing.JPanel();
        payrollMgmtPanel = new javax.swing.JPanel();
        attendancePanel = new javax.swing.JPanel();
        requestsPanel = new javax.swing.JPanel();
        disputesPanel = new javax.swing.JPanel();
        taxReportsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        adminPanel.setBackground(new java.awt.Color(231, 231, 231));
        adminPanel.setMaximumSize(new java.awt.Dimension(1200, 800));
        adminPanel.setPreferredSize(new java.awt.Dimension(1200, 800));

        adminMenuPanel.setBackground(new java.awt.Color(4, 14, 163));
        adminMenuPanel.setAlignmentX(0.0F);
        adminMenuPanel.setAlignmentY(0.0F);
        adminMenuPanel.setMaximumSize(new java.awt.Dimension(340, 655));
        adminMenuPanel.setPreferredSize(new java.awt.Dimension(340, 655));

        logoutLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Logout");

        dashboardBtn.setBackground(new java.awt.Color(153, 153, 153));
        // Manually simulate mouse exited event

        // Manually simulate mouse clicked event
        dashboardBtn.setMaximumSize(new java.awt.Dimension(250, 40));
        dashboardBtn.setMinimumSize(new java.awt.Dimension(250, 40));
        dashboardBtn.setPreferredSize(new java.awt.Dimension(250, 40));
        dashboardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardBtnMouseClicked(evt);
            }
        });

        adminMenuLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        adminMenuLabel1.setForeground(new java.awt.Color(255, 255, 255));
        adminMenuLabel1.setText("Dashboard");

        javax.swing.GroupLayout dashboardBtnLayout = new javax.swing.GroupLayout(dashboardBtn);
        dashboardBtn.setLayout(dashboardBtnLayout);
        dashboardBtnLayout.setHorizontalGroup(
            dashboardBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(adminMenuLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        dashboardBtnLayout.setVerticalGroup(
            dashboardBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenuLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        employeeMgmtBtn.setBackground(new java.awt.Color(153, 153, 153));
        employeeMgmtBtn.setMaximumSize(new java.awt.Dimension(250, 40));
        employeeMgmtBtn.setMinimumSize(new java.awt.Dimension(250, 40));
        employeeMgmtBtn.setPreferredSize(new java.awt.Dimension(250, 40));
        employeeMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeMgmtBtnMouseClicked(evt);
            }
        });

        adminMenuLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        adminMenuLabel2.setForeground(new java.awt.Color(255, 255, 255));
        adminMenuLabel2.setText("Employee Management");

        javax.swing.GroupLayout employeeMgmtBtnLayout = new javax.swing.GroupLayout(employeeMgmtBtn);
        employeeMgmtBtn.setLayout(employeeMgmtBtnLayout);
        employeeMgmtBtnLayout.setHorizontalGroup(
            employeeMgmtBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeMgmtBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(adminMenuLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        employeeMgmtBtnLayout.setVerticalGroup(
            employeeMgmtBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenuLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        payrollMgmtBtn.setBackground(new java.awt.Color(153, 153, 153));
        payrollMgmtBtn.setMaximumSize(new java.awt.Dimension(250, 40));
        payrollMgmtBtn.setMinimumSize(new java.awt.Dimension(250, 40));
        payrollMgmtBtn.setPreferredSize(new java.awt.Dimension(250, 40));
        payrollMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payrollMgmtBtnMouseClicked(evt);
            }
        });

        adminMenuLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        adminMenuLabel3.setForeground(new java.awt.Color(255, 255, 255));
        adminMenuLabel3.setText("Payroll Management");

        javax.swing.GroupLayout payrollMgmtBtnLayout = new javax.swing.GroupLayout(payrollMgmtBtn);
        payrollMgmtBtn.setLayout(payrollMgmtBtnLayout);
        payrollMgmtBtnLayout.setHorizontalGroup(
            payrollMgmtBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payrollMgmtBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(adminMenuLabel3)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        payrollMgmtBtnLayout.setVerticalGroup(
            payrollMgmtBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenuLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        attendanceBtn.setBackground(new java.awt.Color(153, 153, 153));
        attendanceBtn.setMaximumSize(new java.awt.Dimension(250, 40));
        attendanceBtn.setMinimumSize(new java.awt.Dimension(250, 40));
        attendanceBtn.setPreferredSize(new java.awt.Dimension(250, 40));

        adminMenuLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        adminMenuLabel4.setForeground(new java.awt.Color(255, 255, 255));
        adminMenuLabel4.setText("Attendance");

        javax.swing.GroupLayout attendanceBtnLayout = new javax.swing.GroupLayout(attendanceBtn);
        attendanceBtn.setLayout(attendanceBtnLayout);
        attendanceBtnLayout.setHorizontalGroup(
            attendanceBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(adminMenuLabel4)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        attendanceBtnLayout.setVerticalGroup(
            attendanceBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenuLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        requestsBtn.setBackground(new java.awt.Color(153, 153, 153));
        requestsBtn.setMaximumSize(new java.awt.Dimension(250, 40));
        requestsBtn.setMinimumSize(new java.awt.Dimension(250, 40));
        requestsBtn.setPreferredSize(new java.awt.Dimension(250, 40));

        adminMenuLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        adminMenuLabel5.setForeground(new java.awt.Color(255, 255, 255));
        adminMenuLabel5.setText("Requests");

        javax.swing.GroupLayout requestsBtnLayout = new javax.swing.GroupLayout(requestsBtn);
        requestsBtn.setLayout(requestsBtnLayout);
        requestsBtnLayout.setHorizontalGroup(
            requestsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestsBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(adminMenuLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        requestsBtnLayout.setVerticalGroup(
            requestsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenuLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        disputesBtn.setBackground(new java.awt.Color(153, 153, 153));
        disputesBtn.setMaximumSize(new java.awt.Dimension(250, 40));
        disputesBtn.setMinimumSize(new java.awt.Dimension(250, 40));
        disputesBtn.setPreferredSize(new java.awt.Dimension(250, 40));

        adminMenuLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        adminMenuLabel6.setForeground(new java.awt.Color(255, 255, 255));
        adminMenuLabel6.setText("Disputes");

        javax.swing.GroupLayout disputesBtnLayout = new javax.swing.GroupLayout(disputesBtn);
        disputesBtn.setLayout(disputesBtnLayout);
        disputesBtnLayout.setHorizontalGroup(
            disputesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disputesBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(adminMenuLabel6)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        disputesBtnLayout.setVerticalGroup(
            disputesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenuLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        taxReportsBtn.setBackground(new java.awt.Color(153, 153, 153));
        taxReportsBtn.setMaximumSize(new java.awt.Dimension(250, 40));
        taxReportsBtn.setMinimumSize(new java.awt.Dimension(250, 40));
        taxReportsBtn.setPreferredSize(new java.awt.Dimension(250, 40));

        adminMenuLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        adminMenuLabel7.setForeground(new java.awt.Color(255, 255, 255));
        adminMenuLabel7.setText("Tax Reports");

        javax.swing.GroupLayout taxReportsBtnLayout = new javax.swing.GroupLayout(taxReportsBtn);
        taxReportsBtn.setLayout(taxReportsBtnLayout);
        taxReportsBtnLayout.setHorizontalGroup(
            taxReportsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxReportsBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(adminMenuLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        taxReportsBtnLayout.setVerticalGroup(
            taxReportsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenuLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        logoutBtn.setBackground(new java.awt.Color(153, 153, 153));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        adminLogoutLbl.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        adminLogoutLbl.setForeground(new java.awt.Color(255, 255, 255));
        adminLogoutLbl.setText("Logout");

        javax.swing.GroupLayout logoutBtnLayout = new javax.swing.GroupLayout(logoutBtn);
        logoutBtn.setLayout(logoutBtnLayout);
        logoutBtnLayout.setHorizontalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutBtnLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(adminLogoutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        logoutBtnLayout.setVerticalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminLogoutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        userMgmtBtn.setBackground(new java.awt.Color(153, 153, 153));
        userMgmtBtn.setMaximumSize(new java.awt.Dimension(250, 40));
        userMgmtBtn.setMinimumSize(new java.awt.Dimension(250, 40));
        userMgmtBtn.setPreferredSize(new java.awt.Dimension(250, 40));
        userMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMgmtBtnMouseClicked(evt);
            }
        });

        adminMenuLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        adminMenuLabel8.setForeground(new java.awt.Color(255, 255, 255));
        adminMenuLabel8.setText("User Management");

        javax.swing.GroupLayout userMgmtBtnLayout = new javax.swing.GroupLayout(userMgmtBtn);
        userMgmtBtn.setLayout(userMgmtBtnLayout);
        userMgmtBtnLayout.setHorizontalGroup(
            userMgmtBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userMgmtBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(adminMenuLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        userMgmtBtnLayout.setVerticalGroup(
            userMgmtBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenuLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-test-account-64.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        loggedInUserName.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        loggedInUserName.setForeground(new java.awt.Color(255, 255, 255));

        loggedInUserPosition.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        loggedInUserPosition.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout adminMenuPanelLayout = new javax.swing.GroupLayout(adminMenuPanel);
        adminMenuPanel.setLayout(adminMenuPanelLayout);
        adminMenuPanelLayout.setHorizontalGroup(
            adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminMenuPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminMenuPanelLayout.createSequentialGroup()
                        .addComponent(logoutLabel)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminMenuPanelLayout.createSequentialGroup()
                        .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payrollMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disputesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxReportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adminMenuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loggedInUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(adminMenuPanelLayout.createSequentialGroup()
                                        .addComponent(loggedInUserPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(48, 48, 48))))
        );
        adminMenuPanelLayout.setVerticalGroup(
            adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPanelLayout.createSequentialGroup()
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminMenuPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(loggedInUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loggedInUserPosition))
                    .addGroup(adminMenuPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(userMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(employeeMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(payrollMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(attendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(requestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(disputesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(taxReportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(488, 488, 488)
                .addComponent(logoutLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setMaximumSize(new java.awt.Dimension(1200, 130));
        headerPanel.setMinimumSize(new java.awt.Dimension(1200, 130));
        headerPanel.setPreferredSize(new java.awt.Dimension(1200, 130));

        motorPHLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MotorPH-Small.png"))); // NOI18N

        HeaderLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 36)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(0, 0, 163));
        HeaderLabel.setText("Dashboard");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(motorPHLogo)
                .addGap(152, 152, 152)
                .addComponent(HeaderLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(motorPHLogo)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HeaderLabel)
                .addGap(36, 36, 36))
        );

        dashboardPanel.setBackground(new java.awt.Color(240, 243, 252));
        dashboardPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        dashboardPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        dashboardPanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        userMgmtPanel.setBackground(new java.awt.Color(240, 243, 252));
        userMgmtPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        userMgmtPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        userMgmtPanel.setVerifyInputWhenFocusTarget(false);
        userMgmtPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(Color.WHITE);
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportView(userTable);

        userMgmtPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 293, 720, 350));

        addUserBtn.setBackground(new java.awt.Color(107, 151, 177));
        addUserBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        addUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        addUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-add-user-24.png"))); // NOI18N
        addUserBtn.setText("Add User");
        addUserBtn.setBorderPainted(false);
        addUserBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addUserBtn.setMaximumSize(new java.awt.Dimension(164, 31));
        addUserBtn.setMinimumSize(new java.awt.Dimension(164, 31));
        addUserBtn.setName(""); // NOI18N
        addUserBtn.setPreferredSize(new java.awt.Dimension(164, 31));
        addUserBtn.setRequestFocusEnabled(false);
        addUserBtn.setRolloverEnabled(false);
        addUserBtn.setVerifyInputWhenFocusTarget(false);
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });
        userMgmtPanel.add(addUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 44));

        updateUserBtn.setBackground(new java.awt.Color(107, 151, 177));
        updateUserBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        updateUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-edit-user-24.png"))); // NOI18N
        updateUserBtn.setText("Update User");
        updateUserBtn.setMaximumSize(new java.awt.Dimension(164, 31));
        updateUserBtn.setMinimumSize(new java.awt.Dimension(164, 31));
        updateUserBtn.setPreferredSize(new java.awt.Dimension(164, 31));
        updateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBtnActionPerformed(evt);
            }
        });
        userMgmtPanel.add(updateUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, 44));

        deleteUserBtn.setBackground(new java.awt.Color(107, 151, 177));
        deleteUserBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        deleteUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-delete-user-24 (1).png"))); // NOI18N
        deleteUserBtn.setText("Delete User");
        deleteUserBtn.setMaximumSize(new java.awt.Dimension(164, 31));
        deleteUserBtn.setMinimumSize(new java.awt.Dimension(164, 31));
        deleteUserBtn.setPreferredSize(new java.awt.Dimension(164, 31));
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });
        userMgmtPanel.add(deleteUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, 44));

        addUserPanel.setBackground(new java.awt.Color(208, 225, 234));

        userIDTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTxtFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setText("User ID");

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setText("Employee ID");

        empIDTxtField.setMargin(new java.awt.Insets(6, 6, 6, 6));
        empIDTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDTxtFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setText("Username");

        userNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtFieldActionPerformed(evt);
            }
        });

        generateUserIDBtn.setBackground(new java.awt.Color(45, 51, 241));
        generateUserIDBtn.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        generateUserIDBtn.setForeground(new java.awt.Color(255, 255, 255));
        generateUserIDBtn.setText("Generate User ID");
        generateUserIDBtn.setMaximumSize(new java.awt.Dimension(164, 22));
        generateUserIDBtn.setMinimumSize(new java.awt.Dimension(164, 22));
        generateUserIDBtn.setName(""); // NOI18N
        generateUserIDBtn.setPreferredSize(new java.awt.Dimension(164, 22));
        generateUserIDBtn.setRolloverEnabled(false);
        generateUserIDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateUserIDBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setText("Password");

        passwordTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setText("Role ID");

        roleIDTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleIDTxtFieldActionPerformed(evt);
            }
        });

        confirmAddUserBtn.setBackground(new java.awt.Color(45, 51, 241));
        confirmAddUserBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        confirmAddUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmAddUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-add-user-24.png"))); // NOI18N
        confirmAddUserBtn.setText("Confirm");
        confirmAddUserBtn.setMaximumSize(new java.awt.Dimension(164, 31));
        confirmAddUserBtn.setMinimumSize(new java.awt.Dimension(164, 31));
        confirmAddUserBtn.setName(""); // NOI18N
        confirmAddUserBtn.setPreferredSize(new java.awt.Dimension(164, 31));
        confirmAddUserBtn.setRolloverEnabled(false);
        confirmAddUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addUserPanelLayout = new javax.swing.GroupLayout(addUserPanel);
        addUserPanel.setLayout(addUserPanelLayout);
        addUserPanelLayout.setHorizontalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmAddUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(generateUserIDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(userNameTxtField))))
                .addGap(26, 26, 26)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roleIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(77, 77, 77))
        );
        addUserPanelLayout.setVerticalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateUserIDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6))
                    .addComponent(jLabel8))
                .addGap(3, 3, 3)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmAddUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        userMgmtPanel.add(addUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 720, 220));

        deleteUserPanel.setBackground(new java.awt.Color(102, 255, 204));
        deleteUserPanel.setOpaque(false);

        userIDTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTxtField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel7.setText("User ID");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel9.setText("Employee ID");

        empIDTxtField1.setMargin(new java.awt.Insets(6, 6, 6, 6));
        empIDTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDTxtField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setText("Username");

        userNameTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtField1ActionPerformed(evt);
            }
        });

        generateUserIDBtn1.setBackground(new java.awt.Color(45, 51, 241));
        generateUserIDBtn1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        generateUserIDBtn1.setForeground(new java.awt.Color(255, 255, 255));
        generateUserIDBtn1.setText("Generate User ID");
        generateUserIDBtn1.setMaximumSize(new java.awt.Dimension(164, 22));
        generateUserIDBtn1.setMinimumSize(new java.awt.Dimension(164, 22));
        generateUserIDBtn1.setName(""); // NOI18N
        generateUserIDBtn1.setPreferredSize(new java.awt.Dimension(164, 22));
        generateUserIDBtn1.setRolloverEnabled(false);
        generateUserIDBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateUserIDBtn1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel10.setText("Password");

        passwordTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtField1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel11.setText("Role ID");

        roleIDTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleIDTxtField1ActionPerformed(evt);
            }
        });

        confirmAddUserBtn1.setBackground(new java.awt.Color(45, 51, 241));
        confirmAddUserBtn1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        confirmAddUserBtn1.setForeground(new java.awt.Color(255, 255, 255));
        confirmAddUserBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-add-user-24.png"))); // NOI18N
        confirmAddUserBtn1.setText("Confirm");
        confirmAddUserBtn1.setMaximumSize(new java.awt.Dimension(164, 31));
        confirmAddUserBtn1.setMinimumSize(new java.awt.Dimension(164, 31));
        confirmAddUserBtn1.setName(""); // NOI18N
        confirmAddUserBtn1.setPreferredSize(new java.awt.Dimension(164, 31));
        confirmAddUserBtn1.setRolloverEnabled(false);
        confirmAddUserBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddUserBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteUserPanelLayout = new javax.swing.GroupLayout(deleteUserPanel);
        deleteUserPanel.setLayout(deleteUserPanelLayout);
        deleteUserPanelLayout.setHorizontalGroup(
            deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteUserPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empIDTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmAddUserBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(deleteUserPanelLayout.createSequentialGroup()
                        .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userIDTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(generateUserIDBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(userNameTxtField1))))
                .addGap(26, 26, 26)
                .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roleIDTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(77, 77, 77))
        );
        deleteUserPanelLayout.setVerticalGroup(
            deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteUserPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIDTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateUserIDBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel10))
                    .addComponent(jLabel11))
                .addGap(3, 3, 3)
                .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empIDTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleIDTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmAddUserBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        userMgmtPanel.add(deleteUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 720, 220));

        updateUserPanel.setBackground(new java.awt.Color(255, 255, 153));
        updateUserPanel.setOpaque(false);

        userIDTxtField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTxtField2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel12.setText("User ID");

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel13.setText("Employee ID");

        empIDTxtField2.setMargin(new java.awt.Insets(6, 6, 6, 6));
        empIDTxtField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDTxtField2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel14.setText("Username");

        userNameTxtField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtField2ActionPerformed(evt);
            }
        });

        generateUserIDBtn2.setBackground(new java.awt.Color(45, 51, 241));
        generateUserIDBtn2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        generateUserIDBtn2.setForeground(new java.awt.Color(255, 255, 255));
        generateUserIDBtn2.setText("Generate User ID");
        generateUserIDBtn2.setMaximumSize(new java.awt.Dimension(164, 22));
        generateUserIDBtn2.setMinimumSize(new java.awt.Dimension(164, 22));
        generateUserIDBtn2.setName(""); // NOI18N
        generateUserIDBtn2.setPreferredSize(new java.awt.Dimension(164, 22));
        generateUserIDBtn2.setRolloverEnabled(false);
        generateUserIDBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateUserIDBtn2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel15.setText("Password");

        passwordTxtField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtField2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel16.setText("Role ID");

        roleIDTxtField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleIDTxtField2ActionPerformed(evt);
            }
        });

        confirmAddUserBtn2.setBackground(new java.awt.Color(45, 51, 241));
        confirmAddUserBtn2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        confirmAddUserBtn2.setForeground(new java.awt.Color(255, 255, 255));
        confirmAddUserBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-add-user-24.png"))); // NOI18N
        confirmAddUserBtn2.setText("Confirm");
        confirmAddUserBtn2.setMaximumSize(new java.awt.Dimension(164, 31));
        confirmAddUserBtn2.setMinimumSize(new java.awt.Dimension(164, 31));
        confirmAddUserBtn2.setName(""); // NOI18N
        confirmAddUserBtn2.setPreferredSize(new java.awt.Dimension(164, 31));
        confirmAddUserBtn2.setRolloverEnabled(false);
        confirmAddUserBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddUserBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateUserPanelLayout = new javax.swing.GroupLayout(updateUserPanel);
        updateUserPanel.setLayout(updateUserPanelLayout);
        updateUserPanelLayout.setHorizontalGroup(
            updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateUserPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empIDTxtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmAddUserBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(updateUserPanelLayout.createSequentialGroup()
                        .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userIDTxtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26)
                        .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(generateUserIDBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(userNameTxtField2))))
                .addGap(26, 26, 26)
                .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTxtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(26, 26, 26)
                .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roleIDTxtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(77, 77, 77))
        );
        updateUserPanelLayout.setVerticalGroup(
            updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateUserPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIDTxtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateUserIDBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15))
                    .addComponent(jLabel16))
                .addGap(3, 3, 3)
                .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empIDTxtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTxtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleIDTxtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmAddUserBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        userMgmtPanel.add(updateUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 720, 220));

        empMgmtPanel.setBackground(new java.awt.Color(240, 243, 252));
        empMgmtPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        empMgmtPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        empMgmtPanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout empMgmtPanelLayout = new javax.swing.GroupLayout(empMgmtPanel);
        empMgmtPanel.setLayout(empMgmtPanelLayout);
        empMgmtPanelLayout.setHorizontalGroup(
            empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        empMgmtPanelLayout.setVerticalGroup(
            empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        payrollMgmtPanel.setBackground(new java.awt.Color(240, 243, 252));
        payrollMgmtPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        payrollMgmtPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        payrollMgmtPanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout payrollMgmtPanelLayout = new javax.swing.GroupLayout(payrollMgmtPanel);
        payrollMgmtPanel.setLayout(payrollMgmtPanelLayout);
        payrollMgmtPanelLayout.setHorizontalGroup(
            payrollMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        payrollMgmtPanelLayout.setVerticalGroup(
            payrollMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        attendancePanel.setBackground(new java.awt.Color(240, 243, 252));
        attendancePanel.setMaximumSize(new java.awt.Dimension(860, 655));
        attendancePanel.setPreferredSize(new java.awt.Dimension(860, 655));
        attendancePanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout attendancePanelLayout = new javax.swing.GroupLayout(attendancePanel);
        attendancePanel.setLayout(attendancePanelLayout);
        attendancePanelLayout.setHorizontalGroup(
            attendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        attendancePanelLayout.setVerticalGroup(
            attendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        requestsPanel.setBackground(new java.awt.Color(240, 243, 252));
        requestsPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        requestsPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        requestsPanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout requestsPanelLayout = new javax.swing.GroupLayout(requestsPanel);
        requestsPanel.setLayout(requestsPanelLayout);
        requestsPanelLayout.setHorizontalGroup(
            requestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        requestsPanelLayout.setVerticalGroup(
            requestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        disputesPanel.setBackground(new java.awt.Color(240, 243, 252));
        disputesPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        disputesPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        disputesPanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout disputesPanelLayout = new javax.swing.GroupLayout(disputesPanel);
        disputesPanel.setLayout(disputesPanelLayout);
        disputesPanelLayout.setHorizontalGroup(
            disputesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        disputesPanelLayout.setVerticalGroup(
            disputesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        taxReportsPanel.setBackground(new java.awt.Color(240, 243, 252));
        taxReportsPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        taxReportsPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        taxReportsPanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout taxReportsPanelLayout = new javax.swing.GroupLayout(taxReportsPanel);
        taxReportsPanel.setLayout(taxReportsPanelLayout);
        taxReportsPanelLayout.setHorizontalGroup(
            taxReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        taxReportsPanelLayout.setVerticalGroup(
            taxReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminPanelLayout.createSequentialGroup()
                                .addComponent(adminMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adminPanelLayout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payrollMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attendancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(requestsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disputesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(taxReportsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxReportsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disputesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(requestsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attendancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payrollMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)))
                .addGap(5433, 5433, 5433))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(adminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(adminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        
       UI_Login loginUI = new UI_Login();
       loginUI.goToLoginUI();
       dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void dashboardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardBtnMouseClicked
          showPanel(dashboardPanel, "Dashboard");
    }//GEN-LAST:event_dashboardBtnMouseClicked

    private void employeeMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeMgmtBtnMouseClicked
       showPanel(empMgmtPanel, "Employee Management");
    }//GEN-LAST:event_employeeMgmtBtnMouseClicked

    private void payrollMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollMgmtBtnMouseClicked
       showPanel(payrollMgmtPanel, "Payroll Management");
    }//GEN-LAST:event_payrollMgmtBtnMouseClicked

    private void userMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMgmtBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userMgmtBtnMouseClicked

    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBtnActionPerformed
        updateUserBtn.addMouseListener(new ButtonMouseAdapter());
        updateUserPanel.setVisible(true);
        addUserPanel.setVisible(false);
        deleteUserPanel.setVisible(false);
    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void userIDTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDTxtFieldActionPerformed

    private void passwordTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtFieldActionPerformed

    private void empIDTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIDTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIDTxtFieldActionPerformed

    private void userNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtFieldActionPerformed

    private void roleIDTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleIDTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleIDTxtFieldActionPerformed

    private void generateUserIDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateUserIDBtnActionPerformed
         String generatedUserID = DatabaseEmployeeDAO.generateUserID();
        // Set the generated user ID in the userIDTxtField
        userIDTxtField.setText("  " + generatedUserID);
    
    }//GEN-LAST:event_generateUserIDBtnActionPerformed

    private void confirmAddUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddUserBtnActionPerformed
        
         try {
        int employeeId = Integer.parseInt(empIDTxtField.getText());
        String username = userNameTxtField.getText();
        String password = passwordTxtField.getText();
        int roleId = Integer.parseInt(roleIDTxtField.getText());

        // Add the user to the database
        userDAO.addUserToDatabase(employeeId, username, password, roleId);

        // Ensure the userTable is using CustomTableModel
        if (userTable.getModel() instanceof CustomTableModel) {
            CustomTableModel model = (CustomTableModel) userTable.getModel();
            // Update the user table in the UI
            TableUpdater.updateTable(userTable, model, "users");
        } else {
            throw new IllegalStateException("Table model is not an instance of CustomTableModel");
        }

        // Show success message
        JOptionPane.showMessageDialog(this, "User added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers for Employee ID and Role ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error adding user: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_confirmAddUserBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        addUserBtn.addMouseListener(new ButtonMouseAdapter());
        addUserPanel.setVisible(true);
        deleteUserPanel.setVisible(false);
        updateUserPanel.setVisible(false);
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        deleteUserBtn.addMouseListener(new ButtonMouseAdapter());
        deleteUserPanel.setVisible(true);
        addUserPanel.setVisible(false);
        updateUserPanel.setVisible(false);
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void userIDTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDTxtField1ActionPerformed

    private void empIDTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIDTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIDTxtField1ActionPerformed

    private void userNameTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtField1ActionPerformed

    private void generateUserIDBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateUserIDBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generateUserIDBtn1ActionPerformed

    private void passwordTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtField1ActionPerformed

    private void roleIDTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleIDTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleIDTxtField1ActionPerformed

    private void confirmAddUserBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddUserBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmAddUserBtn1ActionPerformed

    private void userIDTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDTxtField2ActionPerformed

    private void empIDTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIDTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIDTxtField2ActionPerformed

    private void userNameTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtField2ActionPerformed

    private void generateUserIDBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateUserIDBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generateUserIDBtn2ActionPerformed

    private void passwordTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtField2ActionPerformed

    private void roleIDTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleIDTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleIDTxtField2ActionPerformed

    private void confirmAddUserBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddUserBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmAddUserBtn2ActionPerformed

private void initializeDependencies() {
        AuthenticationService authenticationService = new AuthenticateUser();
        this.employeeDAO = new DatabaseEmployeeDAO();
        this.loginController = new LoginController(authenticationService, employeeDAO);
    }

    private void displayUserInfo(int userId) {
        try {
            Employee employee = employeeDAO.getEmployeeById(userId);
            if (employee != null) {
                loggedInUserName.setText(employee.getFirstName() + " " + employee.getLastName());
                loggedInUserPosition.setText(employee.getPosition());
                
            } else {
                JOptionPane.showMessageDialog(this, "User not found", "Error", JOptionPane.ERROR_MESSAGE);
            }   } catch (SQLException ex) {
            Logger.getLogger(UI_AuthorizedUserDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
     public void openAuthorizedUserDashboard() {
        // Create an instance of UI_Admin
        UI_AuthorizedUserDashboard adminDashboard = new UI_AuthorizedUserDashboard(loggedInUserId);

        // Make the UI_Admin visible
        adminDashboard.setVisible(true);
    }
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JLabel adminLogoutLbl;
    private javax.swing.JLabel adminMenuLabel1;
    private javax.swing.JLabel adminMenuLabel2;
    private javax.swing.JLabel adminMenuLabel3;
    private javax.swing.JLabel adminMenuLabel4;
    private javax.swing.JLabel adminMenuLabel5;
    private javax.swing.JLabel adminMenuLabel6;
    private javax.swing.JLabel adminMenuLabel7;
    private javax.swing.JLabel adminMenuLabel8;
    private javax.swing.JPanel adminMenuPanel;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JPanel attendanceBtn;
    private javax.swing.JPanel attendancePanel;
    private javax.swing.JButton confirmAddUserBtn;
    private javax.swing.JButton confirmAddUserBtn1;
    private javax.swing.JButton confirmAddUserBtn2;
    private javax.swing.JPanel dashboardBtn;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JPanel deleteUserPanel;
    private javax.swing.JPanel disputesBtn;
    private javax.swing.JPanel disputesPanel;
    private javax.swing.JTextField empIDTxtField;
    private javax.swing.JTextField empIDTxtField1;
    private javax.swing.JTextField empIDTxtField2;
    private javax.swing.JPanel empMgmtPanel;
    private javax.swing.JPanel employeeMgmtBtn;
    private javax.swing.JButton generateUserIDBtn;
    private javax.swing.JButton generateUserIDBtn1;
    private javax.swing.JButton generateUserIDBtn2;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loggedInUserName;
    private javax.swing.JLabel loggedInUserPosition;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel motorPHLogo;
    private javax.swing.JTextField passwordTxtField;
    private javax.swing.JTextField passwordTxtField1;
    private javax.swing.JTextField passwordTxtField2;
    private javax.swing.JPanel payrollMgmtBtn;
    private javax.swing.JPanel payrollMgmtPanel;
    private javax.swing.JPanel requestsBtn;
    private javax.swing.JPanel requestsPanel;
    private javax.swing.JTextField roleIDTxtField;
    private javax.swing.JTextField roleIDTxtField1;
    private javax.swing.JTextField roleIDTxtField2;
    private javax.swing.JPanel taxReportsBtn;
    private javax.swing.JPanel taxReportsPanel;
    private javax.swing.JButton updateUserBtn;
    private javax.swing.JPanel updateUserPanel;
    private javax.swing.JTextField userIDTxtField;
    private javax.swing.JTextField userIDTxtField1;
    private javax.swing.JTextField userIDTxtField2;
    private javax.swing.JPanel userMgmtBtn;
    private javax.swing.JPanel userMgmtPanel;
    private javax.swing.JTextField userNameTxtField;
    private javax.swing.JTextField userNameTxtField1;
    private javax.swing.JTextField userNameTxtField2;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panelToShow, String headerText) {
        PanelSwitcher.showPanel(panelToShow, headerText, HeaderLabel, 
            dashboardPanel, empMgmtPanel, userMgmtPanel, attendancePanel, disputesPanel, payrollMgmtPanel, requestsPanel, taxReportsPanel);
    }
    public static JTable createStyledTable(String tableName) {
    CustomTableModel model = new CustomTableModel(tableName);
    return model.createStyledTable();

    }
    
    

}