/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DWI WAHYU
 */
public class vHalamanMain extends javax.swing.JFrame {

    /**
     * Creates new form vHalamanMain
     */
    public vHalamanMain() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public JLabel getImgPasienApotek() {
        return imgPasienApotek;
    }
    
    public JLabel getImgPasienDokter() {
        return imgPasienDokter;
    }
    
    public JButton getBtnPause() {
        return btnPause;
    }
    
    public JButton getBtnShop() {
        return btnShop;
    }
    public void TampilPopUp (boolean status) {
        popupperiksa.setVisible(status);
        popupperiksa_BG.setVisible(status);
        ok_popup.setVisible(status);
        if (status = false ) {
            popupperiksa.setText("");
        }
    }
    public JButton getOkPopUpBtn () {
        return ok_popup ;
    }
    public JButton getBeliObatBtn () {
        return BeliObatBtn ;
    }
    
    public void TampilPopUpBeliObat (boolean status) {
        popup_beliObat.setVisible(status);
        popup_beliobat_obat1.setVisible(status);
        popup_beliobat_obat2.setVisible(status);
        popup_beliobat_obat3.setVisible(status);
        popup_beliobat_label.setVisible(status);
        BtnJawaban1.setVisible(status);
        BtnJawaban2.setVisible(status);
        BtnJawaban3.setVisible(status);
    }
    public JButton getJawaban1BeliObatBtn () {
        return BtnJawaban1 ;
    }    
    public JButton getJawaban2BeliObatBtn () {
        return BtnJawaban2 ;
    }    
    public JButton getJawaban3BeliObatBtn () {
        return BtnJawaban3 ;
    }    
//    public JButton getBtnBeliObat() {
//        return btnBeliObat;
//    }
    
    public JLabel getImgKursiFrame() {
        return imgKursiFrame;
    }
//    public void klikbeliObat(ActionListener action) {
//        btnBeliObat.addActionListener(action);
//    }
    public void klikshop(ActionListener action) {
        btnShop.addActionListener(action);
    }
    
    public JLabel getImgPasienFrame1() {
        return imgPasienFrame1;
    }
    
    public JLabel getImgPasienFrame2() {
        return imgPasienFrame2;
    }
    
