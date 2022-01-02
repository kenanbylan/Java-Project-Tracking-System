package Gui;

import Gui.Ayarlar.ButonAyarlari;
import Gui.Ayarlar.YonlendirmeSettings;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Gui.KayitEkrani;
import VeriTabani.Baglanti;
import VeriTabani.IBosAlanKontrol;
import VeriTabani.Islemler.GirisBilgileri;
import VeriTabani.Islemler.KullaniciGirisIslemleri;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GirisEkrani extends javax.swing.JFrame implements IBosAlanKontrol {

    //icon ;
    ImageIcon logoIcon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

    //nesne;
    private KullaniciGirisIslemleri kullaniciGirisObje = null; //kullanici giris clasından bir nesne tanımlandi..

    public GirisEkrani() {

        setIconImage(logoIcon.getImage());
        initComponents();
        this.setLocationRelativeTo(null);
        new Baglanti();
    }

    @Override
    public boolean bilgilerGecerlimi() {

        return !(this.txt_giris_txNo.getText().equals("") || (this.txtGiris_PasswordSifre.getPassword().equals(""))); //hata verebilir...
    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() { //singleton yapısı

        return GirisBilgileri.getInstance();
    }

    public KullaniciGirisIslemleri getKullaniciGirisObje() {

        if (kullaniciGirisObje == null) {
            kullaniciGirisObje = new KullaniciGirisIslemleri();
        }

        return kullaniciGirisObje;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtGiris_PasswordSifre = new javax.swing.JPasswordField();
        btn_Giris_Login = new javax.swing.JButton();
        lbl_Giris_İcon = new javax.swing.JLabel();
        txt_giris_txNo = new javax.swing.JTextField();
        btn_Giris_yeniKayit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sol.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtGiris_PasswordSifre.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txtGiris_PasswordSifre.setForeground(new java.awt.Color(51, 153, 255));
        txtGiris_PasswordSifre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "Sifre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        btn_Giris_Login.setBackground(new java.awt.Color(255, 255, 255));
        btn_Giris_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        btn_Giris_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        btn_Giris_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Giris_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Giris_LoginMouseExited(evt);
            }
        });
        btn_Giris_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Giris_LoginActionPerformed(evt);
            }
        });

        lbl_Giris_İcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Giris_İcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/project-scheme.png"))); // NOI18N

        txt_giris_txNo.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txt_giris_txNo.setForeground(new java.awt.Color(51, 153, 255));
        txt_giris_txNo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "Tc No ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N
        txt_giris_txNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_giris_txNoKeyTyped(evt);
            }
        });

        btn_Giris_yeniKayit.setBackground(new java.awt.Color(255, 255, 255));
        btn_Giris_yeniKayit.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        btn_Giris_yeniKayit.setForeground(new java.awt.Color(51, 153, 255));
        btn_Giris_yeniKayit.setText("NEW   USER");
        btn_Giris_yeniKayit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        btn_Giris_yeniKayit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Giris_yeniKayitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Giris_yeniKayitMouseExited(evt);
            }
        });
        btn_Giris_yeniKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Giris_yeniKayitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_Giris_İcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btn_Giris_yeniKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Giris_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGiris_PasswordSifre, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(txt_giris_txNo))))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Giris_İcon, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_giris_txNo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiris_PasswordSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Giris_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Giris_yeniKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Giris_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Giris_LoginActionPerformed

        if (this.bilgilerGecerlimi()) {
            String musteriTC = this.txt_giris_txNo.getText();
            String musteriSifre = String.valueOf(this.txtGiris_PasswordSifre.getPassword());
            GirisYap(musteriTC, musteriSifre);
        } else {
            JOptionPane.showMessageDialog(this, "Tum alanlari Doldurunuz.");
        }

    }//GEN-LAST:event_btn_Giris_LoginActionPerformed

    private void GirisYap(String musteriTC, String musteriSifre) {

        this.getKullaniciGirisObje().setMusteri_tc(musteriTC);
        this.getKullaniciGirisObje().setMusteri_sifre(musteriSifre);

        if (getKullaniciGirisObje().GirisBilgileriKontrol()) {
            YonlendirmeSettings.setVisible(this, new AnaSayfa());
        } else {
            JOptionPane.showMessageDialog(this, "Tc veya Sifre Yanlış.Giris Bilgilerini Kontrol et.");
        }

    }


    private void btn_Giris_yeniKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Giris_yeniKayitActionPerformed

        YonlendirmeSettings.setVisible(this, new KayitEkrani());

    }//GEN-LAST:event_btn_Giris_yeniKayitActionPerformed

    private void btn_Giris_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Giris_LoginMouseEntered

        ButonAyarlari.setBg(btn_Giris_Login, Color.DARK_GRAY);

    }//GEN-LAST:event_btn_Giris_LoginMouseEntered

    private void btn_Giris_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Giris_LoginMouseExited
        ButonAyarlari.setOrijinalBg(btn_Giris_Login);
    }//GEN-LAST:event_btn_Giris_LoginMouseExited

    private void btn_Giris_yeniKayitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Giris_yeniKayitMouseClicked
        ButonAyarlari.setBg(btn_Giris_yeniKayit, Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_Giris_yeniKayitMouseClicked

    private void btn_Giris_yeniKayitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Giris_yeniKayitMouseExited
        ButonAyarlari.setOrijinalBg(btn_Giris_yeniKayit);

    }//GEN-LAST:event_btn_Giris_yeniKayitMouseExited

    private void txt_giris_txNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_giris_txNoKeyTyped

    }//GEN-LAST:event_txt_giris_txNoKeyTyped

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Giris_Login;
    private javax.swing.JButton btn_Giris_yeniKayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Giris_İcon;
    private javax.swing.JPasswordField txtGiris_PasswordSifre;
    private javax.swing.JTextField txt_giris_txNo;
    // End of variables declaration//GEN-END:variables
}
