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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

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

    /**
     * Creates new form CourseReg
     */
    public CourseReg() {
        initComponents();
        initComponents();
        // Add a JPanel with a background image
        ImagePanel1 imagePanel1 = new ImagePanel1("C:\\Users\\Tshepo T Sekete\\Desktop\\TASK-INTERN-CAREER\\School_portal\\images\\sau-helps.jpg", 0.4f);
        setContentPane(imagePanel1);

        imagePanel1.add(availCoursesPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        availCoursesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selectCourseCbx = new javax.swing.JComboBox<>();
        submitBtn = new javax.swing.JButton();
        backLbl = new javax.swing.JLabel();

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

        javax.swing.GroupLayout availCoursesPanelLayout = new javax.swing.GroupLayout(availCoursesPanel);
        availCoursesPanel.setLayout(availCoursesPanelLayout);
        availCoursesPanelLayout.setHorizontalGroup(
            availCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availCoursesPanelLayout.createSequentialGroup()
                .addGroup(availCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(availCoursesPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(availCoursesPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(selectCourseCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(availCoursesPanelLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        availCoursesPanelLayout.setVerticalGroup(
            availCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availCoursesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(selectCourseCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        backLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backLbl.setText("<");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backLbl)
                    .addComponent(availCoursesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(availCoursesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> selectCourseCbx;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
