
package UI;

import java.awt.Color;
import javax.swing.JPanel;


public class UI_EmployeeDashboard extends javax.swing.JFrame {

 
   public UI_EmployeeDashboard() {
       initComponents();
        setLocationRelativeTo(null);
       ((RoundedPanelMenu) dashboardBtn).setTargetPanel(DashboardPanel, "Dashboard");
        ((RoundedPanelMenu) profileBtn).setTargetPanel(profilePanel, "Profile");
        ((RoundedPanelMenu) attendanceBtn).setTargetPanel(attendancePanel, "Attendance");
        ((RoundedPanelMenu) taxReportsBtn).setTargetPanel(taxReportsPanel, "Disputes");
        ((RoundedPanelMenu) payslipBtn).setTargetPanel(payslipPanel, "Payslip");
        ((RoundedPanelMenu) selfServiceHubBtn).setTargetPanel(selfServieHubPanel, "Requests");
        ((RoundedPanelMenu) announcementsBtn).setTargetPanel(announcementsPanel, "Tax Reports");

        // Simulate click to show the initial panel
        ((RoundedPanelMenu) dashboardBtn).simulateClick();
 
        
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        motorPHLogo = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        employeeMenuPanel = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        dashboardBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        empMenuLbl1 = new javax.swing.JLabel();
        profileBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        empMenuLbl2 = new javax.swing.JLabel();
        payslipBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        empMenuLbl3 = new javax.swing.JLabel();
        attendanceBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        empMenuLbl4 = new javax.swing.JLabel();
        selfServiceHubBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        empMenuLbl5 = new javax.swing.JLabel();
        taxReportsBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        empMenuLbl6 = new javax.swing.JLabel();
        announcementsBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        empMenuLbl7 = new javax.swing.JLabel();
        logoutBtn = new UI.RoundedPanelMenu(new Color(4,14,163));
        empLogoutLbl = new javax.swing.JLabel();
        DashboardPanel = new javax.swing.JPanel();
        profilePanel = new javax.swing.JPanel();
        payslipPanel = new javax.swing.JPanel();
        attendancePanel = new javax.swing.JPanel();
        selfServieHubPanel = new javax.swing.JPanel();
        taxReportsPanel = new javax.swing.JPanel();
        announcementsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        adminPanel.setBackground(new java.awt.Color(231, 231, 231));
        adminPanel.setMaximumSize(new java.awt.Dimension(1200, 800));
        adminPanel.setPreferredSize(new java.awt.Dimension(1200, 800));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setMaximumSize(new java.awt.Dimension(1200, 145));
        headerPanel.setMinimumSize(new java.awt.Dimension(1200, 145));
        headerPanel.setPreferredSize(new java.awt.Dimension(1200, 145));

        motorPHLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MotorPH-Small.png"))); // NOI18N

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
                .addContainerGap(594, Short.MAX_VALUE))
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

        employeeMenuPanel.setBackground(new java.awt.Color(4, 14, 163));
        employeeMenuPanel.setAlignmentX(0.0F);
        employeeMenuPanel.setAlignmentY(0.0F);
        employeeMenuPanel.setMaximumSize(new java.awt.Dimension(340, 655));
        employeeMenuPanel.setMinimumSize(new java.awt.Dimension(340, 655));
        employeeMenuPanel.setPreferredSize(new java.awt.Dimension(340, 655));

        logoutLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Logout");

        dashboardBtn.setBackground(new java.awt.Color(153, 153, 153));
        // Manually simulate mouse exited event

        // Manually simulate mouse clicked event

        empMenuLbl1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        empMenuLbl1.setForeground(new java.awt.Color(255, 255, 255));
        empMenuLbl1.setText("Dashboard");

        javax.swing.GroupLayout dashboardBtnLayout = new javax.swing.GroupLayout(dashboardBtn);
        dashboardBtn.setLayout(dashboardBtnLayout);
        dashboardBtnLayout.setHorizontalGroup(
            dashboardBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBtnLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(empMenuLbl1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashboardBtnLayout.setVerticalGroup(
            dashboardBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empMenuLbl1)
                .addContainerGap())
        );

        profileBtn.setBackground(new java.awt.Color(153, 153, 153));

        empMenuLbl2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        empMenuLbl2.setForeground(new java.awt.Color(255, 255, 255));
        empMenuLbl2.setText("Profile");

