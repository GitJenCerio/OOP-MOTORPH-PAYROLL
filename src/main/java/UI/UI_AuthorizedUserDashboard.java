
/*package UI;


import java.awt.Color;
import javax.swing.JPanel;
import authentication.AuthenticateUser;
import authentication.AuthenticationService;
import authentication.LoginController;
import DatabaseConnection.*;
import PayrollSystem.UserActionLogger;
import PayrollSystem.Utils;
import authentication.PasswordHash;
import entities.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class UI_AuthorizedUserDashboard extends javax.swing.JFrame {
    private int loggedInUserId;
    private LoginController loginController;
    private EmployeeDAO employeeDAO;
    private DatabaseUserDAO userDAO = new DatabaseUserDAO();
    private CustomTableModel customTableModel; 
    
    
   
    
    
 
 
   public UI_AuthorizedUserDashboard(int loggedInUserId) {
       this.loggedInUserId = loggedInUserId;
        initComponents();
        setLocationRelativeTo(null);
        initializeDependencies();
        displayUserInfo(loggedInUserId);
        addUserPanel.setVisible(true); // Set the panel visible
        deleteUserPanel.setVisible(false); // Set other panels invisible
        updateUserPanel.setVisible(false);
        addUserBtn.doClick(); // Programmatically trigger the action of the "Add User" button
        addUserBtn.setBackground(new Color(45, 51, 241));
        ComboBoxUtils.populateComboBox(positionFilter, "Position", "Employees");
        ComboBoxUtils.populateComboBox(supervisorFilter, "ImmediateSupervisor", "Employees");
   

 
       ((RoundedPanelMenu) dashboardBtn).setTargetPanel(dashboardPanel, "Dashboard");
        ((RoundedPanelMenu) employeeMgmtBtn).setTargetPanel(empMgmtPanel, "Employee Management");
        ((RoundedPanelMenu) attendanceBtn).setTargetPanel(attendancePanel, "Attendance");
        ((RoundedPanelMenu) disputesBtn).setTargetPanel(disputesPanel, "Disputes");
        ((RoundedPanelMenu) payrollMgmtBtn).setTargetPanel(payrollMgmtPanel, "Payroll Management");
        ((RoundedPanelMenu) requestsBtn).setTargetPanel(requestsPanel, "Requests");
        ((RoundedPanelMenu) taxReportsBtn).setTargetPanel(taxReportsPanel, "Tax Reports");
        ((RoundedPanelMenu) userMgmtBtn).setTargetPanel(userMgmtPanel, "User Management");

        // Simulate click to show the initial panel
        ((RoundedPanelMenu) dashboardBtn).simulateClick();
       
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        adminPanel = new javax.swing.JPanel();
        adminMenuPanel = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        dashboardBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        adminMenuLabel1 = new javax.swing.JLabel();
        employeeMgmtBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        adminMenuLabel2 = new javax.swing.JLabel();
        payrollMgmtBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        adminMenuLabel3 = new javax.swing.JLabel();
        attendanceBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        adminMenuLabel4 = new javax.swing.JLabel();
        requestsBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        adminMenuLabel5 = new javax.swing.JLabel();
        disputesBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        adminMenuLabel6 = new javax.swing.JLabel();
        taxReportsBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        adminMenuLabel7 = new javax.swing.JLabel();
        logoutBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        adminLogoutLbl = new javax.swing.JLabel();
        userMgmtBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        adminMenuLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loggedInUserName = new javax.swing.JLabel();
        loggedInUserPosition = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        motorPHLogo = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        dashboardPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        userMgmtPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable =  createStyledTable("Users", new String[]{"UserID", "EmployeeID", "Username", "UserPassword", "RoleID"});
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
        searchUserIDDeleteBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        passwordTxtField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        roleIDTxtField1 = new javax.swing.JTextField();
        confirmDeleteUserBtn = new javax.swing.JButton();
        updateUserPanel = new javax.swing.JPanel();
        userIDTxtField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        empIDTxtField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        userNameTxtField2 = new javax.swing.JTextField();
        searchUserIDupdateBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        passwordTxtField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        roleIDTxtField2 = new javax.swing.JTextField();
        confirmUpdateUserBtn = new javax.swing.JButton();
        empMgmtPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        employeeTable =  createStyledTable("Employees", new String[]{"EmployeeID", "LastName", "FirstName", "Position", "ImmediateSupervisor"});
        positionFilter = new javax.swing.JComboBox<>();
        supervisorFilter = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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

        adminMenuLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        adminMenuLabel1.setForeground(new java.awt.Color(255, 255, 255));
        adminMenuLabel1.setText("Home");

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

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MotorPH-Big.png"))); // NOI18N
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel23.setFont(new java.awt.Font("Poppins Medium", 1, 60)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 153));
        jLabel23.setText("Payroll System");

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel23))
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        userMgmtPanel.setBackground(new java.awt.Color(240, 243, 252));
        userMgmtPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        userMgmtPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        userMgmtPanel.setVerifyInputWhenFocusTarget(false);
        userMgmtPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(Color.WHITE);
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        userTable.setFocusable(false);
        userTable.setGridColor(new java.awt.Color(255, 255, 255));
        userTable.setRequestFocusEnabled(false);
        userTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        userTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(userTable);

        userMgmtPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 313, 720, 340));

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

        addUserPanel.setBackground(new java.awt.Color(255, 255, 255));

        userIDTxtField.setEditable(false);
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
                .addContainerGap(20, Short.MAX_VALUE))
        );

        userMgmtPanel.add(addUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 720, 230));

        deleteUserPanel.setBackground(new java.awt.Color(255, 255, 255));

        userIDTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTxtField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel7.setText("User ID");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel9.setText("Employee ID");

        empIDTxtField1.setEditable(false);
        empIDTxtField1.setMargin(new java.awt.Insets(6, 6, 6, 6));
        empIDTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDTxtField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setText("Username");

        userNameTxtField1.setEditable(false);
        userNameTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtField1ActionPerformed(evt);
            }
        });

        searchUserIDDeleteBtn.setBackground(new java.awt.Color(45, 51, 241));
        searchUserIDDeleteBtn.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        searchUserIDDeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchUserIDDeleteBtn.setText("Search User ID");
        searchUserIDDeleteBtn.setMaximumSize(new java.awt.Dimension(164, 22));
        searchUserIDDeleteBtn.setMinimumSize(new java.awt.Dimension(164, 22));
        searchUserIDDeleteBtn.setName(""); // NOI18N
        searchUserIDDeleteBtn.setPreferredSize(new java.awt.Dimension(164, 22));
        searchUserIDDeleteBtn.setRolloverEnabled(false);
        searchUserIDDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserIDDeleteBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel10.setText("Password");

        passwordTxtField1.setEditable(false);
        passwordTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtField1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel11.setText("Role ID");

        roleIDTxtField1.setEditable(false);
        roleIDTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleIDTxtField1ActionPerformed(evt);
            }
        });

        confirmDeleteUserBtn.setBackground(new java.awt.Color(45, 51, 241));
        confirmDeleteUserBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        confirmDeleteUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmDeleteUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-add-user-24.png"))); // NOI18N
        confirmDeleteUserBtn.setText("Confirm");
        confirmDeleteUserBtn.setMaximumSize(new java.awt.Dimension(164, 31));
        confirmDeleteUserBtn.setMinimumSize(new java.awt.Dimension(164, 31));
        confirmDeleteUserBtn.setName(""); // NOI18N
        confirmDeleteUserBtn.setPreferredSize(new java.awt.Dimension(164, 31));
        confirmDeleteUserBtn.setRolloverEnabled(false);
        confirmDeleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmDeleteUserBtnActionPerformed(evt);
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
                    .addComponent(confirmDeleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(deleteUserPanelLayout.createSequentialGroup()
                        .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userIDTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchUserIDDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(searchUserIDDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(confirmDeleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        userMgmtPanel.add(deleteUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 720, 220));

        updateUserPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        searchUserIDupdateBtn.setBackground(new java.awt.Color(45, 51, 241));
        searchUserIDupdateBtn.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        searchUserIDupdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchUserIDupdateBtn.setText("Search User ID");
        searchUserIDupdateBtn.setMaximumSize(new java.awt.Dimension(164, 22));
        searchUserIDupdateBtn.setMinimumSize(new java.awt.Dimension(164, 22));
        searchUserIDupdateBtn.setName(""); // NOI18N
        searchUserIDupdateBtn.setPreferredSize(new java.awt.Dimension(164, 22));
        searchUserIDupdateBtn.setRolloverEnabled(false);
        searchUserIDupdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserIDupdateBtnActionPerformed(evt);
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

        confirmUpdateUserBtn.setBackground(new java.awt.Color(45, 51, 241));
        confirmUpdateUserBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        confirmUpdateUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmUpdateUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-add-user-24.png"))); // NOI18N
        confirmUpdateUserBtn.setText("Confirm");
        confirmUpdateUserBtn.setMaximumSize(new java.awt.Dimension(164, 31));
        confirmUpdateUserBtn.setMinimumSize(new java.awt.Dimension(164, 31));
        confirmUpdateUserBtn.setName(""); // NOI18N
        confirmUpdateUserBtn.setPreferredSize(new java.awt.Dimension(164, 31));
        confirmUpdateUserBtn.setRolloverEnabled(false);
        confirmUpdateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmUpdateUserBtnActionPerformed(evt);
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
                    .addComponent(confirmUpdateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(updateUserPanelLayout.createSequentialGroup()
                        .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userIDTxtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26)
                        .addGroup(updateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchUserIDupdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(searchUserIDupdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(confirmUpdateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        userMgmtPanel.add(updateUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 720, 220));

        empMgmtPanel.setBackground(new java.awt.Color(240, 243, 252));
        empMgmtPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        empMgmtPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        empMgmtPanel.setVerifyInputWhenFocusTarget(false);

        jScrollPane1.setBackground(Color.WHITE);
        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

        employeeTable.setFocusable(false);
        employeeTable.setGridColor(new java.awt.Color(255, 255, 255));
        employeeTable.setRequestFocusEnabled(false);
        employeeTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        employeeTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(employeeTable);

        positionFilter.setMaximumRowCount(100);
        positionFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        positionFilter.setPreferredSize(new java.awt.Dimension(72, 26));
        positionFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionFilterActionPerformed(evt);
            }
        });

        supervisorFilter.setMaximumRowCount(100);
        supervisorFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supervisorFilter.setPreferredSize(new java.awt.Dimension(72, 26));
        supervisorFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisorFilterActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel17.setText(" Position");

        searchField.setMargin(new java.awt.Insets(4, 6, 4, 6));

        jLabel18.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel18.setText("Search by:");

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.setPreferredSize(new java.awt.Dimension(72, 26));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel19.setText("Supervisor");

        jLabel20.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel20.setText("Filter by:");

        jLabel21.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel21.setText("Employee ID");

        jButton2.setText("Add Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout empMgmtPanelLayout = new javax.swing.GroupLayout(empMgmtPanel);
        empMgmtPanel.setLayout(empMgmtPanelLayout);
        empMgmtPanelLayout.setHorizontalGroup(
            empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empMgmtPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(empMgmtPanelLayout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empMgmtPanelLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel20))
                                .addGroup(empMgmtPanelLayout.createSequentialGroup()
                                    .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addGroup(empMgmtPanelLayout.createSequentialGroup()
                                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 104, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(positionFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19)
                                .addComponent(supervisorFilter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        empMgmtPanelLayout.setVerticalGroup(
            empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empMgmtPanelLayout.createSequentialGroup()
                .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empMgmtPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empMgmtPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(supervisorFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        payrollMgmtPanel.setBackground(new java.awt.Color(204, 255, 204));
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

        attendancePanel.setBackground(new java.awt.Color(51, 255, 153));
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

        requestsPanel.setBackground(new java.awt.Color(255, 204, 204));
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

        disputesPanel.setBackground(new java.awt.Color(102, 102, 255));
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

        taxReportsPanel.setBackground(new java.awt.Color(255, 204, 204));
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
         /*String generatedUserID = DatabaseEmployeeDAO.generateUserID();
        // Set the generated user ID in the userIDTxtField
        userIDTxtField.setText("  " + generatedUserID);
    
    }//GEN-LAST:event_generateUserIDBtnActionPerformed

    private void confirmAddUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddUserBtnActionPerformed
                   
    try {
        int employeeId = Integer.parseInt(empIDTxtField.getText()); // Get the employee ID
        String username = userNameTxtField.getText(); // Get the username
        int roleId = Integer.parseInt(roleIDTxtField.getText()); // Get the role ID

        // Check if the password field is empty
        String password = passwordTxtField.getText().trim();
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if password is empty
        }

        // Add the new user to the database
        DatabaseUserDAO dao = new DatabaseUserDAO();
        dao.addUserToDatabase(employeeId, username, password, roleId);

        // Update the table
        refreshTable();

        // Log the user addition action
        UserActionLogger.logUserAddition(employeeId, username);

        // Clear text fields using the utility method
        Utils.clearTextFields(userIDTxtField, empIDTxtField, userNameTxtField, roleIDTxtField, passwordTxtField);

        // Show a message indicating successful addition
        JOptionPane.showMessageDialog(this, "User added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (DatabaseUserDAO.DatabaseException ex) {
        JOptionPane.showMessageDialog(this, "Error adding user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

    private void searchUserIDDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserIDDeleteBtnActionPerformed
        try {
        int userId = Integer.parseInt(userIDTxtField1.getText()); 
        DatabaseUserDAO dao = new DatabaseUserDAO();

        User user = dao.getUserByUserId(userId);

        if (user != null) {
            // Populate the text fields with user data
            userIDTxtField1.setText(String.valueOf(user.getUserId())); 
            empIDTxtField1.setText(String.valueOf(user.getEmployeeId())); 
            userNameTxtField1.setText(user.getUsername()); 
            roleIDTxtField1.setText(String.valueOf(user.getRoleId()));
            
            // Check if the password is being updated by the user
            String password = passwordTxtField1.getText().trim();
            if (!password.isEmpty()) {
                passwordTxtField1.setText(password); // If updated, show the new password
            } else {
                passwordTxtField1.setText("********"); // If not updated, display asterisks
            }
         
        } else {
            JOptionPane.showMessageDialog(this, "User not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid user ID", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (DatabaseUserDAO.DatabaseException ex) {
        JOptionPane.showMessageDialog(this, "Error retrieving user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_searchUserIDDeleteBtnActionPerformed

    private void passwordTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtField1ActionPerformed

    private void roleIDTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleIDTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleIDTxtField1ActionPerformed

    private void confirmDeleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmDeleteUserBtnActionPerformed
       try {
        int userId = Integer.parseInt(userIDTxtField1.getText());

        // Show confirmation dialog with user ID
        int response = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to delete user ID " + userId + "?", 
                "Confirm Delete", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.WARNING_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            DatabaseUserDAO dao = new DatabaseUserDAO();
            dao.deleteUserFromDatabase(userId);

            // Log the user deletion action
            UserActionLogger.logUserDeletion(userId, userNameTxtField1.getText());

            // Refresh the table data after deletion
            refreshTable();

            // Clear text fields
            Utils.clearTextFields(userIDTxtField1, empIDTxtField1, userNameTxtField1, roleIDTxtField1, passwordTxtField1);

            // Show success message
            JOptionPane.showMessageDialog(this, "User deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid user ID", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (DatabaseUserDAO.DatabaseException ex) {
        JOptionPane.showMessageDialog(this, "Error deleting user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }             

    }//GEN-LAST:event_confirmDeleteUserBtnActionPerformed
    private void refreshTable() {
    try {
        if (userTable.getModel() instanceof CustomTableModel) {
            CustomTableModel model = (CustomTableModel) userTable.getModel();
            model.fetchDataFromDatabase("users"); // Fetch updated data from database
        } else {
            throw new IllegalStateException("Table model is not an instance of CustomTableModel");
        }
    } catch (IllegalStateException ex) {
        JOptionPane.showMessageDialog(this, "Error updating table: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    private void userIDTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDTxtField2ActionPerformed

    private void empIDTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIDTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIDTxtField2ActionPerformed

    private void userNameTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtField2ActionPerformed

    private void searchUserIDupdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserIDupdateBtnActionPerformed
      try {
        int userId = Integer.parseInt(userIDTxtField2.getText()); // Assuming userIDTxtField is where user enters the ID
        DatabaseUserDAO dao = new DatabaseUserDAO();

        User user = dao.getUserByUserId(userId);

        if (user != null) {
            // Populate the text fields with user data
            userIDTxtField2.setText(String.valueOf(user.getUserId())); // Assuming userIDTxtField is where user ID is displayed
            empIDTxtField2.setText(String.valueOf(user.getEmployeeId())); // Assuming empIDTxtField is where employee ID is displayed
            userNameTxtField2.setText(user.getUsername()); // Assuming userNameTxtField is where username is displayed
            roleIDTxtField2.setText(String.valueOf(user.getRoleId())); // Assuming roleIDTxtField is where role ID is displayed
            
            // Check if the password is being updated by the user
            String password = passwordTxtField2.getText().trim();
            if (!password.isEmpty()) {
                passwordTxtField2.setText(password); // If updated, show the new password
            } else {
                passwordTxtField2.setText("********"); // If not updated, display asterisks
            }
            
            userIDTxtField2.setEditable(false);
            empIDTxtField2.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(this, "User not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid user ID", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (DatabaseUserDAO.DatabaseException ex) {
        JOptionPane.showMessageDialog(this, "Error retrieving user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_searchUserIDupdateBtnActionPerformed

    private void passwordTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtField2ActionPerformed

    private void roleIDTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleIDTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleIDTxtField2ActionPerformed

    private void confirmUpdateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUpdateUserBtnActionPerformed
                                                
    try {
        int userId = Integer.parseInt(userIDTxtField2.getText()); // Get the user ID
        int employeeId = Integer.parseInt(empIDTxtField2.getText()); // Get the employee ID
        String username = userNameTxtField2.getText(); // Get the username
        int roleId = Integer.parseInt(roleIDTxtField2.getText()); // Get the role ID
        
        // Check if the password is updated by the user
        String password = passwordTxtField2.getText().trim();
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if password is empty
        } else {
            // If password is updated, hash the new password
            password = PasswordHash.hashPassword(password);
        }

        // Update the user
        DatabaseUserDAO dao = new DatabaseUserDAO();
        dao.updateUserInDatabase(new User(userId, employeeId, username, roleId, password));

        // Update the table
        try {
            if (userTable.getModel() instanceof CustomTableModel) {
                CustomTableModel model = (CustomTableModel) userTable.getModel();
                // Update the user table in the UI
                TableUpdater.updateTable(userTable, model, "users");
            } else {
                throw new IllegalStateException("Table model is not an instance of CustomTableModel");
            }
        } catch (IllegalStateException ex) {
            JOptionPane.showMessageDialog(this, "Error updating table: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Clear text fields using the utility method
        Utils.clearTextFields(userIDTxtField2, empIDTxtField2, userNameTxtField2, roleIDTxtField2, passwordTxtField2);

        // Show a message indicating successful update
        JOptionPane.showMessageDialog(this, "User updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (DatabaseUserDAO.DatabaseException ex) {
        JOptionPane.showMessageDialog(this, "Error updating user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (PasswordHash.HashingException ex) {
        JOptionPane.showMessageDialog(this, "Error hashing password: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_confirmUpdateUserBtnActionPerformed
    
    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
      int selectedRow = employeeTable.getSelectedRow();
     if (selectedRow != -1) { // If a row is selected
    int employeeID = (int) employeeTable.getValueAt(selectedRow, 0); // Assuming EmployeeID is the first column
    DatabaseEmployeeDAO databaseEmployeeDAO = new DatabaseEmployeeDAO(); // Initialize the DAO object
    Employee employee = databaseEmployeeDAO.getEmployeeById(employeeID); // Retrieve employee data from the database
    if (employee != null) {
        EmployeeDetails employeeDetails = new EmployeeDetails(employeeID);
        employeeDetails.populateFields(employee); // Populate fields with the retrieved employee data
        employeeDetails.setVisible(true); // Make the EmployeeDetails frame visible
    } else {
        // Handle case where employee is not found
        System.out.println("Employee not found.");
    }
}

    }//GEN-LAST:event_employeeTableMouseClicked

    private void positionFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionFilterActionPerformed
     String position = (String) positionFilter.getSelectedItem();
    ((CustomTableModel) employeeTable.getModel()).filterByColumn("Position", position);
    }//GEN-LAST:event_positionFilterActionPerformed

    private void supervisorFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisorFilterActionPerformed
    String supervisor = (String) supervisorFilter.getSelectedItem();
    ((CustomTableModel) employeeTable.getModel()).filterByColumn("ImmediateSupervisor", supervisor);
    }//GEN-LAST:event_supervisorFilterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // Get the text entered in the search field
      String columnName = "EmployeeID";
      String query = searchField.getText().trim();

      // Perform the search directly on the table model of your employeeTable
      ((CustomTableModel) employeeTable.getModel()).searchData(columnName, query);
      searchField.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton confirmDeleteUserBtn;
    private javax.swing.JButton confirmUpdateUserBtn;
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
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton generateUserIDBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JComboBox<String> positionFilter;
    private javax.swing.JPanel requestsBtn;
    private javax.swing.JPanel requestsPanel;
    private javax.swing.JTextField roleIDTxtField;
    private javax.swing.JTextField roleIDTxtField1;
    private javax.swing.JTextField roleIDTxtField2;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchUserIDDeleteBtn;
    private javax.swing.JButton searchUserIDupdateBtn;
    private javax.swing.JComboBox<String> supervisorFilter;
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
public static JTable createStyledTable(String tableName, String[] columnNames) {
    CustomTableModel model = new CustomTableModel(columnNames);
    model.fetchDataFromDatabase(tableName); // Fetch data from the database
    return model.createStyledTable();
}

}*/