
package Gui;

import Gui.Ayarlar.ButonAyarlari;
import VeriTabani.IBosAlanKontrol;
import VeriTabani.Islemler.GirisBilgileri;
import VeriTabani.Islemler.ekipArkadasiIslemleri;
import VeriTabani.Islemler.projeOlusturIslemler;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class EkipArkadaslariKayit extends javax.swing.JFrame implements IBosAlanKontrol{

    
    //icon;
     ImageIcon logoIcon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));
    
    //nesneler;
    ekipArkadasiIslemleri ekipArkadasiObje = new ekipArkadasiIslemleri();

    public EkipArkadaslariKayit() {
        initComponents();
        setLocationRelativeTo(null);
        
         setIconImage(logoIcon.getImage());
    }
    
    
    @Override
    public boolean bilgilerGecerlimi() {
        
        return !( txt_yeniKullanici_projeAdi.equals("") || 
                  txt_yeniKullanici_adSoyad.equals("") ||
                  txt_yeniKullanici_gorev.equals("") ||
                  txt_yeniKullanici_meslek.equals(""));
        
    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {
        return GirisBilgileri.getInstance();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbl_baslik = new javax.swing.JLabel();
        txt_yeniKullanici_adSoyad = new javax.swing.JTextField();
        txt_yeniKullanici_gorev = new javax.swing.JTextField();
        btn_temizle = new javax.swing.JButton();
        btngeriDon = new javax.swing.JButton();
        txt_yeniKullanici_meslek = new javax.swing.JTextField();
        txt_yeniKullanici_projeAdi = new javax.swing.JTextField();
        ekibe_ekle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_baslik.setFont(new java.awt.Font("Agency FB", 2, 25)); // NOI18N
        lbl_baslik.setForeground(new java.awt.Color(0, 153, 255));
        lbl_baslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_baslik.setText("E K I P   A R K A D A S I   ");

        txt_yeniKullanici_adSoyad.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        txt_yeniKullanici_adSoyad.setForeground(new java.awt.Color(51, 153, 255));
        txt_yeniKullanici_adSoyad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "AD-SOYAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_yeniKullanici_gorev.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        txt_yeniKullanici_gorev.setForeground(new java.awt.Color(51, 153, 255));
        txt_yeniKullanici_gorev.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "GOREV", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        btn_temizle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_broom_30px_1.png"))); // NOI18N
        btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temizleActionPerformed(evt);
            }
        });

        btngeriDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_left_30px.png"))); // NOI18N
        btngeriDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btngeriDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btngeriDonMouseExited(evt);
            }
        });
        btngeriDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeriDonActionPerformed(evt);
            }
        });

        txt_yeniKullanici_meslek.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        txt_yeniKullanici_meslek.setForeground(new java.awt.Color(51, 153, 255));
        txt_yeniKullanici_meslek.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "MESLEK", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_yeniKullanici_projeAdi.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        txt_yeniKullanici_projeAdi.setForeground(new java.awt.Color(51, 153, 255));
        txt_yeniKullanici_projeAdi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "PROJE ADI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        ekibe_ekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_add_user_male_50px_2.png"))); // NOI18N
        ekibe_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekibe_ekleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_baslik, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(ekibe_ekle)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_yeniKullanici_adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_yeniKullanici_gorev, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_yeniKullanici_meslek, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_yeniKullanici_projeAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btngeriDon)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_baslik, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_yeniKullanici_projeAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_yeniKullanici_adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(txt_yeniKullanici_gorev, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_yeniKullanici_meslek, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_temizle, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(ekibe_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btngeriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngeriDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngeriDonMouseEntered
        ButonAyarlari.setBg(btngeriDon, Color.DARK_GRAY);
    }//GEN-LAST:event_btngeriDonMouseEntered

    private void btngeriDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngeriDonMouseExited
        ButonAyarlari.setOrijinalBg(btngeriDon);
    }//GEN-LAST:event_btngeriDonMouseExited

    private void btngeriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeriDonActionPerformed

        this.dispose();
        new ProjeOlustur().setVisible(true);

    }//GEN-LAST:event_btngeriDonActionPerformed

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed

      this.IcerikTemizle();   
      
    }//GEN-LAST:event_btn_temizleActionPerformed

    
    private void  IcerikTemizle()
    {
        txt_yeniKullanici_adSoyad.setText("");
        txt_yeniKullanici_gorev.setText("");
        txt_yeniKullanici_meslek.setText("");
    }
    
    
    private void ekibe_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekibe_ekleActionPerformed
        
        if (bilgilerGecerlimi()) {
            
            this.EkipBilgiAl();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tum alanlar Dolu olmalidir.");
        }
        
    }//GEN-LAST:event_ekibe_ekleActionPerformed

    
      public void EkipBilgiAl() {
        
        ekipArkadasiObje.setProjeAd(this.txt_yeniKullanici_projeAdi.getText().trim());
        ekipArkadasiObje.setAdSoyad(this.txt_yeniKullanici_adSoyad.getText().trim());
        ekipArkadasiObje.setGorev(this.txt_yeniKullanici_gorev.getText().trim());
        ekipArkadasiObje.setMeslek(this.txt_yeniKullanici_meslek.getText().trim());
        
        if (ekipArkadasiObje.EkipKayit()) {
            
            JOptionPane.showMessageDialog(this, "Ekibe Eklendi.");
        } else {

            JOptionPane.showMessageDialog(this, "Ekibe ekleme Islemi Basarisiz.");
        }
    }
      
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
            java.util.logging.Logger.getLogger(EkipArkadaslariKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EkipArkadaslariKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EkipArkadaslariKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EkipArkadaslariKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EkipArkadaslariKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_temizle;
    private javax.swing.JButton btngeriDon;
    private javax.swing.JButton ekibe_ekle;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_baslik;
    private javax.swing.JTextField txt_yeniKullanici_adSoyad;
    private javax.swing.JTextField txt_yeniKullanici_gorev;
    private javax.swing.JTextField txt_yeniKullanici_meslek;
    private javax.swing.JTextField txt_yeniKullanici_projeAdi;
    // End of variables declaration//GEN-END:variables
}
