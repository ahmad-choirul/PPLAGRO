/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Image;
import javax.swing.JButton;

/**
 *
 * @author DWI WAHYU
 */
public class vHalamanAwal extends javax.swing.JFrame {

    /**
     * Creates new form vHalamanAwal
     */
    public vHalamanAwal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnContinue = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        btnSkorTinggi = new javax.swing.JButton();
        btnPetunjuk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContinue.setBackground(new java.awt.Color(0, 204, 153));
        btnContinue.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        btnContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HA_Continue_button.png"))); // NOI18N
        btnContinue.setBorder(null);
        btnContinue.setBorderPainted(false);
        btnContinue.setContentAreaFilled(false);
        btnContinue.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HA_Continue_button_Over.png"))); // NOI18N
        jPanel1.add(btnContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 7, 300, 80));

        btnNewGame.setBackground(new java.awt.Color(0, 204, 153));
        btnNewGame.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        btnNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HA_newgame_button.png"))); // NOI18N
        btnNewGame.setToolTipText("");
        btnNewGame.setBorder(null);
        btnNewGame.setContentAreaFilled(false);
        btnNewGame.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HA_newgame_button_Over.png"))); // NOI18N
        jPanel1.add(btnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 320, 90));

        btnSkorTinggi.setBackground(new java.awt.Color(0, 204, 153));
        btnSkorTinggi.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnSkorTinggi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HA_SkorTinggi_button.png"))); // NOI18N
        btnSkorTinggi.setToolTipText("");
        btnSkorTinggi.setBorder(null);
        btnSkorTinggi.setContentAreaFilled(false);
        btnSkorTinggi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HA_SkorTinggi_button_MouseOver.png"))); // NOI18N
        jPanel1.add(btnSkorTinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 300, 90));

        btnPetunjuk.setBackground(new java.awt.Color(0, 204, 153));
        btnPetunjuk.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnPetunjuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HA_Petunjuk_button.png"))); // NOI18N
        btnPetunjuk.setBorder(null);
        btnPetunjuk.setContentAreaFilled(false);
        btnPetunjuk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HA_Petunjuk_button_Over.png"))); // NOI18N
        jPanel1.add(btnPetunjuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 280, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HA_Background.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
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
            java.util.logging.Logger.getLogger(vHalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vHalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vHalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vHalamanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vHalamanAwal().setVisible(true);
            }
        });
    }

    public JButton getBtnContinue() {
        return btnContinue;
    }

    public JButton getBtnNewGame() {
        return btnNewGame;
    }

    public JButton getBtnPetunjuk() {
        return btnPetunjuk;
    }

    public JButton getBtnSkorTinggi() {
        return btnSkorTinggi;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnPetunjuk;
    private javax.swing.JButton btnSkorTinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