    public void setpopup(String kata) {
        popupperiksa.setText(kata);
    }
    public void setpopupGejala(String kata) {
        popupGejala.setText(kata);
    }
    public JLabel getLabelScore () {
        return Score ;
    }
    public JLabel getAc(){
        return ac;
    }
    public JLabel getWifi(){
        return wifi;
    }
    public void message (String message) {
        JOptionPane.showMessageDialog(this, message);
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
        Score = new javax.swing.JLabel();
        BtnJawaban1 = new javax.swing.JButton();
        BtnJawaban2 = new javax.swing.JButton();
        BtnJawaban3 = new javax.swing.JButton();
        popup_beliobat_label = new javax.swing.JLabel();
        popup_beliobat_obat2 = new javax.swing.JLabel();
        popup_beliobat_obat3 = new javax.swing.JLabel();
        popup_beliobat_obat1 = new javax.swing.JLabel();
        popup_beliObat = new javax.swing.JLabel();
        BeliObatBtn = new javax.swing.JButton();
        ok_popup = new javax.swing.JButton();
        imgPasienFrame2 = new javax.swing.JLabel();
        btnPause = new javax.swing.JButton();
        btnShop = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        imgPasienFrame1 = new javax.swing.JLabel();
        imgKursiFrame = new javax.swing.JLabel();
        imgPasienDokter = new javax.swing.JLabel();
        imgPasienApotek = new javax.swing.JLabel();
        popupperiksa = new javax.swing.JLabel();
        popupperiksa_BG = new javax.swing.JLabel();
        dokter = new javax.swing.JLabel();
        apoteker = new javax.swing.JLabel();
        wifi = new javax.swing.JLabel();
        ac = new javax.swing.JLabel();
        popupGejala = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Score.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        Score.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Score.setText("0");
        Score.setOpaque(true);
        jPanel1.add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 7, 160, 30));
        jPanel1.add(BtnJawaban1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 110, 30));
        jPanel1.add(BtnJawaban2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 110, 30));
        jPanel1.add(BtnJawaban3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 110, 30));

        popup_beliobat_label.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        popup_beliobat_label.setText("PIlih Obatmu");
        jPanel1.add(popup_beliobat_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        popup_beliobat_obat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/obat1.png"))); // NOI18N
        jPanel1.add(popup_beliobat_obat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        popup_beliobat_obat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/obat2.png"))); // NOI18N
        jPanel1.add(popup_beliobat_obat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        popup_beliobat_obat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/obat.png"))); // NOI18N
        jPanel1.add(popup_beliobat_obat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        popup_beliObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HM_BeliObat.png"))); // NOI18N
        popup_beliObat.setText("jLabel1");
        jPanel1.add(popup_beliObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, -1));

        BeliObatBtn.setText("Beli Obat");
        jPanel1.add(BeliObatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 100, -1));

        ok_popup.setText("Ok");
        jPanel1.add(ok_popup, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        imgPasienFrame2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/150150null.png"))); // NOI18N
        imgPasienFrame2.setToolTipText("hai");
        jPanel1.add(imgPasienFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        btnPause.setText("PAUSE");
        jPanel1.add(btnPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));

        btnShop.setText("SHOP");
        jPanel1.add(btnShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 80, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        imgPasienFrame1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/150150null.png"))); // NOI18N
        jPanel1.add(imgPasienFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        imgKursiFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kursi1.png"))); // NOI18N
        jPanel1.add(imgKursiFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        imgPasienDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kotak.png"))); // NOI18N
        jPanel1.add(imgPasienDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        imgPasienApotek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kotak.png"))); // NOI18N
        jPanel1.add(imgPasienApotek, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        jPanel1.add(popupperiksa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 310, 60));

        popupperiksa_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/popup.png"))); // NOI18N
        jPanel1.add(popupperiksa_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 370, 130));

        dokter.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        dokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Dokter.png"))); // NOI18N
        jPanel1.add(dokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 130, 210));

        apoteker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apoteker.png"))); // NOI18N
        jPanel1.add(apoteker, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 140, 300));

        wifi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Wifi1.png"))); // NOI18N
        jPanel1.add(wifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        ac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AC1.png"))); // NOI18N
        jPanel1.add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        popupGejala.setBackground(new java.awt.Color(0, 0, 0));
        popupGejala.setForeground(new java.awt.Color(255, 255, 255));
        popupGejala.setOpaque(true);
        jPanel1.add(popupGejala, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 190, 110));

        background.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HMain_BackGround.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(vHalamanMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vHalamanMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vHalamanMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vHalamanMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vHalamanMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BeliObatBtn;
    private javax.swing.JButton BtnJawaban1;
    private javax.swing.JButton BtnJawaban2;
    private javax.swing.JButton BtnJawaban3;
    private javax.swing.JLabel Score;
    private javax.swing.JLabel ac;
    private javax.swing.JLabel apoteker;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnShop;
    private javax.swing.JLabel dokter;
    private javax.swing.JLabel imgKursiFrame;
    private javax.swing.JLabel imgPasienApotek;
    private javax.swing.JLabel imgPasienDokter;
    private javax.swing.JLabel imgPasienFrame1;
    private javax.swing.JLabel imgPasienFrame2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ok_popup;
    private javax.swing.JLabel popupGejala;
    private javax.swing.JLabel popup_beliObat;
    private javax.swing.JLabel popup_beliobat_label;
    private javax.swing.JLabel popup_beliobat_obat1;
    private javax.swing.JLabel popup_beliobat_obat2;
    private javax.swing.JLabel popup_beliobat_obat3;
    private javax.swing.JLabel popupperiksa;
    private javax.swing.JLabel popupperiksa_BG;
    private javax.swing.JLabel wifi;
    // End of variables declaration//GEN-END:variables
}
