
package UI;


import java.awt.Color;
import javax.swing.JPanel;
import authentication.AuthenticateUser;
import authentication.AuthenticationService;
import authentication.LoginController;
import DatabaseConnection.*;
import entities.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class UI_AuthorizedUserDashboard extends javax.swing.JFrame {
    private int loggedInUserId;
    private LoginController loginController;
    private EmployeeDAO employeeDAO;
 
    
   
    


 
   public UI_AuthorizedUserDashboard(int loggedInUserId) {
       this.loggedInUserId = loggedInUserId;
        initComponents();
        setLocationRelativeTo(null);
        initializeDependencies();
        displayUserInfo(loggedInUserId);
        
        
       ((RoundedPanel) dashboardBtn).setTargetPanel(DashboardPanel, "Dashboard");
        ((RoundedPanel) employeeMgmtBtn).setTargetPanel(empMgmtPanel, "Employee Management");
        ((RoundedPanel) attendanceBtn).setTargetPanel(attendancePanel, "Attendance");
        ((RoundedPanel) disputesBtn).setTargetPanel(disputesPanel, "Disputes");
        ((RoundedPanel) payrollMgmtBtn).setTargetPanel(payrollMgmtPanel, "Payroll Management");
        ((RoundedPanel) requestsBtn).setTargetPanel(requestsPanel, "Requests");
        ((RoundedPanel) taxReportsBtn).setTargetPanel(taxReportsPanel, "Tax Reports");
        ((RoundedPanel) userMgmtBtn).setTargetPanel(UserMgmtPanel, "User Management");

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
        DashboardPanel = new javax.swing.JPanel();
        UserMgmtPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable =  createStyledTable("Users");
        updateUserBtn = new javax.swing.JButton();
        deleteUserBtn = new javax.swing.JButton();
        addUserBtn = new javax.swing.JButton();
        userIDTxtField = new javax.swing.JTextField();
        passwordTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        empIDTxtField = new javax.swing.JTextField();
        userNameTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        roleIDTxtField = new javax.swing.JTextField();
        generateUserIDBtn = new javax.swing.JButton();
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

        DashboardPanel.setBackground(new java.awt.Color(240, 243, 252));
        DashboardPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        DashboardPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        DashboardPanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout DashboardPanelLayout = new javax.swing.GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        DashboardPanelLayout.setVerticalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        UserMgmtPanel.setBackground(new java.awt.Color(240, 243, 252));
        UserMgmtPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        UserMgmtPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        UserMgmtPanel.setVerifyInputWhenFocusTarget(false);

        jScrollPane1.setBackground(Color.WHITE);
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportView(userTable);

        updateUserBtn.setBackground(new java.awt.Color(45, 51, 241));
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

        deleteUserBtn.setBackground(new java.awt.Color(45, 51, 241));
        deleteUserBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        deleteUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-delete-user-24 (1).png"))); // NOI18N
        deleteUserBtn.setText("Delete User");
        deleteUserBtn.setMaximumSize(new java.awt.Dimension(164, 31));
        deleteUserBtn.setMinimumSize(new java.awt.Dimension(164, 31));
        deleteUserBtn.setPreferredSize(new java.awt.Dimension(164, 31));

        addUserBtn.setBackground(new java.awt.Color(45, 51, 241));
        addUserBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        addUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        addUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-add-user-24.png"))); // NOI18N
        addUserBtn.setText("Add User");
        addUserBtn.setMaximumSize(new java.awt.Dimension(164, 31));
        addUserBtn.setMinimumSize(new java.awt.Dimension(164, 31));
        addUserBtn.setName(""); // NOI18N
        addUserBtn.setPreferredSize(new java.awt.Dimension(164, 31));
        addUserBtn.setRolloverEnabled(false);
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        userIDTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTxtFieldActionPerformed(evt);
            }
        });

        passwordTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setText("Username");

        empIDTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDTxtFieldActionPerformed(evt);
            }
        });

        userNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setText("User ID");

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setText("Employee ID");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setText("Password");

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setText("Role ID");

        roleIDTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleIDTxtFieldActionPerformed(evt);
            }
        });

        generateUserIDBtn.setBackground(new java.awt.Color(45, 51, 241));
        generateUserIDBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
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

        javax.swing.GroupLayout UserMgmtPanelLayout = new javax.swing.GroupLayout(UserMgmtPanel);
        UserMgmtPanel.setLayout(UserMgmtPanelLayout);
        UserMgmtPanelLayout.setHorizontalGroup(
            UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserMgmtPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(70, 70, 70))
                    .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                        .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                                .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(userIDTxtField)
                                        .addComponent(addUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4))
                                .addGap(25, 25, 25))
                            .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                                    .addComponent(empIDTxtField)
                                    .addGap(25, 25, 25))))
                        .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                                .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(25, 25, 25)
                                .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                                        .addComponent(roleIDTxtField)
                                        .addGap(70, 70, 70))))
                            .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                                .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(generateUserIDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(252, Short.MAX_VALUE))))))
        );
        UserMgmtPanelLayout.setVerticalGroup(
            UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserMgmtPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(generateUserIDBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(userIDTxtField))
                .addGap(18, 18, 18)
                .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addComponent(empIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                        .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(3, 3, 3)
                        .addGroup(UserMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(UserMgmtPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(3, 3, 3)
                        .addComponent(roleIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

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
                                .addComponent(DashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adminPanelLayout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(DashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
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
                        .addComponent(UserMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)))
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
          showPanel(DashboardPanel, "Dashboard");
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
        // TODO add your handling code here:
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
        userIDTxtField.setText(generatedUserID);
    
    }//GEN-LAST:event_generateUserIDBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        
       
    }//GEN-LAST:event_addUserBtnActionPerformed

private void initializeDependencies() {
        AuthenticationService authenticationService = new AuthenticateUser();
        this.employeeDAO = new DatabaseEmployeeDAO();
        this.loginController = new LoginController(authenticationService, employeeDAO);
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
    
     public void openAuthorizedUserDashboard() {
        // Create an instance of UI_Admin
        UI_AuthorizedUserDashboard adminDashboard = new UI_AuthorizedUserDashboard(loggedInUserId);

        // Make the UI_Admin visible
        adminDashboard.setVisible(true);
    }
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JPanel UserMgmtPanel;
    private javax.swing.JButton addUserBtn;
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
    private javax.swing.JPanel dashboardBtn;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JPanel disputesBtn;
    private javax.swing.JPanel disputesPanel;
    private javax.swing.JTextField empIDTxtField;
    private javax.swing.JPanel empMgmtPanel;
    private javax.swing.JPanel employeeMgmtBtn;
    private javax.swing.JButton generateUserIDBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loggedInUserName;
    private javax.swing.JLabel loggedInUserPosition;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel motorPHLogo;
    private javax.swing.JTextField passwordTxtField;
    private javax.swing.JPanel payrollMgmtBtn;
    private javax.swing.JPanel payrollMgmtPanel;
    private javax.swing.JPanel requestsBtn;
    private javax.swing.JPanel requestsPanel;
    private javax.swing.JTextField roleIDTxtField;
    private javax.swing.JPanel taxReportsBtn;
    private javax.swing.JPanel taxReportsPanel;
    private javax.swing.JButton updateUserBtn;
    private javax.swing.JTextField userIDTxtField;
    private javax.swing.JPanel userMgmtBtn;
    private javax.swing.JTextField userNameTxtField;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panelToShow, String headerText) {
        PanelSwitcher.showPanel(panelToShow, headerText, HeaderLabel, 
            DashboardPanel, empMgmtPanel, UserMgmtPanel, attendancePanel, disputesPanel, payrollMgmtPanel, requestsPanel, taxReportsPanel);
    }
    public static JTable createStyledTable(String tableName) {
    CustomTableModel model = new CustomTableModel(tableName);
    return model.createStyledTable();
    

  
    }

}