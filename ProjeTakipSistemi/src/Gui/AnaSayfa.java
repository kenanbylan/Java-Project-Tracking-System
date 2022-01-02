package Gui;

import Gui.Ayarlar.YonlendirmeSettings;
import VeriTabani.IBosAlanKontrol;
import VeriTabani.Islemler.GirisBilgileri;
import java.awt.Window;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AnaSayfa extends javax.swing.JFrame implements IBosAlanKontrol {
    
    
   
    ImageIcon logoIcon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));
    
    
    public AnaSayfa() {
        
        initComponents();
        //interfaceden alınan bilgileri ekrana anasayfaya yazdırma.
        this.lbl_ad.setText(getGİGirisBilgileri().getAd());
        this.lbl_Soyad.setText(getGİGirisBilgileri().getSoyad());

        TarihveSaat(); //Tarih saatin ekranda gösterilmesini sağlayan method.
        this.setLocationRelativeTo(null); //
        
        setIconImage(logoIcon.getImage());
       
    }

    
    @Override
    public boolean bilgilerGecerlimi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {
        return GirisBilgileri.getInstance();
    }

    private void TarihveSaat() {
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date = new Date();
        Calendar cal = Calendar.getInstance();

        this.lbl_tarih.setText(" " + dateFormat.format(date));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button_kisiBilgileri = new javax.swing.JButton();
        button_ProjeOlustur = new javax.swing.JButton();
        button_projeGoruntule = new javax.swing.JButton();
        button_iletisim = new javax.swing.JButton();
        lbl_baslik = new javax.swing.JLabel();
        lbl_tarih = new javax.swing.JLabel();
        lbl_ad = new javax.swing.JLabel();
        lbl_hosgeldin = new javax.swing.JLabel();
        lbl_Soyad = new javax.swing.JLabel();
        btn_Quit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROJE TAKİP SİSTEMİ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        button_kisiBilgileri.setBackground(new java.awt.Color(255, 255, 255));
        button_kisiBilgileri.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        button_kisiBilgileri.setForeground(new java.awt.Color(51, 153, 255));
        button_kisiBilgileri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_user_folder_40px.png"))); // NOI18N
        button_kisiBilgileri.setText("    KİŞİ BİLGİLERİM");
        button_kisiBilgileri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kisiBilgileriActionPerformed(evt);
            }
        });

        button_ProjeOlustur.setBackground(new java.awt.Color(255, 255, 255));
        button_ProjeOlustur.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        button_ProjeOlustur.setForeground(new java.awt.Color(51, 153, 255));
        button_ProjeOlustur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_web_design_40px.png"))); // NOI18N
        button_ProjeOlustur.setText("    PROJE OLUSTUR");
        button_ProjeOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ProjeOlusturActionPerformed(evt);
            }
        });

        button_projeGoruntule.setBackground(new java.awt.Color(255, 255, 255));
        button_projeGoruntule.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        button_projeGoruntule.setForeground(new java.awt.Color(51, 153, 255));
        button_projeGoruntule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_view_40px.png"))); // NOI18N
        button_projeGoruntule.setText("PROJE GORUNTULE");
        button_projeGoruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_projeGoruntuleActionPerformed(evt);
            }
        });

        button_iletisim.setBackground(new java.awt.Color(255, 255, 255));
        button_iletisim.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        button_iletisim.setForeground(new java.awt.Color(51, 153, 255));
        button_iletisim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_contact_40px.png"))); // NOI18N
        button_iletisim.setText("  İLETİSİM                  ");
        button_iletisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_iletisimActionPerformed(evt);
            }
        });

        lbl_baslik.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        lbl_baslik.setForeground(new java.awt.Color(0, 153, 255));
        lbl_baslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_baslik.setText("P R O J E    T A K I P    S I S T E M I  ");

        lbl_tarih.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lbl_tarih.setForeground(new java.awt.Color(51, 153, 255));
        lbl_tarih.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tarih.setText("TARIH/SAAT");

        lbl_ad.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lbl_ad.setForeground(new java.awt.Color(51, 153, 255));
        lbl_ad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_hosgeldin.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lbl_hosgeldin.setForeground(new java.awt.Color(51, 153, 255));
        lbl_hosgeldin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_hosgeldin.setText("HOSGELDIN ,");

        lbl_Soyad.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lbl_Soyad.setForeground(new java.awt.Color(51, 153, 255));
        lbl_Soyad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_Quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_close_window_24px_6.png"))); // NOI18N
        btn_Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbl_hosgeldin, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbl_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_baslik, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(button_ProjeOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_projeGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_iletisim, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_kisiBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tarih, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_baslik, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbl_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hosgeldin))
                .addGap(53, 53, 53)
                .addComponent(button_kisiBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_ProjeOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_projeGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_iletisim, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_kisiBilgileriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kisiBilgileriActionPerformed
        YonlendirmeSettings.setVisible(this, new KisiBilgilerim());

    }//GEN-LAST:event_button_kisiBilgileriActionPerformed

    private void button_ProjeOlusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ProjeOlusturActionPerformed
        YonlendirmeSettings.setVisible(this, new ProjeOlustur());

    }//GEN-LAST:event_button_ProjeOlusturActionPerformed

    private void button_projeGoruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_projeGoruntuleActionPerformed
        YonlendirmeSettings.setVisible(this, new ProjeGoruntule());

    }//GEN-LAST:event_button_projeGoruntuleActionPerformed

    private void button_iletisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_iletisimActionPerformed
        YonlendirmeSettings.setVisible(this, new Iletisim());
    }//GEN-LAST:event_button_iletisimActionPerformed

    private void btn_QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuitActionPerformed

        String soru = "Çıkış Yapiliyor Onayliyor musunuz ? ";

        if (CikisIzni(this, soru) == 1) {
            this.CikisYap(); //eger kullanici eveti şeçerse , aynı clastaki cikis yap methodu ardından GirisBilgilerindeki cikis yap methodu calişir..
        }

    }//GEN-LAST:event_btn_QuitActionPerformed

    public static int CikisIzni(JFrame frame, String message) //kullanici Cikis yaparken yapilan işlemler icin olusturulan bir method.
    {
        int ayarlar = JOptionPane.YES_NO_OPTION;
        int secim = JOptionPane.showConfirmDialog(frame, message, "Çıkış", ayarlar);

        if (ayarlar == secim) {
            return 1;
        }
        return 0;
    }

    private void CikisYap() {
        getGİGirisBilgileri().CikisYap();
        YonlendirmeSettings.setVisible(this, new GirisEkrani());
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
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaSayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Quit;
    private javax.swing.JButton button_ProjeOlustur;
    private javax.swing.JButton button_iletisim;
    private javax.swing.JButton button_kisiBilgileri;
    private javax.swing.JButton button_projeGoruntule;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Soyad;
    private javax.swing.JLabel lbl_ad;
    private javax.swing.JLabel lbl_baslik;
    private javax.swing.JLabel lbl_hosgeldin;
    private javax.swing.JLabel lbl_tarih;
    // End of variables declaration//GEN-END:variables
}