        javax.swing.GroupLayout profileBtnLayout = new javax.swing.GroupLayout(profileBtn);
        profileBtn.setLayout(profileBtnLayout);
        profileBtnLayout.setHorizontalGroup(
            profileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(empMenuLbl2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profileBtnLayout.setVerticalGroup(
            profileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empMenuLbl2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        payslipBtn.setBackground(new java.awt.Color(153, 153, 153));

        empMenuLbl3.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        empMenuLbl3.setForeground(new java.awt.Color(255, 255, 255));
        empMenuLbl3.setText("Payslip");

        javax.swing.GroupLayout payslipBtnLayout = new javax.swing.GroupLayout(payslipBtn);
        payslipBtn.setLayout(payslipBtnLayout);
        payslipBtnLayout.setHorizontalGroup(
            payslipBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payslipBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(empMenuLbl3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        payslipBtnLayout.setVerticalGroup(
            payslipBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, payslipBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empMenuLbl3)
                .addContainerGap())
        );

        attendanceBtn.setBackground(new java.awt.Color(153, 153, 153));

        empMenuLbl4.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        empMenuLbl4.setForeground(new java.awt.Color(255, 255, 255));
        empMenuLbl4.setText("Attendance");

        javax.swing.GroupLayout attendanceBtnLayout = new javax.swing.GroupLayout(attendanceBtn);
        attendanceBtn.setLayout(attendanceBtnLayout);
        attendanceBtnLayout.setHorizontalGroup(
            attendanceBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(empMenuLbl4)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        attendanceBtnLayout.setVerticalGroup(
            attendanceBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendanceBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empMenuLbl4)
                .addContainerGap())
        );

        selfServiceHubBtn.setBackground(new java.awt.Color(153, 153, 153));

        empMenuLbl5.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        empMenuLbl5.setForeground(new java.awt.Color(255, 255, 255));
        empMenuLbl5.setText("Self Service Hub");

        javax.swing.GroupLayout selfServiceHubBtnLayout = new javax.swing.GroupLayout(selfServiceHubBtn);
        selfServiceHubBtn.setLayout(selfServiceHubBtnLayout);
        selfServiceHubBtnLayout.setHorizontalGroup(
            selfServiceHubBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selfServiceHubBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(empMenuLbl5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selfServiceHubBtnLayout.setVerticalGroup(
            selfServiceHubBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selfServiceHubBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empMenuLbl5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        taxReportsBtn.setBackground(new java.awt.Color(153, 153, 153));

        empMenuLbl6.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        empMenuLbl6.setForeground(new java.awt.Color(255, 255, 255));
        empMenuLbl6.setText("Tax reports");

        javax.swing.GroupLayout taxReportsBtnLayout = new javax.swing.GroupLayout(taxReportsBtn);
        taxReportsBtn.setLayout(taxReportsBtnLayout);
        taxReportsBtnLayout.setHorizontalGroup(
            taxReportsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxReportsBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(empMenuLbl6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        taxReportsBtnLayout.setVerticalGroup(
            taxReportsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taxReportsBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empMenuLbl6)
                .addContainerGap())
        );

        announcementsBtn.setBackground(new java.awt.Color(153, 153, 153));

        empMenuLbl7.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        empMenuLbl7.setForeground(new java.awt.Color(255, 255, 255));
        empMenuLbl7.setText("Announcements");

        javax.swing.GroupLayout announcementsBtnLayout = new javax.swing.GroupLayout(announcementsBtn);
        announcementsBtn.setLayout(announcementsBtnLayout);
        announcementsBtnLayout.setHorizontalGroup(
            announcementsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(announcementsBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(empMenuLbl7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        announcementsBtnLayout.setVerticalGroup(
            announcementsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(announcementsBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empMenuLbl7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoutBtn.setBackground(new java.awt.Color(153, 153, 153));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        empLogoutLbl.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        empLogoutLbl.setForeground(new java.awt.Color(255, 255, 255));
        empLogoutLbl.setText("Logout");

        javax.swing.GroupLayout logoutBtnLayout = new javax.swing.GroupLayout(logoutBtn);
        logoutBtn.setLayout(logoutBtnLayout);
        logoutBtnLayout.setHorizontalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutBtnLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(empLogoutLbl)
                .addGap(21, 21, 21))
        );
        logoutBtnLayout.setVerticalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empLogoutLbl)
                .addContainerGap())
        );

        javax.swing.GroupLayout employeeMenuPanelLayout = new javax.swing.GroupLayout(employeeMenuPanel);
        employeeMenuPanel.setLayout(employeeMenuPanelLayout);
        employeeMenuPanelLayout.setHorizontalGroup(
            employeeMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeMenuPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(employeeMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutLabel)
                    .addComponent(dashboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payslipBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attendanceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selfServiceHubBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(taxReportsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(announcementsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        employeeMenuPanelLayout.setVerticalGroup(
            employeeMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeMenuPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payslipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(attendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selfServiceHubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(taxReportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(announcementsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(543, 543, 543)
                .addComponent(logoutLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DashboardPanel.setBackground(new java.awt.Color(240, 243, 252));
        DashboardPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        DashboardPanel.setMinimumSize(new java.awt.Dimension(860, 655));
        DashboardPanel.setPreferredSize(new java.awt.Dimension(860, 655));

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

        profilePanel.setBackground(new java.awt.Color(0, 204, 204));
        profilePanel.setMaximumSize(new java.awt.Dimension(860, 655));
        profilePanel.setMinimumSize(new java.awt.Dimension(860, 655));

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );

        payslipPanel.setBackground(new java.awt.Color(255, 255, 153));
        payslipPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        payslipPanel.setMinimumSize(new java.awt.Dimension(860, 655));

        javax.swing.GroupLayout payslipPanelLayout = new javax.swing.GroupLayout(payslipPanel);
        payslipPanel.setLayout(payslipPanelLayout);
        payslipPanelLayout.setHorizontalGroup(
            payslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        payslipPanelLayout.setVerticalGroup(
            payslipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );

        attendancePanel.setBackground(new java.awt.Color(102, 255, 204));
        attendancePanel.setMaximumSize(new java.awt.Dimension(860, 655));
        attendancePanel.setMinimumSize(new java.awt.Dimension(860, 655));

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

        selfServieHubPanel.setBackground(new java.awt.Color(153, 153, 255));
        selfServieHubPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        selfServieHubPanel.setMinimumSize(new java.awt.Dimension(860, 655));

        javax.swing.GroupLayout selfServieHubPanelLayout = new javax.swing.GroupLayout(selfServieHubPanel);
        selfServieHubPanel.setLayout(selfServieHubPanelLayout);
        selfServieHubPanelLayout.setHorizontalGroup(
            selfServieHubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        selfServieHubPanelLayout.setVerticalGroup(
            selfServieHubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );

        taxReportsPanel.setBackground(new java.awt.Color(102, 153, 255));
        taxReportsPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        taxReportsPanel.setMinimumSize(new java.awt.Dimension(860, 655));

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

        announcementsPanel.setBackground(new java.awt.Color(255, 0, 204));
        announcementsPanel.setMaximumSize(new java.awt.Dimension(860, 655));
        announcementsPanel.setMinimumSize(new java.awt.Dimension(860, 655));

        javax.swing.GroupLayout announcementsPanelLayout = new javax.swing.GroupLayout(announcementsPanel);
        announcementsPanel.setLayout(announcementsPanelLayout);
        announcementsPanelLayout.setHorizontalGroup(
            announcementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        announcementsPanelLayout.setVerticalGroup(
            announcementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addComponent(employeeMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payslipPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attendancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selfServieHubPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxReportsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(announcementsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addComponent(DashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(announcementsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxReportsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selfServieHubPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attendancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payslipPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(employeeMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16460, 16460, 16460))
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

   
     public void openEmployeeDashboard() {
         this.setVisible(true);
     }
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JPanel announcementsBtn;
    private javax.swing.JPanel announcementsPanel;
    private javax.swing.JPanel attendanceBtn;
    private javax.swing.JPanel attendancePanel;
    private javax.swing.JPanel dashboardBtn;
    private javax.swing.JLabel empLogoutLbl;
    private javax.swing.JLabel empMenuLbl1;
    private javax.swing.JLabel empMenuLbl2;
    private javax.swing.JLabel empMenuLbl3;
    private javax.swing.JLabel empMenuLbl4;
    private javax.swing.JLabel empMenuLbl5;
    private javax.swing.JLabel empMenuLbl6;
    private javax.swing.JLabel empMenuLbl7;
    private javax.swing.JPanel employeeMenuPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel motorPHLogo;
    private javax.swing.JPanel payslipBtn;
    private javax.swing.JPanel payslipPanel;
    private javax.swing.JPanel profileBtn;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPanel selfServiceHubBtn;
    private javax.swing.JPanel selfServieHubPanel;
    private javax.swing.JPanel taxReportsBtn;
    private javax.swing.JPanel taxReportsPanel;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panelToShow, String headerText) {
        PanelSwitcher.showPanel(panelToShow, headerText, HeaderLabel, 
            DashboardPanel, payslipPanel, attendancePanel, taxReportsPanel, profilePanel, selfServieHubPanel, announcementsPanel);
    }

}

