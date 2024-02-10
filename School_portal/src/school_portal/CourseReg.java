package school_portal;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

class ImagePanel1 extends JPanel {
    private Image backgroundImage;
    private float opacity;

    public ImagePanel1(String imagePath, float opacity) {
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
public class CourseReg extends javax.swing.JFrame {

    Connection connection = null;
    ResultSet resultset = null;
    PreparedStatement preparedstatement = null;

    public CourseReg() {
        initComponents();
        initComponents();
        // Add a JPanel with a background image
        ImagePanel1 imagePanel1 = new ImagePanel1("C:\\Users\\Tshepo T Sekete\\Desktop\\TASK-INTERN-CAREER\\School_portal\\images\\sau-helps.jpg", 0.4f);
        setContentPane(imagePanel1);

        imagePanel1.add(availCoursesPanel);

        connection = db.myCon(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        availCoursesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selectCourseCbx = new javax.swing.JComboBox<>();
        submitBtn = new javax.swing.JButton();
        backLbl = new javax.swing.JLabel();
        fullnameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        availCoursesPanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Available Courses");

        selectCourseCbx.setBackground(new java.awt.Color(0, 0, 0, 0));
        selectCourseCbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        selectCourseCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course", "JAVA", "WEB DEV", "PYTHON" }));
        selectCourseCbx.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        selectCourseCbx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectCourseCbx.setOpaque(false);

        submitBtn.setBackground(new java.awt.Color(0, 0, 0, 0));
        submitBtn.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitBtn.setOpaque(false);
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        backLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backLbl.setText("Back");
        backLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLblMouseClicked(evt);
            }
        });

        fullnameTxt.setBackground(new java.awt.Color(0, 0, 0, 0));
        fullnameTxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fullnameTxt.setText("  Fullname");
        fullnameTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        fullnameTxt.setOpaque(false);
        fullnameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fullnameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fullnameTxtFocusLost(evt);
            }
        });
        fullnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameTxtActionPerformed(evt);
            }
        });

        emailTxt.setBackground(new java.awt.Color(0, 0, 0, 0));
        emailTxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emailTxt.setText("  Email");
        emailTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        emailTxt.setOpaque(false);
        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTxtFocusLost(evt);
            }
        });

        passwordTxt.setBackground(new java.awt.Color(0, 0, 0, 0));
        passwordTxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passwordTxt.setText("  Password");
        passwordTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        passwordTxt.setOpaque(false);
        passwordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTxtFocusLost(evt);
            }
        });

        javax.swing.GroupLayout availCoursesPanelLayout = new javax.swing.GroupLayout(availCoursesPanel);
        availCoursesPanel.setLayout(availCoursesPanelLayout);
        availCoursesPanelLayout.setHorizontalGroup(
            availCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availCoursesPanelLayout.createSequentialGroup()
                .addGroup(availCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(availCoursesPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(availCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(availCoursesPanelLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel1))
                            .addComponent(selectCourseCbx, 0, 365, Short.MAX_VALUE)
                            .addComponent(fullnameTxt)
                            .addComponent(emailTxt)
                            .addComponent(passwordTxt)))
                    .addGroup(availCoursesPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(backLbl))
                    .addGroup(availCoursesPanelLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        availCoursesPanelLayout.setVerticalGroup(
            availCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availCoursesPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backLbl)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(selectCourseCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fullnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(availCoursesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(availCoursesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String courseSelection = selectCourseCbx.getSelectedItem().toString();
        String fullname = fullnameTxt.getText();
        String email = emailTxt.getText();
        String password = passwordTxt.getText();
        String userName = emailTxt.getText();
        try
        {
            Statement s = db.myCon().createStatement();

            if(courseSelection.equals("Select Course") || fullname.equals("  Fullname") || email.equals("  Email") || password.equals("  Password"))
            {
                JOptionPane.showMessageDialog(rootPane, "All fields are mandatory.");
            }
            else
            {
                String sql = "";
               

               if(courseSelection.equals("JAVA"))
                {
                    sql = " SELECT * FROM students WHERE Username=? AND Password=?";
                }
                else if(courseSelection.equals("WEB DEV"))
                {
                    sql = " SELECT * FROM students WHERE Username=? AND Password=?";
                }

                else if(courseSelection.equals("PYTHON"))
                {
                    sql = " SELECT * FROM students WHERE Username=? AND Password=?";
                }

                preparedstatement = connection.prepareCall(sql);

                preparedstatement.setString(1, userName); //username
                preparedstatement.setString(2, password); //password

                resultset = preparedstatement.executeQuery();

                if(resultset.next())
                {
                    JOptionPane.showMessageDialog(rootPane, "Successful"); //successful registration
                    
                    if(courseSelection.equals("JAVA"))
                    {
                       s.executeUpdate("INSERT INTO courses (Course_name, Fullname, Email)" + "VALUES ('"+courseSelection+"', '"+fullname+"', '"+email+"')");
                       JOptionPane.showMessageDialog(rootPane, "Successfully Registered.");  

                       new StudentsHP().myCoursesCbx.addItem("JAVA");
                    }
                    else if(courseSelection.equals("WEB DEV"))
                    {
                       s.executeUpdate("INSERT INTO courses (Course_name, Fullname, Email)" + "VALUES ('"+courseSelection+"', '"+fullname+"', '"+email+"')");
                       JOptionPane.showMessageDialog(rootPane, "Successfully Registered.");
                    }

                    else if(courseSelection.equals("PYTHON"))
                    {
                       s.executeUpdate("INSERT INTO courses (Course_name, Fullname, Email)" + "VALUES ('"+courseSelection+"', '"+fullname+"', '"+email+"')");
                       JOptionPane.showMessageDialog(rootPane, "Successfully Registered.");
                    }
                    
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Student not found.");
                }
            }
        }
        catch(HeadlessException | SQLException e)
        {
//            JOptionPane.showMessageDialog(rootPane, "Something went wrong."); 
System.out.println(e); 
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void backLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseClicked
        new StudentsHP().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backLblMouseClicked

    private void fullnameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameTxtFocusGained
        if(fullnameTxt.getText().equals("  Fullname")){fullnameTxt.setText("");}
    }//GEN-LAST:event_fullnameTxtFocusGained

    private void fullnameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameTxtFocusLost
        if(fullnameTxt.getText().equals("")){fullnameTxt.setText("  Fullname");}
    }//GEN-LAST:event_fullnameTxtFocusLost

    private void emailTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusGained
        if(emailTxt.getText().equals("  Email")){emailTxt.setText("");}
    }//GEN-LAST:event_emailTxtFocusGained

    private void emailTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusLost
        if(emailTxt.getText().equals("")){emailTxt.setText("  Email");}
    }//GEN-LAST:event_emailTxtFocusLost

    private void passwordTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusGained
        if(passwordTxt.getText().equals("  Password")){passwordTxt.setText("");}
    }//GEN-LAST:event_passwordTxtFocusGained

    private void passwordTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusLost
        if(passwordTxt.getText().equals("")){passwordTxt.setText("  Password");}
    }//GEN-LAST:event_passwordTxtFocusLost

    private void fullnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameTxtActionPerformed

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
            java.util.logging.Logger.getLogger(CourseReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availCoursesPanel;
    private javax.swing.JLabel backLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fullnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JComboBox<String> selectCourseCbx;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
