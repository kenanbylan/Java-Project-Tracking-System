package Gui;

import Gui.Ayarlar.ButonAyarlari;
import Gui.Ayarlar.YonlendirmeSettings;
import VeriTabani.IBosAlanKontrol;
import VeriTabani.Islemler.BilgileriGuncelleme;
import VeriTabani.Islemler.GirisBilgileri;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class KisiBilgilerim extends javax.swing.JFrame implements IBosAlanKontrol {

    //icon ;
    ImageIcon logoIcon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

    private BilgileriGuncelleme bilgiGuncelleObje = null;
    private String eskiAd = null, eskiSoyad = null, eskiSifre = null, eskiYas = null, eskiMeslek = null;

    public KisiBilgilerim() {

        setIconImage(logoIcon.getImage());

        initComponents();
        Concstructerİcerisine_gidecekler();

    }

    public void Concstructerİcerisine_gidecekler() {
        Bilgilerim();
        BilgileriDuzenle();
        setLocationRelativeTo(null);
        GuncellemeDegistirme();

    }

    public void GuncellemeDegistirme() {
        this.eskiAd = txt_ad.getText();
        this.eskiSoyad = txt_soyad.getText();
        this.eskiSifre = txt_sifre1.getText();
        this.eskiYas = txt_yas.getText();
        this.eskiMeslek = txt_meslek.getText();
    }

    @Override
    public boolean bilgilerGecerlimi() {

        return !(this.txt_ad.getText().equals(""));

    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {
        return GirisBilgileri.getInstance();
    }

    //bilgileri Guncelleme objesinin getter methodu.
    public BilgileriGuncelleme getBilgiGuncelleObje() {
        if (this.bilgiGuncelleObje == null) {
            bilgiGuncelleObje = new BilgileriGuncelleme();
        }
        return bilgiGuncelleObje;
    }

    private void Bilgilerim() //interface'den alınan bilgiler ekranda gösterildi..
    {
        this.lbl_bilgiler_ad.setText(String.valueOf(GirisBilgileri.getInstance().getAd()));
        this.lbl_bilgiler_soyadd.setText(String.valueOf(GirisBilgileri.getInstance().getSoyad()));
        this.lbl_bilgiler_tc.setText(String.valueOf(GirisBilgileri.getInstance().getTc()));
        this.lbl_bilgiler_yas.setText(String.valueOf(GirisBilgileri.getInstance().getYas()));
        this.lbl_bilgiler_meslek.setText(String.valueOf(GirisBilgileri.getInstance().getMeslek()));
        this.lbl_bilgiler_sifre.setText(String.valueOf(GirisBilgileri.getInstance().getSifre()));
    }

    public void BilgileriDuzenle() {
        this.txt_tc.setText(String.valueOf(GirisBilgileri.getInstance().getTc()));
        this.txt_ad.setText(String.valueOf(GirisBilgileri.getInstance().getAd()));
        this.txt_soyad.setText(String.valueOf(GirisBilgileri.getInstance().getSoyad()));
        this.txt_sifre1.setText(String.valueOf(GirisBilgileri.getInstance().getSifre()));
        this.txt_yas.setText(String.valueOf(GirisBilgileri.getInstance().getYas()));
        this.txt_meslek.setText(String.valueOf(GirisBilgileri.getInstance().getMeslek()));
    }

    public void BilgileriGuncelleme() {
        if (this.bilgilerGecerlimi()) {
            String yeniAd = this.txt_ad.getText().trim();
            String yeniSoyad = this.txt_soyad.getText().trim();
            String yeniSifre = this.txt_sifre1.getText().trim();
            String yeniYas = this.txt_yas.getText().trim();
            String yeniMeslek = this.txt_meslek.getText().trim();

            getBilgiGuncelleObje().setAd(yeniAd);
            getBilgiGuncelleObje().setSoyad(yeniSoyad);
            getBilgiGuncelleObje().setSifre(yeniSifre);
            getBilgiGuncelleObje().setYas(yeniYas);
            getBilgiGuncelleObje().setMeslek(yeniMeslek);

            if (getBilgiGuncelleObje().BilgiYenilendiMi()) {
                JOptionPane.showMessageDialog(this, "Bilgiler Guncellenmiştir.");
            } else {
                JOptionPane.showMessageDialog(this, "Bilgileri Kontrol edin.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Bos Olamaz.");
        }

    }

    public String getEskiSoyad() {
        return eskiSoyad;
    }

    public void setEskiSoyad(String eskiSoyad) {
        this.eskiSoyad = eskiSoyad;
    }

    //get and set methodlari..
    public String getEskiAd() {
        return eskiAd;
    }

    public void setEskiAd(String eskiAd) {
        this.eskiAd = eskiAd;
    }

    public String getEskiSifre() {
        return eskiSifre;
    }

    public void setEskiSifre(String eskiSifre) {
        this.eskiSifre = eskiSifre;
    }

    public String getEskiYas() {
        return eskiYas;
    }

    public void setEskiYas(String eskiYas) {
        this.eskiYas = eskiYas;
    }

    public String getEskiMeslek() {
        return eskiMeslek;
    }

    public void setEskiMeslek(String eskiMeslek) {
        this.eskiMeslek = eskiMeslek;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_kisiBilgileri_bilgilerim = new javax.swing.JPanel();
        lbl_bilgiler_tc = new javax.swing.JLabel();
        lbl_bilgiler_ad = new javax.swing.JLabel();
        lbl_bilgiler_sifre = new javax.swing.JLabel();
        lbl_bilgiler_yas = new javax.swing.JLabel();
        lbl_bilgiler_meslek = new javax.swing.JLabel();
        lbl_bilgiler_soyadd = new javax.swing.JLabel();
        btn_geriDon = new javax.swing.JButton();
        panel_kisiBilgileri_bilgileriDuzenle = new javax.swing.JPanel();
        txt_ad = new javax.swing.JTextField();
        txt_soyad = new javax.swing.JTextField();
        txt_yas = new javax.swing.JTextField();
        txt_meslek = new javax.swing.JTextField();
        txt_sifre1 = new javax.swing.JTextField();
        button_kaydet = new javax.swing.JButton();
        txt_tc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel_kisiBilgileri_bilgilerim.setBackground(new java.awt.Color(255, 255, 255));
        panel_kisiBilgileri_bilgilerim.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "BILGILERIM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N

        lbl_bilgiler_tc.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbl_bilgiler_tc.setForeground(new java.awt.Color(0, 153, 255));
        lbl_bilgiler_tc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bilgiler_tc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "TC NO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(51, 153, 255))); // NOI18N

        lbl_bilgiler_ad.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbl_bilgiler_ad.setForeground(new java.awt.Color(51, 153, 255));
        lbl_bilgiler_ad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bilgiler_ad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "AD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(51, 153, 255))); // NOI18N

        lbl_bilgiler_sifre.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbl_bilgiler_sifre.setForeground(new java.awt.Color(51, 153, 255));
        lbl_bilgiler_sifre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bilgiler_sifre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "SIFRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(51, 153, 255))); // NOI18N

        lbl_bilgiler_yas.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbl_bilgiler_yas.setForeground(new java.awt.Color(51, 153, 255));
        lbl_bilgiler_yas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bilgiler_yas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "YAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(51, 153, 255))); // NOI18N

        lbl_bilgiler_meslek.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbl_bilgiler_meslek.setForeground(new java.awt.Color(51, 153, 255));
        lbl_bilgiler_meslek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bilgiler_meslek.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "MESLEK", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(51, 153, 255))); // NOI18N

        lbl_bilgiler_soyadd.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbl_bilgiler_soyadd.setForeground(new java.awt.Color(51, 153, 255));
        lbl_bilgiler_soyadd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bilgiler_soyadd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "SOYAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(51, 153, 255))); // NOI18N

        btn_geriDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_left_30px.png"))); // NOI18N
        btn_geriDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_geriDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_geriDonMouseExited(evt);
            }
        });
        btn_geriDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_kisiBilgileri_bilgilerimLayout = new javax.swing.GroupLayout(panel_kisiBilgileri_bilgilerim);
        panel_kisiBilgileri_bilgilerim.setLayout(panel_kisiBilgileri_bilgilerimLayout);
        panel_kisiBilgileri_bilgilerimLayout.setHorizontalGroup(
            panel_kisiBilgileri_bilgilerimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kisiBilgileri_bilgilerimLayout.createSequentialGroup()
                .addGroup(panel_kisiBilgileri_bilgilerimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_kisiBilgileri_bilgilerimLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panel_kisiBilgileri_bilgilerimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_bilgiler_tc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_bilgiler_ad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_bilgiler_soyadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_bilgiler_sifre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_bilgiler_yas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_bilgiler_meslek, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_kisiBilgileri_bilgilerimLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_geriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panel_kisiBilgileri_bilgilerimLayout.setVerticalGroup(
            panel_kisiBilgileri_bilgilerimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kisiBilgileri_bilgilerimLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_bilgiler_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_bilgiler_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_bilgiler_soyadd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lbl_bilgiler_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_bilgiler_yas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_bilgiler_meslek, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_geriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panel_kisiBilgileri_bilgileriDuzenle.setBackground(new java.awt.Color(255, 255, 255));
        panel_kisiBilgileri_bilgileriDuzenle.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "BILGILERI DUZENLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N

        txt_ad.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txt_ad.setForeground(new java.awt.Color(51, 153, 255));
        txt_ad.setToolTipText("");
        txt_ad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "AD ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N
        txt_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adActionPerformed(evt);
            }
        });

        txt_soyad.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txt_soyad.setForeground(new java.awt.Color(51, 153, 255));
        txt_soyad.setToolTipText("");
        txt_soyad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "SOYAD ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_yas.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txt_yas.setForeground(new java.awt.Color(51, 153, 255));
        txt_yas.setToolTipText("");
        txt_yas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "YAS ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_meslek.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txt_meslek.setForeground(new java.awt.Color(51, 153, 255));
        txt_meslek.setToolTipText("");
        txt_meslek.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "MESLEK", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        txt_sifre1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txt_sifre1.setForeground(new java.awt.Color(51, 153, 255));
        txt_sifre1.setToolTipText("");
        txt_sifre1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "SIFRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        button_kaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8_update_24px.png"))); // NOI18N
        button_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kaydetActionPerformed(evt);
            }
        });

        txt_tc.setEditable(false);
        txt_tc.setBackground(new java.awt.Color(255, 255, 255));
        txt_tc.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txt_tc.setForeground(new java.awt.Color(51, 153, 255));
        txt_tc.setToolTipText("");
        txt_tc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "TC ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        javax.swing.GroupLayout panel_kisiBilgileri_bilgileriDuzenleLayout = new javax.swing.GroupLayout(panel_kisiBilgileri_bilgileriDuzenle);
        panel_kisiBilgileri_bilgileriDuzenle.setLayout(panel_kisiBilgileri_bilgileriDuzenleLayout);
        panel_kisiBilgileri_bilgileriDuzenleLayout.setHorizontalGroup(
            panel_kisiBilgileri_bilgileriDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kisiBilgileri_bilgileriDuzenleLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(button_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_kisiBilgileri_bilgileriDuzenleLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(panel_kisiBilgileri_bilgileriDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_yas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sifre1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_meslek, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        panel_kisiBilgileri_bilgileriDuzenleLayout.setVerticalGroup(
            panel_kisiBilgileri_bilgileriDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kisiBilgileri_bilgileriDuzenleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sifre1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_yas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_meslek, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_kisiBilgileri_bilgilerim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_kisiBilgileri_bilgileriDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_kisiBilgileri_bilgilerim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_kisiBilgileri_bilgileriDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_geriDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_geriDonMouseEntered
        ButonAyarlari.setBg(btn_geriDon, Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_geriDonMouseEntered

    private void btn_geriDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_geriDonMouseExited
        ButonAyarlari.setOrijinalBg(btn_geriDon);
    }//GEN-LAST:event_btn_geriDonMouseExited

    private void btn_geriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriDonActionPerformed

        YonlendirmeSettings.setVisible(this, new AnaSayfa());

    }//GEN-LAST:event_btn_geriDonActionPerformed

    private void button_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kaydetActionPerformed
        //veriTabanı dahil edilceek burada
        this.BilgileriGuncelleme();

    }//GEN-LAST:event_button_kaydetActionPerformed

    private void txt_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_adActionPerformed

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
            java.util.logging.Logger.getLogger(KisiBilgilerim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KisiBilgilerim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KisiBilgilerim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KisiBilgilerim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KisiBilgilerim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geriDon;
    private javax.swing.JButton button_kaydet;
    private javax.swing.JLabel lbl_bilgiler_ad;
    private javax.swing.JLabel lbl_bilgiler_meslek;
    private javax.swing.JLabel lbl_bilgiler_sifre;
    private javax.swing.JLabel lbl_bilgiler_soyadd;
    private javax.swing.JLabel lbl_bilgiler_tc;
    private javax.swing.JLabel lbl_bilgiler_yas;
    private javax.swing.JPanel panel_kisiBilgileri_bilgileriDuzenle;
    private javax.swing.JPanel panel_kisiBilgileri_bilgilerim;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextField txt_meslek;
    private javax.swing.JTextField txt_sifre1;
    private javax.swing.JTextField txt_soyad;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_yas;
    // End of variables declaration//GEN-END:variables
}
