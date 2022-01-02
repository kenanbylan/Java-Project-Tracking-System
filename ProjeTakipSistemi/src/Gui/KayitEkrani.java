package Gui;

import Gui.Ayarlar.ButonAyarlari;
import Gui.Ayarlar.TextKontrolAyarlari;
import Gui.Ayarlar.YonlendirmeSettings;
import VeriTabani.IBosAlanKontrol;
import Gui.GirisEkrani;
import VeriTabani.Islemler.GirisBilgileri;
import VeriTabani.Islemler.KullaniciIslemleri;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class KayitEkrani extends javax.swing.JFrame implements IBosAlanKontrol {

    //icon ;
    ImageIcon logoIcon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

    //nesneler :
    private KullaniciIslemleri kullaniciObje = null;

    public KayitEkrani() {

        setIconImage(logoIcon.getImage());

        initComponents();
        this.setLocationRelativeTo(null);
    }

    public KullaniciIslemleri getKullaniciObje() {

        if (this.kullaniciObje == null) {
            kullaniciObje = new KullaniciIslemleri();
        }

        return kullaniciObje;
    }

    @Override
    public boolean bilgilerGecerlimi() {

        return TextKontrolAyarlari.textAlanKontrol(newKullaniciPanel);

    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {

        return GirisBilgileri.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newKullaniciPanel = new javax.swing.JPanel();
        txt_yeniKullanici_soyad = new javax.swing.JTextField();
        txt_yeniKullanici_tcno = new javax.swing.JTextField();
        txt_yeniKullanici_ad = new javax.swing.JTextField();
        txt_yeniKullanici_meslek = new javax.swing.JTextField();
        txt_yeniKullanici_yas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_yeniKullanici_kayit_olustur = new javax.swing.JButton();
        btn_GeriDonButonu = new javax.swing.JButton();
        Txt_password_sifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        newKullaniciPanel.setBackground(new java.awt.Color(255, 255, 255));

        txt_yeniKullanici_soyad.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txt_yeniKullanici_soyad.setForeground(new java.awt.Color(51, 153, 255));
        txt_yeniKullanici_soyad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "SOYAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_yeniKullanici_tcno.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txt_yeniKullanici_tcno.setForeground(new java.awt.Color(51, 153, 255));
        txt_yeniKullanici_tcno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "Tc No ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_yeniKullanici_ad.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txt_yeniKullanici_ad.setForeground(new java.awt.Color(51, 153, 255));
        txt_yeniKullanici_ad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "AD ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_yeniKullanici_meslek.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txt_yeniKullanici_meslek.setForeground(new java.awt.Color(51, 153, 255));
        txt_yeniKullanici_meslek.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "MESLEK ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_yeniKullanici_yas.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txt_yeniKullanici_yas.setForeground(new java.awt.Color(51, 153, 255));
        txt_yeniKullanici_yas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "YAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Agency FB", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Y E N I    K U L L A N I C I ");

        btn_yeniKullanici_kayit_olustur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_yeniKullanici_kayit_olustur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_add_user_male_50px_2.png"))); // NOI18N
        btn_yeniKullanici_kayit_olustur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_yeniKullanici_kayit_olusturMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_yeniKullanici_kayit_olusturMouseExited(evt);
            }
        });
        btn_yeniKullanici_kayit_olustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yeniKullanici_kayit_olusturActionPerformed(evt);
            }
        });

        btn_GeriDonButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_left_30px.png"))); // NOI18N
        btn_GeriDonButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GeriDonButonuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GeriDonButonuMouseExited(evt);
            }
        });
        btn_GeriDonButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GeriDonButonuActionPerformed(evt);
            }
        });

        Txt_password_sifre.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        Txt_password_sifre.setForeground(new java.awt.Color(51, 153, 255));
        Txt_password_sifre.setToolTipText("");
        Txt_password_sifre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "SIFRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        javax.swing.GroupLayout newKullaniciPanelLayout = new javax.swing.GroupLayout(newKullaniciPanel);
        newKullaniciPanel.setLayout(newKullaniciPanelLayout);
        newKullaniciPanelLayout.setHorizontalGroup(
            newKullaniciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newKullaniciPanelLayout.createSequentialGroup()
                .addGroup(newKullaniciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newKullaniciPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(newKullaniciPanelLayout.createSequentialGroup()
                        .addGroup(newKullaniciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newKullaniciPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(newKullaniciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(newKullaniciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_yeniKullanici_meslek, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(txt_yeniKullanici_ad)
                                        .addComponent(txt_yeniKullanici_soyad)
                                        .addComponent(txt_yeniKullanici_yas)
                                        .addComponent(Txt_password_sifre))
                                    .addComponent(txt_yeniKullanici_tcno, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(newKullaniciPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_GeriDonButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(newKullaniciPanelLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(btn_yeniKullanici_kayit_olustur)))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        newKullaniciPanelLayout.setVerticalGroup(
            newKullaniciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newKullaniciPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_yeniKullanici_tcno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_yeniKullanici_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_yeniKullanici_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_password_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_yeniKullanici_yas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_yeniKullanici_meslek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_yeniKullanici_kayit_olustur, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_GeriDonButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newKullaniciPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newKullaniciPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_yeniKullanici_kayit_olusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yeniKullanici_kayit_olusturActionPerformed

        if (this.bilgilerGecerlimi()) {
            KayitOlustur();
        } else {
            JOptionPane.showMessageDialog(this, "Tüm alanlar Doldurulmalidir.");
        }

    }//GEN-LAST:event_btn_yeniKullanici_kayit_olusturActionPerformed

    private void KayitOlustur() {
        this.getKullaniciObje().setAd(this.txt_yeniKullanici_ad.getText().trim());
        this.getKullaniciObje().setSoyad(this.txt_yeniKullanici_soyad.getText().trim());
        this.getKullaniciObje().setTcno(this.txt_yeniKullanici_tcno.getText().trim());
        this.getKullaniciObje().setSifre(String.valueOf(this.Txt_password_sifre.getPassword())); //yanlislik cikabilir..
        this.getKullaniciObje().setYas(this.txt_yeniKullanici_yas.getText().trim());
        this.getKullaniciObje().setMeslek(this.txt_yeniKullanici_meslek.getText().trim());

        if (this.getKullaniciObje().KayitOnaylandimi()) {
            JOptionPane.showMessageDialog(this, "Kayit Olusturulmustur.");
            YonlendirmeSettings.setVisible(this, new GirisEkrani());
        } else {
            JOptionPane.showMessageDialog(this, "Lutfen bilgilerinizi kontrol ediniz.");
        }

    }


    private void btn_GeriDonButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GeriDonButonuActionPerformed

        this.dispose();
        new GirisEkrani().setVisible(true);

    }//GEN-LAST:event_btn_GeriDonButonuActionPerformed

    private void btn_yeniKullanici_kayit_olusturMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yeniKullanici_kayit_olusturMouseEntered
        ButonAyarlari.setBg(btn_yeniKullanici_kayit_olustur, Color.DARK_GRAY);
    }//GEN-LAST:event_btn_yeniKullanici_kayit_olusturMouseEntered

    private void btn_yeniKullanici_kayit_olusturMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yeniKullanici_kayit_olusturMouseExited
        ButonAyarlari.setOrijinalBg(btn_yeniKullanici_kayit_olustur);
    }//GEN-LAST:event_btn_yeniKullanici_kayit_olusturMouseExited

    private void btn_GeriDonButonuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GeriDonButonuMouseEntered
        ButonAyarlari.setBg(btn_GeriDonButonu, Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_GeriDonButonuMouseEntered

    private void btn_GeriDonButonuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GeriDonButonuMouseExited
        ButonAyarlari.setOrijinalBg(btn_GeriDonButonu);
    }//GEN-LAST:event_btn_GeriDonButonuMouseExited

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
            java.util.logging.Logger.getLogger(KayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Txt_password_sifre;
    private javax.swing.JButton btn_GeriDonButonu;
    private javax.swing.JButton btn_yeniKullanici_kayit_olustur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel newKullaniciPanel;
    private javax.swing.JTextField txt_yeniKullanici_ad;
    private javax.swing.JTextField txt_yeniKullanici_meslek;
    private javax.swing.JTextField txt_yeniKullanici_soyad;
    private javax.swing.JTextField txt_yeniKullanici_tcno;
    private javax.swing.JTextField txt_yeniKullanici_yas;
    // End of variables declaration//GEN-END:variables
}
