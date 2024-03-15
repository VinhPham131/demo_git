/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thayTai;

import java.awt.Font;


/**
 *
 * @author nhipham
 */
public class Cau2 extends javax.swing.JFrame {

    /**
     * Creates new form Cau2
     */
    public Cau2() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text = new javax.swing.JTextField();
        plainCheckBox = new javax.swing.JRadioButton();
        boldCheckBox = new javax.swing.JRadioButton();
        bothCheckBox = new javax.swing.JRadioButton();
        italicCheckBox = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Text.setText("Watch the font style change");
        Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });

        plainCheckBox.setText("Plain");
        plainCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainCheckBoxActionPerformed(evt);
            }
        });

        boldCheckBox.setText("Bold");
        boldCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldCheckBoxActionPerformed(evt);
            }
        });

        bothCheckBox.setText("Bold/Italic");
        bothCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bothCheckBoxActionPerformed(evt);
            }
        });

        italicCheckBox.setText("Italic");
        italicCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plainCheckBox)
                .addGap(36, 36, 36)
                .addComponent(boldCheckBox)
                .addGap(39, 39, 39)
                .addComponent(italicCheckBox)
                .addGap(18, 18, 18)
                .addComponent(bothCheckBox)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plainCheckBox)
                    .addComponent(bothCheckBox)
                    .addComponent(italicCheckBox)
                    .addComponent(boldCheckBox))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextActionPerformed

    private void plainCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainCheckBoxActionPerformed
        // TODO add your handling code here:
        if(plainCheckBox.isSelected()) {
            Text.setFont(new Font("Ariral", 0, 13));
            Text.setText("Watch the font style change ");
        }  

    }//GEN-LAST:event_plainCheckBoxActionPerformed

    private void bothCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bothCheckBoxActionPerformed
        // TODO add your handling code here:
          if(bothCheckBox.isSelected()) {
            Text.setFont(new Font("Ariral", 3, 13));
            Text.setText("Watch the font style change ");
        }
    }//GEN-LAST:event_bothCheckBoxActionPerformed

    private void italicCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicCheckBoxActionPerformed
        // TODO add your handling code here:
             if(italicCheckBox.isSelected()) {
            Text.setFont(new Font("Ariral", 2, 13));
            Text.setText("Watch the font style change ");
        }
    }//GEN-LAST:event_italicCheckBoxActionPerformed

    private void boldCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldCheckBoxActionPerformed
        // TODO add your handling code here:
        if (boldCheckBox.isSelected()) {
            Font bold = new Font("Arial", 1, 13);
            Text.setFont(bold);
            Text.setText("Watch the font style change ");
        }
    }//GEN-LAST:event_boldCheckBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Cau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cau2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cau2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text;
    private javax.swing.JRadioButton boldCheckBox;
    private javax.swing.JRadioButton bothCheckBox;
    private javax.swing.JRadioButton italicCheckBox;
    private javax.swing.JRadioButton plainCheckBox;
    // End of variables declaration//GEN-END:variables
}