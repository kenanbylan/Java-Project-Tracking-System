package Gui;

import Gui.Ayarlar.ButonAyarlari;
import Gui.Ayarlar.YonlendirmeSettings;
import VeriTabani.IBosAlanKontrol;
import VeriTabani.Islemler.GirisBilgileri;
import VeriTabani.Islemler.KullaniciIslemleri;
import java.awt.Color;
import javax.swing.JOptionPane;
import VeriTabani.Baglanti;
import VeriTabani.Islemler.projeOlusturIslemler;
import javax.swing.ImageIcon;

public class ProjeOlustur extends javax.swing.JFrame implements IBosAlanKontrol {

    //icon ;
    ImageIcon logoIcon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

    //objeler ;
    projeOlusturIslemler projeOlusturObje = new projeOlusturIslemler();

    public ProjeOlustur() {

        setIconImage(logoIcon.getImage());
        initComponents();
        setLocationRelativeTo(null); //ekranın ortasında cıkartır.

        this.txt_projeOlusturan_tc.setText(String.valueOf(getGİGirisBilgileri().getTc()));

    }

    //arayuzden alınan methodlar..
    @Override
    public boolean bilgilerGecerlimi() {

        return !(this.txt_projeOlusturan_tc.getText().equals("")
                || this.txt_projeOlusturma_projeAdi.getText().equals("")
                || this.txt_projeOlusturma_baslangicTarihi.getText().equals("")
                || this.txt_projeOlusturma_bitisTarihi.getText().equals("")
                || this.textArea_projeİcerik.getText().equals(""));
    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {

        return GirisBilgileri.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_projeOlusturan_tc = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea_projeİcerik = new javax.swing.JTextArea();
        txt_projeOlusturma_projeAdi = new javax.swing.JTextField();
        txt_projeOlusturma_baslangicTarihi = new javax.swing.JTextField();
        txt_projeOlusturma_bitisTarihi = new javax.swing.JTextField();
        btn_IcerikTemizle = new javax.swing.JButton();
        btn_projeOlustur = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_projeOlustur_GeriDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "PROJE OLUSTUR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N

        txt_projeOlusturan_tc.setEditable(false);
        txt_projeOlusturan_tc.setBackground(new java.awt.Color(255, 255, 255));
        txt_projeOlusturan_tc.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        txt_projeOlusturan_tc.setForeground(new java.awt.Color(51, 153, 255));
        txt_projeOlusturan_tc.setToolTipText("");
        txt_projeOlusturan_tc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "OLUSTURAN TC  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(0, 153, 255))); // NOI18N

        textArea_projeİcerik.setColumns(20);
        textArea_projeİcerik.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        textArea_projeİcerik.setForeground(new java.awt.Color(0, 153, 255));
        textArea_projeİcerik.setRows(5);
        textArea_projeİcerik.setToolTipText("");
        textArea_projeİcerik.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "PROJE HAKKINDA DETAYLI BILGI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N
        textArea_projeİcerik.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textArea_projeİcerik.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(textArea_projeİcerik);
        textArea_projeİcerik.getAccessibleContext().setAccessibleName("");

        txt_projeOlusturma_projeAdi.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        txt_projeOlusturma_projeAdi.setForeground(new java.awt.Color(51, 153, 255));
        txt_projeOlusturma_projeAdi.setToolTipText("");
        txt_projeOlusturma_projeAdi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "PROJE ADI ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_projeOlusturma_baslangicTarihi.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        txt_projeOlusturma_baslangicTarihi.setForeground(new java.awt.Color(51, 153, 255));
        txt_projeOlusturma_baslangicTarihi.setToolTipText("");
        txt_projeOlusturma_baslangicTarihi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "BASLANGIC TARIHI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_projeOlusturma_bitisTarihi.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        txt_projeOlusturma_bitisTarihi.setForeground(new java.awt.Color(51, 153, 255));
        txt_projeOlusturma_bitisTarihi.setToolTipText("");
        txt_projeOlusturma_bitisTarihi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "BITIS TARIHI ( Tahmini )", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        btn_IcerikTemizle.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btn_IcerikTemizle.setForeground(new java.awt.Color(51, 153, 255));
        btn_IcerikTemizle.setText("ICERIK TEMIZLE");
        btn_IcerikTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IcerikTemizleActionPerformed(evt);
            }
        });

        btn_projeOlustur.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btn_projeOlustur.setForeground(new java.awt.Color(51, 153, 255));
        btn_projeOlustur.setText("PROJE OLUSTUR");
        btn_projeOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_projeOlusturActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("NOT : PROJE TAKIP SISTEMINDE ONCE PROJE OLUSTURULUR , PROJE SISTEMI ONAYLANDIKTAN SONRA EKIP ARKADASLARINI EKLEYEBILIRSINIZ...");

        btn_projeOlustur_GeriDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_left_30px.png"))); // NOI18N
        btn_projeOlustur_GeriDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_projeOlustur_GeriDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_projeOlustur_GeriDonMouseExited(evt);
            }
        });
        btn_projeOlustur_GeriDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_projeOlustur_GeriDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_projeOlustur_GeriDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_projeOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_IcerikTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_projeOlusturma_bitisTarihi)
                                .addComponent(txt_projeOlusturma_baslangicTarihi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_projeOlusturma_projeAdi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_projeOlusturan_tc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txt_projeOlusturan_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_projeOlusturma_projeAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_projeOlusturma_baslangicTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_projeOlusturma_bitisTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_projeOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_IcerikTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_projeOlustur_GeriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

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

    private void btn_IcerikTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IcerikTemizleActionPerformed

        txt_projeOlusturma_baslangicTarihi.setText("");
        txt_projeOlusturma_bitisTarihi.setText("");
        txt_projeOlusturma_projeAdi.setText("");
        textArea_projeİcerik.setText("");

    }//GEN-LAST:event_btn_IcerikTemizleActionPerformed

    private void btn_projeOlusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_projeOlusturActionPerformed

        if (bilgilerGecerlimi()) {
            this.projeBilgiAl();
        } else {
            JOptionPane.showMessageDialog(this, "Tum alanlar Dolu olmalidir.");
        }

    }//GEN-LAST:event_btn_projeOlusturActionPerformed

    public void projeBilgiAl() {

        projeOlusturObje.setOlusturanTc(this.txt_projeOlusturan_tc.getText().trim());
        projeOlusturObje.setProje_ad(this.txt_projeOlusturma_projeAdi.getText().trim());
        projeOlusturObje.setProje_baslangic(this.txt_projeOlusturma_baslangicTarihi.getText().trim());
        projeOlusturObje.setProje_bitis(this.txt_projeOlusturma_bitisTarihi.getText().trim());
        projeOlusturObje.setProje_icerik(this.textArea_projeİcerik.getText().trim());

        if (projeOlusturObje.ProjeKayit()) {
            JOptionPane.showMessageDialog(this, "Proje Olusturuldu..");
            YonlendirmeSettings.setVisible(this, new EkipArkadaslariKayit());
        } else {

            JOptionPane.showMessageDialog(this, "Proje Olusturulamadi.Tekrar Deneyiniz.");
        }
    }


    private void btn_projeOlustur_GeriDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_projeOlustur_GeriDonMouseEntered
        ButonAyarlari.setBg(btn_projeOlustur_GeriDon, Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_projeOlustur_GeriDonMouseEntered

    private void btn_projeOlustur_GeriDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_projeOlustur_GeriDonMouseExited
        ButonAyarlari.setOrijinalBg(btn_projeOlustur_GeriDon);
    }//GEN-LAST:event_btn_projeOlustur_GeriDonMouseExited

    private void btn_projeOlustur_GeriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_projeOlustur_GeriDonActionPerformed

        this.dispose();
        new AnaSayfa().setVisible(true);

    }//GEN-LAST:event_btn_projeOlustur_GeriDonActionPerformed

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
            java.util.logging.Logger.getLogger(ProjeOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjeOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjeOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjeOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjeOlustur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_IcerikTemizle;
    private javax.swing.JButton btn_projeOlustur;
    private javax.swing.JButton btn_projeOlustur_GeriDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textArea_projeİcerik;
    private javax.swing.JTextField txt_projeOlusturan_tc;
    private javax.swing.JTextField txt_projeOlusturma_baslangicTarihi;
    private javax.swing.JTextField txt_projeOlusturma_bitisTarihi;
    private javax.swing.JTextField txt_projeOlusturma_projeAdi;
    // End of variables declaration//GEN-END:variables
}
