/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giftsapp;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class GiftsGUI extends javax.swing.JFrame {
    //declare an istance of the connection calss for connecting to the database
    Connection myConn;
    

    /**
     * Creates new form GiftsGUI
     */
    public GiftsGUI() {
        initComponents();
        getConnection();
    }
    
    private void getConnection() {
        try{
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexample", "root", "password");
            
        }catch(SQLException ex){
            System.out.println("Error connecting "+ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        itemLbl = new javax.swing.JLabel();
        itemTF = new javax.swing.JTextField();
        recipientLbl = new javax.swing.JLabel();
        recipientTF = new javax.swing.JTextField();
        urlLbl = new javax.swing.JLabel();
        urlTF = new javax.swing.JTextField();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addBtn.setText("Add Gift");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        displayBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        displayBtn.setText("Dislpay All Gifts");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        itemLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemLbl.setText("Item");

        recipientLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recipientLbl.setText("Recipient");

        urlLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        urlLbl.setText("URL");

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleLbl.setText("Gifts Application");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn)
                            .addComponent(searchBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(deleteBtn)
                                .addGap(25, 25, 25))
                            .addComponent(displayBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(recipientLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(recipientTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemLbl)
                                    .addComponent(urlLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemTF)
                                    .addComponent(urlTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(titleLbl)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemLbl)
                    .addComponent(itemTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recipientLbl)
                    .addComponent(recipientTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urlLbl)
                    .addComponent(urlTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(displayBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(deleteBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        try{
            //create statement
            Statement myStatement = myConn.createStatement();
            //execute sql update
            myStatement.executeUpdate("INSERET INTO gifts_table (Recipie,gift,URL)" + "VALUES('"+recipientTF.getText()+"', '"+itemTF.getText()+"', '" + urlTF.getText()+"')'");
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        try {
            Statement myStatement = myConn.createStatement();
            ResultSet myRS = myStatement.executeQuery("SELECT * FROM gifts_table");
            while (myRS.next()) {
                JOptionPane.showMessageDialog(null, myRS.getString("Rexipient") + "," + myRS.getString("gifts") + "," + myRS.getString("URL"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        try{
            String searchTerm = JOptionPane.showInputDialog(null, "Enter an item to search");
            Statement myStatement = myConn.createStatement();
            ResultSet myRS = myStatement.executeQuery("SELECT * FROM gifts_table");

            while (myRS.next()) {
                if (myRS.getString("gift").equalsIgnoreCase(searchTerm)) {
                    JOptionPane.showMessageDialog(null, myRS.getString("Rexipient") + "," + myRS.getString("gifts") + "," + myRS.getString("URL"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
                try{
            String searchTerm = JOptionPane.showInputDialog(null, "Enter an item to search");
            Statement myStatement = myConn.createStatement();
            ResultSet myRS = myStatement.executeQuery("SELECT * FROM gifts_table");

            while (myRS.next()) {
                if (myRS.getString("gift").equalsIgnoreCase(searchTerm)) {
                    myStatement.executeUpdate("DELETE FROM gifts_table WHERE gifts='"+searchTerm+"'");
                    JOptionPane.showMessageDialog(null, "Succesfully deleted");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GiftsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiftsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiftsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiftsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiftsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel itemLbl;
    private javax.swing.JTextField itemTF;
    private javax.swing.JLabel recipientLbl;
    private javax.swing.JTextField recipientTF;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel urlLbl;
    private javax.swing.JTextField urlTF;
    // End of variables declaration//GEN-END:variables
}
