
package UI;

import DatabaseConnection.DatabaseEmployeeDAO;
import entities.Employee;
import java.text.SimpleDateFormat;


public class EmployeeDetails extends javax.swing.JFrame {
     private DatabaseEmployeeDAO databaseEmployeeDAO;

    public EmployeeDetails(int employeeID) {
        initComponents();
        setLocationRelativeTo(null);
        databaseEmployeeDAO = new DatabaseEmployeeDAO();
  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeeDetailsPanel = new javax.swing.JPanel();
        jPanel1 = new RoundedPanel(20);
        jLabel2 = new javax.swing.JLabel();
        LastNameLbl = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        firstNameLbl = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        birthdayLbl = new javax.swing.JLabel();
        birthdayField = new javax.swing.JTextField();
        addressLbl = new javax.swing.JLabel();
        phoneNumberLbl = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        updatePersonalInfoBtn = new javax.swing.JButton();
        confirmPersonalInforBtn = new javax.swing.JButton();
        addressField = new javax.swing.JTextArea();
        jPanel2 = new RoundedPanel(20);
        jLabel1 = new javax.swing.JLabel();
        sssNumberLbl = new javax.swing.JLabel();
        sssNumberField = new javax.swing.JTextField();
        philhealthNumbeLbl = new javax.swing.JLabel();
        philhealthNumberField = new javax.swing.JTextField();
        pagibigNumberLbl = new javax.swing.JLabel();
        pagibigNumberField = new javax.swing.JTextField();
        tinNumberLBl = new javax.swing.JLabel();
        tinNumberField = new javax.swing.JTextField();
        statusLbl = new javax.swing.JLabel();
        statusField = new javax.swing.JTextField();
        positionLbl = new javax.swing.JLabel();
        positionField = new javax.swing.JTextField();
        supervisorLbl = new javax.swing.JLabel();
        supervisorField = new javax.swing.JTextField();
        confirmEmploymentInfoBtn = new javax.swing.JButton();
        updateEmploymentInfoBtn = new javax.swing.JButton();
        jPanel3 = new RoundedPanel(20);
        jLabel8 = new javax.swing.JLabel();
        basicSalaryLbl = new javax.swing.JLabel();
        basicSalaryField = new javax.swing.JTextField();
        riceSubsidyLbl = new javax.swing.JLabel();
        riceSubsidyField = new javax.swing.JTextField();
        phoneAllowanceLbl = new javax.swing.JLabel();
        phoneAllowanceField = new javax.swing.JTextField();
        clothingAllowanceLbl = new javax.swing.JLabel();
        clothingAllowanceField = new javax.swing.JTextField();
        grossSemiMonthlyRateLbl = new javax.swing.JLabel();
        grossSemiMonthlyRateField = new javax.swing.JTextField();
        hourlyRateLbl = new javax.swing.JLabel();
        hourlyRateField = new javax.swing.JTextField();
        confirmSalaryInfoBtn = new javax.swing.JButton();
        updateSalaryInfoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 800));
        setMinimumSize(new java.awt.Dimension(700, 800));
        setPreferredSize(new java.awt.Dimension(700, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeDetailsPanel.setBackground(new java.awt.Color(231, 237, 255));
        employeeDetailsPanel.setMaximumSize(new java.awt.Dimension(700, 800));
        employeeDetailsPanel.setMinimumSize(new java.awt.Dimension(700, 800));
        employeeDetailsPanel.setName(""); // NOI18N
        employeeDetailsPanel.setPreferredSize(new java.awt.Dimension(700, 800));
        employeeDetailsPanel.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 400));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 86, 222));
        jLabel2.setText("Personal Information");

        LastNameLbl.setText("Last Name:");

        lastNameField.setText("jTextField1");

        firstNameLbl.setText("First Name");

        firstNameField.setText("jTextField1");

        birthdayLbl.setText("Birthday:");

        birthdayField.setText("jTextField1");

        addressLbl.setText("Address:");

        phoneNumberLbl.setText("Phone Number:");

        phoneNumberField.setText("jTextField1");

        updatePersonalInfoBtn.setBackground(new java.awt.Color(51, 153, 255));
        updatePersonalInfoBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        updatePersonalInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        updatePersonalInfoBtn.setText("Update");
        updatePersonalInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePersonalInfoBtnActionPerformed(evt);
            }
        });

        confirmPersonalInforBtn.setBackground(new java.awt.Color(255, 102, 102));
        confirmPersonalInforBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        confirmPersonalInforBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmPersonalInforBtn.setText("Confirm");
        confirmPersonalInforBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPersonalInforBtnActionPerformed(evt);
            }
        });

        addressField.setColumns(20);
        addressField.setLineWrap(true);
        addressField.setRows(5);
        addressField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addressField.setLineWrap(true);

        addressField.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LastNameLbl)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(firstNameLbl)))
                            .addComponent(birthdayLbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(updatePersonalInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmPersonalInforBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(phoneNumberLbl))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addressLbl)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LastNameLbl)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLbl)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdayLbl)
                            .addComponent(addressLbl)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberLbl)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePersonalInfoBtn)
                    .addComponent(confirmPersonalInforBtn))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(680, 200));
        jPanel2.setMinimumSize(new java.awt.Dimension(680, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(680, 200));
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 86, 222));
        jLabel1.setText("Employment Information");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, -1));

        sssNumberLbl.setText("SSS Number:");
        jPanel2.add(sssNumberLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 60, -1, -1));

        sssNumberField.setText("jTextField1");
        jPanel2.add(sssNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 57, 176, -1));

        philhealthNumbeLbl.setText("Philhealth Number");
        jPanel2.add(philhealthNumbeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 91, -1, -1));

        philhealthNumberField.setText("jTextField1");
        jPanel2.add(philhealthNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 88, 176, -1));

        pagibigNumberLbl.setText("Pag-ibig Nunber:");
        jPanel2.add(pagibigNumberLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 122, -1, -1));

        pagibigNumberField.setText("jTextField1");
        jPanel2.add(pagibigNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 119, 176, -1));

        tinNumberLBl.setText("Tin Number");
        jPanel2.add(tinNumberLBl, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 159, -1, -1));

        tinNumberField.setText("jTextField1");
        jPanel2.add(tinNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 156, 176, -1));

        statusLbl.setText("Status");
        jPanel2.add(statusLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 60, -1, -1));

        statusField.setText("jTextField1");
        jPanel2.add(statusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 57, 165, -1));

        positionLbl.setText("Position");
        jPanel2.add(positionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 91, -1, -1));

        positionField.setText("jTextField1");
        jPanel2.add(positionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 88, 165, -1));

        supervisorLbl.setText("Supervsor");
        jPanel2.add(supervisorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 122, -1, -1));

        supervisorField.setText("jTextField1");
        jPanel2.add(supervisorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 119, 165, -1));

        confirmEmploymentInfoBtn.setBackground(new java.awt.Color(255, 102, 102));
        confirmEmploymentInfoBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        confirmEmploymentInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmEmploymentInfoBtn.setText("Confirm");
        confirmEmploymentInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEmploymentInfoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(confirmEmploymentInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 196, 173, -1));

        updateEmploymentInfoBtn.setBackground(new java.awt.Color(51, 153, 255));
        updateEmploymentInfoBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        updateEmploymentInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateEmploymentInfoBtn.setText("Update");
        updateEmploymentInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmploymentInfoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateEmploymentInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 196, 176, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(680, 200));
        jPanel3.setMinimumSize(new java.awt.Dimension(680, 200));
        jPanel3.setVerifyInputWhenFocusTarget(false);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 86, 222));
        jLabel8.setText("Salary Information");

        basicSalaryLbl.setText("Basic Salary:");

        basicSalaryField.setText("jTextField1");

        riceSubsidyLbl.setText("Rice Subsidy");

        riceSubsidyField.setText("jTextField1");

        phoneAllowanceLbl.setText("Phone Allowance");

        phoneAllowanceField.setText("jTextField1");

        clothingAllowanceLbl.setText("Clothing Allowance");

        clothingAllowanceField.setText("jTextField1");

        grossSemiMonthlyRateLbl.setText("Gross Semi-Monthly Rate");

        grossSemiMonthlyRateField.setText("jTextField1");

        hourlyRateLbl.setText("Hourly Rate");

        hourlyRateField.setText("jTextField1");

        confirmSalaryInfoBtn.setBackground(new java.awt.Color(255, 102, 102));
        confirmSalaryInfoBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        confirmSalaryInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmSalaryInfoBtn.setText("Confirm");
        confirmSalaryInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmSalaryInfoBtnActionPerformed(evt);
            }
        });

        updateSalaryInfoBtn.setBackground(new java.awt.Color(51, 153, 255));
        updateSalaryInfoBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        updateSalaryInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateSalaryInfoBtn.setText("Update");
        updateSalaryInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSalaryInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(basicSalaryLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(riceSubsidyLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneAllowanceLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clothingAllowanceLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneAllowanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(riceSubsidyField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hourlyRateLbl)
                                    .addGap(18, 18, 18)
                                    .addComponent(hourlyRateField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(basicSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(grossSemiMonthlyRateLbl)
                                    .addGap(18, 18, 18)
                                    .addComponent(grossSemiMonthlyRateField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(updateSalaryInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(clothingAllowanceField))
                                .addGap(18, 18, 18)
                                .addComponent(confirmSalaryInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basicSalaryLbl)
                    .addComponent(basicSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grossSemiMonthlyRateLbl)
                    .addComponent(grossSemiMonthlyRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(riceSubsidyLbl)
                    .addComponent(riceSubsidyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyRateLbl)
                    .addComponent(hourlyRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneAllowanceLbl)
                    .addComponent(phoneAllowanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothingAllowanceLbl)
                    .addComponent(clothingAllowanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmSalaryInfoBtn)
                    .addComponent(updateSalaryInfoBtn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout employeeDetailsPanelLayout = new javax.swing.GroupLayout(employeeDetailsPanel);
        employeeDetailsPanel.setLayout(employeeDetailsPanelLayout);
        employeeDetailsPanelLayout.setHorizontalGroup(
            employeeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeDetailsPanelLayout.createSequentialGroup()
                .addGroup(employeeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(employeeDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, employeeDetailsPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(employeeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        employeeDetailsPanelLayout.setVerticalGroup(
            employeeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeDetailsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(employeeDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void populateFields(Employee employee) {
        lastNameField.setText(employee.getLastName());
        firstNameField.setText(employee.getFirstName());

        // Format the birthday
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        String formattedBirthday = dateFormat.format(employee.getBirthday());
        birthdayField.setText(formattedBirthday);

        addressField.setText(employee.getAddress());
        phoneNumberField.setText(employee.getPhoneNumber());
        sssNumberField.setText(employee.getSssNumber());
        philhealthNumberField.setText(employee.getPhilHealthNumber());
        tinNumberField.setText(employee.getTinNumber());
        pagibigNumberField.setText(employee.getPagIbigNumber());
        statusField.setText(employee.getEmpStatus());
        positionField.setText(employee.getPosition());
        supervisorField.setText(employee.getImmediateSupervisor());
        basicSalaryField.setText(String.valueOf(employee.getBasicSalary()));
        riceSubsidyField.setText(String.valueOf(employee.getRiceSubsidy()));
        phoneAllowanceField.setText(String.valueOf(employee.getPhoneAllowance()));
        clothingAllowanceField.setText(String.valueOf(employee.getClothingAllowance()));
        grossSemiMonthlyRateField.setText(String.valueOf(employee.getGrossSemiMonthlyRate()));
        hourlyRateField.setText(String.valueOf(employee.getHourlyRate()));
}


    private void updatePersonalInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePersonalInfoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePersonalInfoBtnActionPerformed

    private void confirmPersonalInforBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPersonalInforBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPersonalInforBtnActionPerformed

    private void updateEmploymentInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmploymentInfoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEmploymentInfoBtnActionPerformed

    private void confirmEmploymentInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEmploymentInfoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmEmploymentInfoBtnActionPerformed

    private void updateSalaryInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSalaryInfoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateSalaryInfoBtnActionPerformed

    private void confirmSalaryInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmSalaryInfoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmSalaryInfoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastNameLbl;
    private javax.swing.JTextArea addressField;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField basicSalaryField;
    private javax.swing.JLabel basicSalaryLbl;
    private javax.swing.JTextField birthdayField;
    private javax.swing.JLabel birthdayLbl;
    private javax.swing.JTextField clothingAllowanceField;
    private javax.swing.JLabel clothingAllowanceLbl;
    private javax.swing.JButton confirmEmploymentInfoBtn;
    private javax.swing.JButton confirmPersonalInforBtn;
    private javax.swing.JButton confirmSalaryInfoBtn;
    private javax.swing.JPanel employeeDetailsPanel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField grossSemiMonthlyRateField;
    private javax.swing.JLabel grossSemiMonthlyRateLbl;
    private javax.swing.JTextField hourlyRateField;
    private javax.swing.JLabel hourlyRateLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField pagibigNumberField;
    private javax.swing.JLabel pagibigNumberLbl;
    private javax.swing.JLabel philhealthNumbeLbl;
    private javax.swing.JTextField philhealthNumberField;
    private javax.swing.JTextField phoneAllowanceField;
    private javax.swing.JLabel phoneAllowanceLbl;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLbl;
    private javax.swing.JTextField positionField;
    private javax.swing.JLabel positionLbl;
    private javax.swing.JTextField riceSubsidyField;
    private javax.swing.JLabel riceSubsidyLbl;
    private javax.swing.JTextField sssNumberField;
    private javax.swing.JLabel sssNumberLbl;
    private javax.swing.JTextField statusField;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JTextField supervisorField;
    private javax.swing.JLabel supervisorLbl;
    private javax.swing.JTextField tinNumberField;
    private javax.swing.JLabel tinNumberLBl;
    private javax.swing.JButton updateEmploymentInfoBtn;
    private javax.swing.JButton updatePersonalInfoBtn;
    private javax.swing.JButton updateSalaryInfoBtn;
    // End of variables declaration//GEN-END:variables
}




