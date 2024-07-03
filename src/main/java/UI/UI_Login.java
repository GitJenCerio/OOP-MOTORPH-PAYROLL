
package UI;

import DatabaseConnection.DatabaseEmployeeDAO;
import DatabaseConnection.EmployeeDAO;
import UI.UI_Main;
import authentication.AuthenticateUser;
import authentication.AuthenticationService;
import authentication.LoginController;
import entities.Employee;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.AuthenticationException;
import javax.swing.JOptionPane;

public class UI_Login extends javax.swing.JFrame {
    
    private LoginController loginController;

  
    public UI_Login() {
        initComponents();
        setDefaultText();
        initializeLoginController();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        passwordPanel = new javax.swing.JPanel();
        passwordIcon = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        usernamePanel = new javax.swing.JPanel();
        usernameIcon = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backToMainBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 163));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 800));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN USER");

        passwordPanel.setBackground(new java.awt.Color(0, 0, 163));
        passwordPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 204), java.awt.Color.white));
        passwordPanel.setForeground(new java.awt.Color(255, 255, 255));
        passwordPanel.setMaximumSize(new java.awt.Dimension(215, 37));
        passwordPanel.setMinimumSize(new java.awt.Dimension(215, 37));

        passwordIcon.setForeground(new java.awt.Color(255, 255, 255));
        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-password-16 (1).png"))); // NOI18N

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 163));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPasswordField1.setMaximumSize(new java.awt.Dimension(76, 16));
        jPasswordField1.setMinimumSize(new java.awt.Dimension(76, 16));

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPanelLayout.createSequentialGroup()
                .addComponent(passwordIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginBtn.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(0, 102, 255));
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        usernamePanel.setBackground(new java.awt.Color(0, 0, 163));
        usernamePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 204), java.awt.Color.white));
        usernamePanel.setForeground(new java.awt.Color(255, 255, 255));
        usernamePanel.setMaximumSize(new java.awt.Dimension(215, 37));
        usernamePanel.setPreferredSize(new java.awt.Dimension(215, 37));

        usernameIcon.setForeground(new java.awt.Color(255, 255, 255));
        usernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-user-16 (1).png"))); // NOI18N

        usernameField.setBackground(new java.awt.Color(0, 0, 163));
        usernameField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setText("username");
        usernameField.setBorder(null);
        usernameField.setMaximumSize(new java.awt.Dimension(73, 18));
        usernameField.setMinimumSize(new java.awt.Dimension(73, 18));
        usernameField.setSelectionColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        usernamePanelLayout.setVerticalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addGroup(usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePanelLayout.createSequentialGroup()
                        .addComponent(usernameIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(usernamePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(passwordPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(600, 800));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 800));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 800));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MotorPH-Big.png"))); // NOI18N
        Logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo.setIconTextGap(0);
        Logo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("PAYROLL SYSTEM");

        backToMainBtn.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        backToMainBtn.setForeground(new java.awt.Color(4, 14, 163));
        backToMainBtn.setText("Version 1.0");
        backToMainBtn.setToolTipText("");
        backToMainBtn.setActionCommand("");
        backToMainBtn.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(backToMainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(124, 124, 124))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(142, 142, 142)
                .addComponent(backToMainBtn)
                .addGap(219, 219, 219))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
                                                           
    String username = usernameField.getText().trim();
    String password = new String(jPasswordField1.getPassword()).trim();

    if (username.isEmpty() || password.isEmpty()) {
        // If username or password is empty, show a message dialog prompting the user to enter both
        JOptionPane.showMessageDialog(this, "Please enter both username and password.");
    } else {
        try {
            Employee employee = loginController.loginAndGetUserInfo(username, password);

            if (employee != null) {
                // If authentication successful, display a welcome message with the full name of the logged-in user
                String fullName = employee.getFirstName() + " " + employee.getLastName();
                String welcomeMessage = "Welcome, " + fullName + "!";
                JOptionPane.showMessageDialog(this, welcomeMessage);

                // Proceed to the main frame with the user ID
                UI_Main mainFrame = new UI_Main(employee.getEmployeeId());
                mainFrame.setVisible(true);
                this.setVisible(false); // Hide the login frame
            } else {
                // If authentication failed, show a specific message for invalid username or password
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");

                // Log the invalid login attempt without specific error details
                Logger.getLogger(UI_Login.class.getName()).log(Level.INFO, "Invalid login attempt: Username = {0}", username);
            }
        } catch (SQLException | AuthenticationException ex) {
            // If an error occurs during authentication, log the error without showing a specific message
            Logger.getLogger(UI_Login.class.getName()).log(Level.SEVERE, "Error during login attempt", ex);
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again."); // Generic message
        }
    }
  
    }//GEN-LAST:event_loginBtnActionPerformed

    public void goToLoginUI() {
        // Create an instance of UI_Admin
        UI_Login loginUI = new UI_Login();

        // Make the UI_Admin visible
        loginUI.setVisible(true);
    }


    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton backToMainBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameIcon;
    private javax.swing.JPanel usernamePanel;
    // End of variables declaration//GEN-END:variables

    private void setDefaultText() {
       usernameField.setText("Username");
        jPasswordField1.setText("Password");
        
        // Add mouse listener to text field
        usernameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                usernameField.setText("");
            }
        });
        
        // Add focus listener to text fields
        usernameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usernameField.getText().equals("Username")) {
                    usernameField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usernameField.getText().isEmpty()) {
                    usernameField.setText("Username");
                }
            }
        });
        
        

        // Similar listeners for the password field
        jPasswordField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPasswordField1.setText("");
            }
        });

        jPasswordField1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                String pass = new String(jPasswordField1.getPassword());
                if (pass.equals("Password")) {
                    jPasswordField1.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String pass = new String(jPasswordField1.getPassword());
                if (pass.isEmpty()) {
                    jPasswordField1.setText("Password");
                }
            }
        });
        
      
    
    }

    private void initializeLoginController() {
       AuthenticationService authenticationService = new AuthenticateUser();
    EmployeeDAO employeeDAO = new DatabaseEmployeeDAO();
    loginController = new LoginController(authenticationService, employeeDAO);
    }
}

