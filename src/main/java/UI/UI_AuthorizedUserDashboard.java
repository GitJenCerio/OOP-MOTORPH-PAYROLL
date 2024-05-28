
package UI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;


public class UI_AuthorizedUserDashboard extends javax.swing.JFrame {

 
   public UI_AuthorizedUserDashboard() {
       initComponents();
        setLocationRelativeTo(null);
       ((RoundedPanel) dashboardBtn).setTargetPanel(DashboardPanel, "Dashboard");
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
        DashboardPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        motorPHLogo = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        empMgmtPanel = new javax.swing.JPanel();
        payrollMgmtPanel = new javax.swing.JPanel();
        attendancePanel = new javax.swing.JPanel();
        requestsPanel = new javax.swing.JPanel();
        disputesPanel = new javax.swing.JPanel();
        taxReportsPanel = new javax.swing.JPanel();
        userMgmtPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();

        String tableName = "users";
        CustomTableModel userModel = new CustomTableModel(tableName);
        usersTable.setModel(userModel);

        // Apply the custom cell renderer
        CustomTableCellRenderer cellRenderer = new CustomTableCellRenderer();
        usersTable.setDefaultRenderer(Object.class, cellRenderer);

        // Set table header to use the custom renderer
        JTableHeader header = usersTable.getTableHeader();
        header.setDefaultRenderer(cellRenderer);

        // Set table background to white (alternating colors handled in renderer)
        usersTable.setBackground(Color.WHITE);

        // Remove grid lines
        usersTable.setShowGrid(false);

        // Remove table borders
        usersTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        usersTable.setRowMargin(0);

        // Set table font
        usersTable.setFont(new java.awt.Font("Poppins", 0, 12));

        // Set selection colors
        usersTable.setSelectionBackground(new java.awt.Color(174, 203, 255));
        usersTable.setSelectionForeground(new java.awt.Color(255, 255, 255))

        ;

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
                        .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payrollMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disputesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxReportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );
        adminMenuPanelLayout.setVerticalGroup(
            adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeeMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(payrollMgmtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(attendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(requestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(disputesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(taxReportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(488, 488, 488)
                .addComponent(logoutLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGap(0, 655, Short.MAX_VALUE)
        );

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setMaximumSize(new java.awt.Dimension(1200, 145));
        headerPanel.setPreferredSize(new java.awt.Dimension(1200, 145));

        motorPHLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\OOP-MotorPH\\src\\main\\java\\icons\\MotorPH (4).png")); // NOI18N

        HeaderLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 36)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(0, 0, 163));
        HeaderLabel.setText("Dashboard");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(motorPHLogo)
                .addGap(150, 150, 150)
                .addComponent(HeaderLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(motorPHLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HeaderLabel)
                .addGap(41, 41, 41))
        );

        empMgmtPanel.setBackground(new java.awt.Color(0, 102, 102));
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
            .addGap(0, 655, Short.MAX_VALUE)
        );

        payrollMgmtPanel.setBackground(new java.awt.Color(102, 204, 0));
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
            .addGap(0, 655, Short.MAX_VALUE)
        );

        attendancePanel.setBackground(new java.awt.Color(255, 51, 51));
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
            .addGap(0, 655, Short.MAX_VALUE)
        );

        requestsPanel.setBackground(new java.awt.Color(255, 153, 255));
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
            .addGap(0, 655, Short.MAX_VALUE)
        );

        disputesPanel.setBackground(new java.awt.Color(204, 255, 204));
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
            .addGap(0, 655, Short.MAX_VALUE)
        );

        taxReportsPanel.setBackground(new java.awt.Color(255, 255, 51));
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
            .addGap(0, 655, Short.MAX_VALUE)
        );

        userMgmtPanel.setBackground(new java.awt.Color(0, 204, 204));
        userMgmtPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        userMgmtPanel.setPreferredSize(new java.awt.Dimension(860, 655));
        userMgmtPanel.setVerifyInputWhenFocusTarget(false);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(usersTable);

        javax.swing.GroupLayout userMgmtPanelLayout = new javax.swing.GroupLayout(userMgmtPanel);
        userMgmtPanel.setLayout(userMgmtPanelLayout);
        userMgmtPanelLayout.setHorizontalGroup(
            userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userMgmtPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        userMgmtPanelLayout.setVerticalGroup(
            userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userMgmtPanelLayout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addComponent(adminMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payrollMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attendancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disputesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxReportsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addComponent(DashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disputesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxReportsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(requestsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attendancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payrollMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(adminMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(adminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_AuthorizedUserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_AuthorizedUserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_AuthorizedUserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_AuthorizedUserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_AuthorizedUserDashboard().setVisible(true);
            }
        });
    }
    
     public void openAuthorizedUserDashboard() {
        // Create an instance of UI_Admin
        UI_AuthorizedUserDashboard adminDashboard = new UI_AuthorizedUserDashboard();

        // Make the UI_Admin visible
        adminDashboard.setVisible(true);
    }
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JLabel HeaderLabel;
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
    private javax.swing.JPanel disputesBtn;
    private javax.swing.JPanel disputesPanel;
    private javax.swing.JPanel empMgmtPanel;
    private javax.swing.JPanel employeeMgmtBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel motorPHLogo;
    private javax.swing.JPanel payrollMgmtBtn;
    private javax.swing.JPanel payrollMgmtPanel;
    private javax.swing.JPanel requestsBtn;
    private javax.swing.JPanel requestsPanel;
    private javax.swing.JPanel taxReportsBtn;
    private javax.swing.JPanel taxReportsPanel;
    private javax.swing.JPanel userMgmtBtn;
    private javax.swing.JPanel userMgmtPanel;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panelToShow, String headerText) {
        PanelSwitcher.showPanel(panelToShow, headerText, HeaderLabel, 
            DashboardPanel, empMgmtPanel, userMgmtPanel, attendancePanel, disputesPanel, payrollMgmtPanel, requestsPanel, taxReportsPanel);
    }

  
    
    
}