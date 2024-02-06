/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package school_portal;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;

class ImagePanel extends JPanel {
    private Image backgroundImage;
    private float opacity;

    public ImagePanel(String imagePath, float opacity) {
        // Load the background image
        backgroundImage = new ImageIcon(imagePath).getImage();

        // Set the opacity (value between 0.0 and 1.0)
        this.opacity = opacity;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Create a Graphics2D object
        Graphics2D g2d = (Graphics2D) g.create();

        // Set the opacity using AlphaComposite
        AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity);
        g2d.setComposite(alphaComposite);

        // Draw the background image
        g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        // Dispose the Graphics2D object
        g2d.dispose();
    }
}

public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        // Add a JPanel with a background image
        ImagePanel imagePanel = new ImagePanel("C:\\Users\\Tshepo T Sekete\\Desktop\\TASK-INTERN-CAREER\\School_portal\\images\\sau-helps.jpg", 0.8f);
        setContentPane(imagePanel);

        imagePanel.add(jPanel1);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passwordTxt = new javax.swing.JPasswordField();
        surnameTxt = new javax.swing.JTextField();
        roleCbx = new javax.swing.JComboBox<>();
        nameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        confPasswordTxt = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(517, 562));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Register", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);

        passwordTxt.setBackground(new java.awt.Color(0, 0, 0, 0));
        passwordTxt.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(51, 51, 51));
        passwordTxt.setText("Password");
        passwordTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        passwordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTxtFocusLost(evt);
            }
        });

        surnameTxt.setBackground(new java.awt.Color(0, 0, 0, 0));
        surnameTxt.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        surnameTxt.setForeground(new java.awt.Color(51, 51, 51));
        surnameTxt.setText("Surname");
        surnameTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        surnameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                surnameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                surnameTxtFocusLost(evt);
            }
        });
        surnameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surnameTxtKeyTyped(evt);
            }
        });

        roleCbx.setBackground(new java.awt.Color(0, 0, 0, 0));
        roleCbx.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        roleCbx.setForeground(new java.awt.Color(255, 255, 255));
        roleCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select role", "Student", "Teacher" }));
        roleCbx.setToolTipText("");
        roleCbx.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        roleCbx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roleCbx.setOpaque(false);

        nameTxt.setBackground(new java.awt.Color(0, 0, 0, 0));
        nameTxt.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(51, 51, 51));
        nameTxt.setText("Name");
        nameTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        nameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTxtFocusLost(evt);
            }
        });
        nameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTxtKeyTyped(evt);
            }
        });

        emailTxt.setBackground(new java.awt.Color(0, 0, 0, 0));
        emailTxt.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(51, 51, 51));
        emailTxt.setText("Email");
        emailTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTxtFocusLost(evt);
            }
        });
        emailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTxtKeyTyped(evt);
            }
        });

        phoneTxt.setBackground(new java.awt.Color(0, 0, 0, 0));
        phoneTxt.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        phoneTxt.setForeground(new java.awt.Color(51, 51, 51));
        phoneTxt.setText("Mobile No");
        phoneTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        phoneTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTxtFocusLost(evt);
            }
        });
        phoneTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneTxtKeyTyped(evt);
            }
        });

        confPasswordTxt.setBackground(new java.awt.Color(0, 0, 0, 0));
        confPasswordTxt.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        confPasswordTxt.setForeground(new java.awt.Color(51, 51, 51));
        confPasswordTxt.setText("Password");
        confPasswordTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        confPasswordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confPasswordTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confPasswordTxtFocusLost(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Already a member? Click");

        signUpBtn.setForeground(new java.awt.Color(51, 51, 255));
        signUpBtn.setText("here");
        signUpBtn.setBorder(null);
        signUpBtn.setBorderPainted(false);
        signUpBtn.setContentAreaFilled(false);
        signUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signUpBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new Color(0, 0, 0));
        registerBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        registerBtn.setContentAreaFilled(false);
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.setRequestFocusEnabled(false);
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerBtnMouseExited(evt);
            }
        });
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new Color(0, 0, 0));
        clearBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        clearBtn.setContentAreaFilled(false);
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearBtnMouseExited(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUpBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(surnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roleCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusGained
        if(passwordTxt.getText().equals("Password"))
        {
            passwordTxt.setText("");
        }
    }//GEN-LAST:event_passwordTxtFocusGained

    private void passwordTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusLost
        if(passwordTxt.getText().equals(""))
        {
            passwordTxt.setText("Password");
        }
    }//GEN-LAST:event_passwordTxtFocusLost

    private void surnameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameTxtFocusGained
        if(surnameTxt.getText().equals("Surname"))
        {
            surnameTxt.setText("");
        }
    }//GEN-LAST:event_surnameTxtFocusGained

    private void surnameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameTxtFocusLost
        if(surnameTxt.getText().equals(""))
        {
            surnameTxt.setText("Surname");
        }
    }//GEN-LAST:event_surnameTxtFocusLost

    private void surnameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surnameTxtKeyTyped
        //        usernameTxt.setForeground(Color.WHITE);
    }//GEN-LAST:event_surnameTxtKeyTyped

    private void nameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusGained
        if(nameTxt.getText().equals("Name")){
           nameTxt.setText("");
        }
    }//GEN-LAST:event_nameTxtFocusGained

    private void nameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusLost
        if(nameTxt.getText().equals("")){
            nameTxt.setText("Name");
        }
    }//GEN-LAST:event_nameTxtFocusLost

    private void nameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtKeyTyped

    private void emailTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusGained
        if(emailTxt.getText().equals("Email")){
            emailTxt.setText("");
        }
    }//GEN-LAST:event_emailTxtFocusGained

    private void emailTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusLost
        if(emailTxt.getText().equals("")){
            emailTxt.setText("Email");
        }
    }//GEN-LAST:event_emailTxtFocusLost

    private void emailTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtKeyTyped

    private void phoneTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTxtFocusGained
        if(phoneTxt.getText().equals("Mobile No")){
           phoneTxt.setText("");
        }
    }//GEN-LAST:event_phoneTxtFocusGained

    private void phoneTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTxtFocusLost
        if(phoneTxt.getText().equals("")){
           phoneTxt.setText("Mobile No");
        }
    }//GEN-LAST:event_phoneTxtFocusLost

    private void phoneTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtKeyTyped

    private void confPasswordTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confPasswordTxtFocusGained
        if(confPasswordTxt.getText().equals("Password")){
            confPasswordTxt.setText("");
        }
    }//GEN-LAST:event_confPasswordTxtFocusGained

    private void confPasswordTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confPasswordTxtFocusLost
        if(confPasswordTxt.getText().equals("")){
            confPasswordTxt.setText("Password");
        }
    }//GEN-LAST:event_confPasswordTxtFocusLost

    private void registerBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseEntered
        registerBtn.setForeground(Color.YELLOW);
        registerBtn.setBorder(new javax.swing.border.LineBorder(Color.BLUE, 2, true));
    }//GEN-LAST:event_registerBtnMouseEntered

    private void registerBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseExited
        registerBtn.setForeground(Color.BLACK);
        registerBtn.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_registerBtnMouseExited

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // register button events
//        String userName = usernameTxt.getText();
//        String userPassWord = "";
//        for(char c: passwordTxt.getPassword())
//        {
//            userPassWord += c;
//        }
//
//        try
//        {
//
//            //user input validation
//            if(usernameTxt.getText().length() < 1 || passwordTxt.getPassword().length < 1 || roleCbx.getSelectedItem() == "Select role")
//            {
//                JOptionPane.showMessageDialog(rootPane, "All Fields Are Mandatory!"); //rules of form filling
//            }
//            else{
//                //sql query for username and password comparisons
//                String sql = " SELECT * FROM users WHERE User_Name=? AND Password=? ";
//                preparedstatement = connection.prepareCall(sql);
//
//                preparedstatement.setString(1, userName); //username
//                preparedstatement.setString(2, userPassWord); //password
//
//                resultset = preparedstatement.executeQuery();
//
//                if(resultset.next())
//                {
//                    JOptionPane.showMessageDialog(rootPane, "Successful"); //successful login attempt
//                    new Home().setVisible(true); //displays home_page frame is login in successfull
//                    new Login().setVisible(false); //hides login page
//
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(rootPane, "Unsuccessful login attempt"); //Unsuccessful login attempt(general message for security reasons)
//                    clearBtnActionPerformed(evt); //clears fields if login is unsuccssful
//                    attempts++;//increment attempts per failed request
//                    if(attempts > 2)
//                    {
//                        JOptionPane.showMessageDialog(rootPane, "Too many incorrect tries.");//displays this message if condition is met
//                        System.exit(0);//exit the app if condition is met
//                    }
//                }
//            }
//        }
//        catch(HeadlessException | SQLException e) //catch exceptions for DB related exceptions
//        {
//            JOptionPane.showMessageDialog(rootPane, "Something went wrong");
//        }
//        finally
//        {
//            // Close resources in a finally block to ensure they are closed even if an exception occurs
//            try
//            {
//                if (resultset != null)
//                {
//                    resultset.close();
//                }
//                if (preparedstatement != null)
//                {
//                    preparedstatement.close();
//                }
//            }
//            catch (SQLException ex)
//            {
//                JOptionPane.showMessageDialog(rootPane, "Something went wrong");
//            }
//        }

         
    }//GEN-LAST:event_registerBtnActionPerformed

    private void clearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseEntered
        clearBtn.setForeground(Color.YELLOW);
        clearBtn.setBorder(new javax.swing.border.LineBorder(Color.BLUE, 2, true));
    }//GEN-LAST:event_clearBtnMouseEntered

    private void clearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseExited
        clearBtn.setForeground(Color.BLACK);
        clearBtn.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_clearBtnMouseExited

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // clears information input

        if(nameTxt.getText().length() > 0 || passwordTxt.getPassword().length > 0 || emailTxt.getText().length()> 0 || phoneTxt.getText().length()> 0 || confPasswordTxt.getText().length()> 0 || surnameTxt.getText().length()> 0)
        {
            nameTxt.setText("Name");
            passwordTxt.setText("Password");
            emailTxt.setText("Email");
            confPasswordTxt.setText("Password");
            phoneTxt.setText("Mobile No");
            surnameTxt.setText("Surname");
        }

        roleCbx.setSelectedItem("Select role");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        new Login().setVisible(true);
        new Register().setVisible(false);
    }//GEN-LAST:event_signUpBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JPasswordField confPasswordTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JComboBox<String> roleCbx;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JTextField surnameTxt;
    // End of variables declaration//GEN-END:variables
}
