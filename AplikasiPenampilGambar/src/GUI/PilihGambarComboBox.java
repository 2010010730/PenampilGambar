/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author LENOVO
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarComboBox() {
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

        buttonpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pilihan = new javax.swing.JComboBox<>();
        imagepanel = new javax.swing.JPanel();
        blink = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        linkin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonpanel.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Pilih Gambar");
        buttonpanel.add(jLabel1);

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blink 182", "Green Day", "Linkin Park" }));
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });
        buttonpanel.add(pilihan);

        getContentPane().add(buttonpanel, java.awt.BorderLayout.PAGE_START);

        imagepanel.setLayout(new java.awt.CardLayout());

        blink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/blink182.jpg"))); // NOI18N
        imagepanel.add(blink, "0");

        green.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/greenday.jpg"))); // NOI18N
        imagepanel.add(green, "1");

        linkin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/linkin.jpg"))); // NOI18N
        imagepanel.add(linkin, "2");

        getContentPane().add(imagepanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(imagepanel.getLayout());
        c1.show(imagepanel,String.valueOf(pilihan.getSelectedIndex()));
    }//GEN-LAST:event_pilihanActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blink;
    private javax.swing.JPanel buttonpanel;
    private javax.swing.JLabel green;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel linkin;
    private javax.swing.JComboBox<String> pilihan;
    // End of variables declaration//GEN-END:variables
}
