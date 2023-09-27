/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculatorapp;

/**
 *
 * @author Jordan
 */
public class CalculatorGUI extends javax.swing.JFrame {
    private double num1, num2, answer;

    /**
     * Creates new form CalculatorGUI
     */
    public CalculatorGUI() {
        initComponents();
        divBtn.setVisible(false);
        addBtn.setVisible(false);
        subBtn.setVisible(false);
        multiBtn.setVisible(false);
        modBtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeGrp = new javax.swing.ButtonGroup();
        titleLbl = new javax.swing.JLabel();
        number1Lbl = new javax.swing.JLabel();
        number2Lbl = new javax.swing.JLabel();
        answerLbl = new javax.swing.JLabel();
        ansLbl = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        subBtn = new javax.swing.JButton();
        divBtn = new javax.swing.JButton();
        multiBtn = new javax.swing.JButton();
        modBtn = new javax.swing.JButton();
        basicRB = new javax.swing.JRadioButton();
        adRB = new javax.swing.JRadioButton();
        num1TF = new javax.swing.JTextField();
        num2TF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleLbl.setText("Calculator Application");

        number1Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        number1Lbl.setText("number 1");

        number2Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        number2Lbl.setText("number 2");

        answerLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        answerLbl.setText("Answer");

        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        subBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subBtn.setText("Subtract");
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });

        divBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        divBtn.setText("Divide");
        divBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBtnActionPerformed(evt);
            }
        });

        multiBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        multiBtn.setText("Multiply");
        multiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiBtnActionPerformed(evt);
            }
        });

        modBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modBtn.setText("Modulus");
        modBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modBtnActionPerformed(evt);
            }
        });

        typeGrp.add(basicRB);
        basicRB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        basicRB.setText("Basic");
        basicRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicRBActionPerformed(evt);
            }
        });

        typeGrp.add(adRB);
        adRB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        adRB.setText("Advanced");
        adRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adRBActionPerformed(evt);
            }
        });

        num1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1TFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(number1Lbl)
                                    .addComponent(answerLbl))
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ansLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(adRB))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(divBtn)
                                            .addGap(57, 57, 57)
                                            .addComponent(multiBtn)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(num1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(num2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(110, 110, 110))))
                            .addComponent(number2Lbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addGap(38, 38, 38)
                                .addComponent(subBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(basicRB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(modBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(basicRB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(adRB)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(number1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(number2Lbl)
                    .addComponent(num2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ansLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(subBtn)
                    .addComponent(divBtn)
                    .addComponent(multiBtn))
                .addGap(36, 36, 36)
                .addComponent(modBtn)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(num1TF.getText());
        num2 = Double.parseDouble(num2TF.getText());
        answer = num1 + num2;
        ansLbl.setText(" " + answer);
    }//GEN-LAST:event_addBtnActionPerformed

    private void modBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modBtnActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(num1TF.getText());
        num2 = Double.parseDouble(num2TF.getText());
        answer = num1 % num2;
        ansLbl.setText(" " + answer);
    }//GEN-LAST:event_modBtnActionPerformed

    private void basicRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicRBActionPerformed
        // TODO add your handling code here:
        multiBtn.setVisible(false);
        divBtn.setVisible(false);
        modBtn.setVisible(false);
        addBtn.setVisible(true);
        subBtn.setVisible(true);

    }//GEN-LAST:event_basicRBActionPerformed

    private void num1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1TFActionPerformed

    private void adRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adRBActionPerformed
        // TODO add your handling code here:
        multiBtn.setVisible(true);
        divBtn.setVisible(true);
        modBtn.setVisible(true);
        addBtn.setVisible(false);
        subBtn.setVisible(false);
    }//GEN-LAST:event_adRBActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(num1TF.getText());
        num2 = Double.parseDouble(num2TF.getText());
        answer = num1 - num2;
        ansLbl.setText(" " + answer);
    }//GEN-LAST:event_subBtnActionPerformed

    private void divBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBtnActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(num1TF.getText());
        num2 = Double.parseDouble(num2TF.getText());
        answer = num1/ num2;
        ansLbl.setText(" " + answer);
    }//GEN-LAST:event_divBtnActionPerformed

    private void multiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiBtnActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(num1TF.getText());
        num2 = Double.parseDouble(num2TF.getText());
        answer = num1 * num2;
        ansLbl.setText(" " + answer);
        
    }//GEN-LAST:event_multiBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adRB;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel ansLbl;
    private javax.swing.JLabel answerLbl;
    private javax.swing.JRadioButton basicRB;
    private javax.swing.JButton divBtn;
    private javax.swing.JButton modBtn;
    private javax.swing.JButton multiBtn;
    private javax.swing.JTextField num1TF;
    private javax.swing.JTextField num2TF;
    private javax.swing.JLabel number1Lbl;
    private javax.swing.JLabel number2Lbl;
    private javax.swing.JButton subBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.ButtonGroup typeGrp;
    // End of variables declaration//GEN-END:variables
}
