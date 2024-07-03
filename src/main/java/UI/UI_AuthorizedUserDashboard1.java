
package UI;


import java.awt.Color;
import javax.swing.JPanel;
import authentication.AuthenticateUser;
import authentication.AuthenticationService;
import authentication.LoginController;
import DatabaseConnection.*;
import DatabaseConnection.DatabaseUserDAO.DatabaseException;
import static DatabaseConnection.DatabaseUtility.fetchDataAndCreateTableModel;
import PayrollSystem.UserActionLogger;
import PayrollSystem.Utils;
import entities.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class UI_AuthorizedUserDashboard1 extends javax.swing.JFrame {
    private int loggedInUserId;
    private LoginController loginController;
    private EmployeeDAO employeeDAO;
    private DatabaseUserDAO userDAO = new DatabaseUserDAO();
    private CustomTableModel customTableModel; 
    
    
   
    
    
 
 
   public UI_AuthorizedUserDashboard1(int loggedInUserId) {
       this.loggedInUserId = loggedInUserId;
        initComponents();
        setLocationRelativeTo(null);
        initializeDependencies();
        displayUserInfo(loggedInUserId);
        addUserPanel.setVisible(true); // Set the panel visible
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
        addUserBtn = new javax.swing.JButton();
        addUserPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        empIDTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userNameTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        roleIDTxtField = new javax.swing.JTextField();
        confirmAddUserBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable1 = new javax.swing.JTable();
        empMgmtPanel = new javax.swing.JPanel();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        employeeTable1 = new JTable();
        payrollMgmtPanel = new javax.swing.JPanel();
        attendancePanel = new javax.swing.JPanel();
        requestsPanel = new javax.swing.JPanel();
        disputesPanel = new javax.swing.JPanel();
        taxReportsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        addUserPanel.setBackground(new java.awt.Color(255, 255, 255));

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
                        .addComponent(jLabel5)
                        .addGap(99, 99, 99)
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(15, 15, 15)
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        userMgmtPanel.add(addUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 720, 160));

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User ID", "Employee ID", "Username", "Password", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(userTable1);

        userMgmtPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 720, 400));

        empMgmtPanel.setBackground(new java.awt.Color(240, 243, 252));
        empMgmtPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        empMgmtPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        empMgmtPanel.setVerifyInputWhenFocusTarget(false);

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

        jScrollPane3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        employeeTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User ID", "Employee ID", "Username", "Password", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTable1.getTableHeader().setResizingAllowed(false);
        employeeTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(employeeTable1);

        javax.swing.GroupLayout empMgmtPanelLayout = new javax.swing.GroupLayout(empMgmtPanel);
        empMgmtPanel.setLayout(empMgmtPanelLayout);
        empMgmtPanelLayout.setHorizontalGroup(
            empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empMgmtPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(empMgmtPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empMgmtPanelLayout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addComponent(jLabel20))
                            .addGroup(empMgmtPanelLayout.createSequentialGroup()
                                .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addGroup(empMgmtPanelLayout.createSequentialGroup()
                                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(104, 104, 104)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(positionFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(empMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(supervisorFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        addUserBtn.addMouseListener(new ButtonMouseAdapter());
        addUserPanel.setVisible(true);
       
    }//GEN-LAST:event_addUserBtnActionPerformed
    private void refreshTable() {
    try {
        if (userTable1.getModel() instanceof CustomTableModel) {
            CustomTableModel model = (CustomTableModel) userTable1.getModel();
            model.fetchDataFromDatabase("users"); // Fetch updated data from database
        } else {
            throw new IllegalStateException("Table model is not an instance of CustomTableModel");
        }
    } catch (IllegalStateException ex) {
        JOptionPane.showMessageDialog(this, "Error updating table: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}   
    
     private void populateUserTable() throws DatabaseException {
        // Example column names
        String[] columnNames = {"UserID", "EmployeeID", "Username", "UserPassword", "Role"};

        // Initialize the JTable
        employeeTable1 = new JTable();

        // Fetch data and create table model
        DefaultTableModel model = fetchDataAndCreateTableModel("users", columnNames, true);
        // Set the model to your JTable
        employeeTable1.setModel(model);
    }
    private void positionFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionFilterActionPerformed
     String position = (String) positionFilter.getSelectedItem();
    ((CustomTableModel) employeeTable1.getModel()).filterByColumn("Position", position);
    }//GEN-LAST:event_positionFilterActionPerformed

    private void supervisorFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisorFilterActionPerformed
    String supervisor = (String) supervisorFilter.getSelectedItem();
    ((CustomTableModel) employeeTable1.getModel()).filterByColumn("ImmediateSupervisor", supervisor);
    }//GEN-LAST:event_supervisorFilterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // Get the text entered in the search field
      String columnName = "EmployeeID";
      String query = searchField.getText().trim();

      // Perform the search directly on the table model of your employeeTable
      ((CustomTableModel) employeeTable1.getModel()).searchData(columnName, query);
      searchField.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            Utils.clearTextFields(empIDTxtField, userNameTxtField, roleIDTxtField, passwordTxtField);

            // Show a message indicating successful addition
            JOptionPane.showMessageDialog(this, "User added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (DatabaseUserDAO.DatabaseException ex) {
            JOptionPane.showMessageDialog(this, "Error adding user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmAddUserBtnActionPerformed

    private void roleIDTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleIDTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleIDTxtFieldActionPerformed

    private void passwordTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtFieldActionPerformed

    private void userNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtFieldActionPerformed

    private void empIDTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIDTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIDTxtFieldActionPerformed

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
            Logger.getLogger(UI_AuthorizedUserDashboard1.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
     public void openAuthorizedUserDashboard() {
        // Create an instance of UI_Admin
        UI_AuthorizedUserDashboard1 adminDashboard = new UI_AuthorizedUserDashboard1(loggedInUserId);

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
    private javax.swing.JPanel dashboardBtn;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel disputesBtn;
    private javax.swing.JPanel disputesPanel;
    private javax.swing.JTextField empIDTxtField;
    private javax.swing.JPanel empMgmtPanel;
    private javax.swing.JPanel employeeMgmtBtn;
    private javax.swing.JTable employeeTable1;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel loggedInUserName;
    private javax.swing.JLabel loggedInUserPosition;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel motorPHLogo;
    private javax.swing.JTextField passwordTxtField;
    private javax.swing.JPanel payrollMgmtBtn;
    private javax.swing.JPanel payrollMgmtPanel;
    private javax.swing.JComboBox<String> positionFilter;
    private javax.swing.JPanel requestsBtn;
    private javax.swing.JPanel requestsPanel;
    private javax.swing.JTextField roleIDTxtField;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> supervisorFilter;
    private javax.swing.JPanel taxReportsBtn;
    private javax.swing.JPanel taxReportsPanel;
    private javax.swing.JPanel userMgmtBtn;
    private javax.swing.JPanel userMgmtPanel;
    private javax.swing.JTextField userNameTxtField;
    private javax.swing.JTable userTable1;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panelToShow, String headerText) {
        PanelSwitcher.showPanel(panelToShow, headerText, HeaderLabel, 
            dashboardPanel, empMgmtPanel, userMgmtPanel, attendancePanel, disputesPanel, payrollMgmtPanel, requestsPanel, taxReportsPanel);
    }

}