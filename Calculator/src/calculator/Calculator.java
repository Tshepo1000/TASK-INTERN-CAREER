package calculator;
import javax.swing.*;

/**
 *
 * @author Tshepo T Sekete
 */
public class Calculator extends JFrame 
{
    double firstNum, secondNum, answer;
    String operator;
    public Calculator() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void EnterNumbers(String a)
    {
        String numbers = results.getText() + a;
        results.setText(numbers);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP = new javax.swing.JPanel();
        results = new javax.swing.JTextField();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btncom = new javax.swing.JButton();
        btnequals = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnBSP = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnPM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jP.setBackground(new java.awt.Color(10, 122, 114));
        jP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jP.setName("jp"); // NOI18N

        results.setBackground(new java.awt.Color(0, 0, 0));
        results.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        results.setForeground(new java.awt.Color(255, 255, 255));
        results.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        results.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));
        results.setName("results"); // NOI18N

        btn0.setBackground(new java.awt.Color(0, 0, 153));
        btn0.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn0.setForeground(new java.awt.Color(204, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 0, 153));
        btn1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(204, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 153));
        btn2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(204, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 153));
        btn3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(204, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 153));
        btn4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(204, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 153));
        btn5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(204, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 153));
        btn6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn6.setForeground(new java.awt.Color(204, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 153));
        btn7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn7.setForeground(new java.awt.Color(204, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 153));
        btn8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn8.setForeground(new java.awt.Color(204, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 153));
        btn9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btn9.setForeground(new java.awt.Color(204, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btncom.setBackground(new java.awt.Color(0, 0, 0));
        btncom.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btncom.setForeground(new java.awt.Color(0, 255, 255));
        btncom.setText(".");
        btncom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomActionPerformed(evt);
            }
        });

        btnequals.setBackground(new java.awt.Color(0, 0, 0));
        btnequals.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnequals.setForeground(new java.awt.Color(51, 255, 255));
        btnequals.setText("=");
        btnequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalsActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(255, 255, 255));
        btnadd.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnadd.setText("+");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnsub.setBackground(new java.awt.Color(255, 255, 255));
        btnsub.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        btnmulti.setBackground(new java.awt.Color(255, 255, 255));
        btnmulti.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnmulti.setText("x");
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });

        btndiv.setBackground(new java.awt.Color(255, 255, 255));
        btndiv.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnBSP.setBackground(new java.awt.Color(0, 0, 153));
        btnBSP.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnBSP.setForeground(new java.awt.Color(204, 255, 255));
        btnBSP.setText("BSC");
        btnBSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBSPActionPerformed(evt);
            }
        });

        btnCE.setBackground(new java.awt.Color(0, 0, 153));
        btnCE.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnCE.setForeground(new java.awt.Color(204, 255, 255));
        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(0, 0, 153));
        btnC.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnC.setForeground(new java.awt.Color(204, 255, 255));
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnPM.setBackground(new java.awt.Color(0, 0, 153));
        btnPM.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        btnPM.setForeground(new java.awt.Color(204, 255, 255));
        btnPM.setText("±");
        btnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("BasicMath");

        javax.swing.GroupLayout jPLayout = new javax.swing.GroupLayout(jP);
        jP.setLayout(jPLayout);
        jPLayout.setHorizontalGroup(
            jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(results)
                        .addGroup(jPLayout.createSequentialGroup()
                            .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPLayout.createSequentialGroup()
                                    .addComponent(btnBSP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPLayout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPLayout.createSequentialGroup()
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPLayout.createSequentialGroup()
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPLayout.createSequentialGroup()
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btncom, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(28, 28, 28)
                            .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnequals, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPLayout.setVerticalGroup(
            jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(results, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBSP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnequals, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        btn0.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btncomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomActionPerformed
        // TODO add your handling code here:
        if(!results.getText().contains("."))
        {
            results.setText(results.getText() + btncom.getText());
        }
    }//GEN-LAST:event_btncomActionPerformed

    private void btnequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalsActionPerformed
        // TODO add your handling code here
        secondNum = Double.parseDouble(results.getText());
        if(operator == "+")
        {
            answer = firstNum + secondNum;
            results.setText(String.valueOf(answer));
        }
        else if(operator == "-")
        {
            answer = firstNum - secondNum;
            results.setText(String.valueOf(answer));
        }
        else if(operator == "*")
        {
            answer = firstNum * secondNum;
            results.setText(String.valueOf(answer));
        }
        else if(operator == "/")
        {
            answer = firstNum / secondNum;
            results.setText(String.valueOf(answer));
        }
    }//GEN-LAST:event_btnequalsActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        firstNum = Double.parseDouble(results.getText());
        results.setText("");
        operator = "+";
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
        // TODO add your handling code here:
        firstNum = Double.parseDouble(results.getText());
        results.setText("");
        operator = "-";
    }//GEN-LAST:event_btnsubActionPerformed

    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
        // TODO add your handling code here:
        firstNum = Double.parseDouble(results.getText());
        results.setText("");
        operator = "*";
    }//GEN-LAST:event_btnmultiActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        // TODO add your handling code here:
        firstNum = Double.parseDouble(results.getText());
        results.setText("");
        operator = "/";
    }//GEN-LAST:event_btndivActionPerformed

    private void btnBSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBSPActionPerformed
        // TODO add your handling code here:
        String backSpace = null;
        if(results.getText().length() > 0)
        {
            StringBuilder sb = new StringBuilder(results.getText());
            sb.deleteCharAt(results.getText().length() - 1);
            backSpace = sb.toString();
            results.setText(backSpace);
        }
    }//GEN-LAST:event_btnBSPActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        // TODO add your handling code here:
        results.setText("");
        String num1, num2;
        num1 = String.valueOf(firstNum);
        num2 = String.valueOf(secondNum);

        num1 = "";
        num2 = "";
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        results.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPMActionPerformed
        // TODO add your handling code here:
        Double pm = Double.parseDouble(String.valueOf(results.getText())) * -1;
        results.setText(String.valueOf(pm));
    }//GEN-LAST:event_btnPMActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("1");
    }//GEN-LAST:event_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btn0;
    javax.swing.JButton btn1;
    javax.swing.JButton btn2;
    javax.swing.JButton btn3;
    javax.swing.JButton btn4;
    javax.swing.JButton btn5;
    javax.swing.JButton btn6;
    javax.swing.JButton btn7;
    javax.swing.JButton btn8;
    javax.swing.JButton btn9;
    javax.swing.JButton btnBSP;
    javax.swing.JButton btnC;
    javax.swing.JButton btnCE;
    javax.swing.JButton btnPM;
    javax.swing.JButton btnadd;
    javax.swing.JButton btncom;
    javax.swing.JButton btndiv;
    javax.swing.JButton btnequals;
    javax.swing.JButton btnmulti;
    javax.swing.JButton btnsub;
    private javax.swing.JLabel jLabel1;
    javax.swing.JPanel jP;
    javax.swing.JTextField results;
    // End of variables declaration//GEN-END:variables
}
