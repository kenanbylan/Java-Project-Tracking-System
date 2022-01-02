
package Gui;

import Gui.Ayarlar.ButonAyarlari;
import VeriTabani.IBosAlanKontrol;
import VeriTabani.Islemler.GirisBilgileri;
import VeriTabani.Islemler.ProjeGoruntuleIslemler;
import VeriTabani.Islemler.ProjectModal2;
import VeriTabani.Islemler.ProjectModel;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProjeGoruntule extends javax.swing.JFrame implements IBosAlanKontrol {

    
    //icon;
    ImageIcon logoIcon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));
     
    
    ProjeGoruntuleIslemler projeGobje = new ProjeGoruntuleIslemler();
    ArrayList<ProjectModel> satirlar;
    ArrayList<ProjectModal2> satirlar2;
    
    //table ;
    DefaultTableModel model,model2;
    
    public ProjeGoruntule() {
        
        initComponents();
        setLocationRelativeTo(null);
       
        satirlar = projeGobje.Tablo1VeriAl();
        Tablo1Atama();
        satirlar2=projeGobje.Tablo2VeriAl();
        Tablo2Atama();
        
        
        //icon eklendi; 
         setIconImage(logoIcon.getImage());
    }
    
    public void  Tablo1Atama()
    {
        model = (DefaultTableModel) proje_sahibi_tablo.getModel();
        
        // dont touch
        for (int i = 0; i < satirlar.size(); i++) {
          model.insertRow(model.getRowCount(), 
              new Object[]{satirlar.get(i).getProje_ad(), 
              satirlar.get(i).getBaslangic(), 
              satirlar.get(i).getBitis(), 
              satirlar.get(i).getIcerik()});
        }
    }
    
    public void Tablo2Atama()
    {
        model2 = (DefaultTableModel) ekip_tablosu.getModel();
        
        for (int i = 0; i < satirlar2.size(); i++) {
            model2.insertRow(model2.getRowCount(),
                 new Object[]{satirlar2.get(i).getProje_ad(),
                satirlar2.get(i).getAdSoyad(),
                satirlar2.get(i).getGorev()});
            
        }
       
    }
    
    @Override
    public boolean bilgilerGecerlimi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {
        return GirisBilgileri.getInstance();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ekip_tablosu = new javax.swing.JTable();
        btn_geriDon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        proje_sahibi_tablo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "PROJELER  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        ekip_tablosu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        ekip_tablosu.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ekip_tablosu.setForeground(new java.awt.Color(51, 153, 255));
        ekip_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROJE AD ", "AD-SOYAD", "GOREV"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ekip_tablosu);

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

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOT ;  PROJELER SISTEMLERI  VE EKIP ARKADASLARI.");

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        jScrollPane3.setForeground(new java.awt.Color(51, 153, 255));

        proje_sahibi_tablo.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        proje_sahibi_tablo.setForeground(new java.awt.Color(51, 153, 255));
        proje_sahibi_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROJE AD ", "BASLANGIC", "BITIS ( Tahmini )", "ICERIK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(proje_sahibi_tablo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_geriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_geriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void btn_geriDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_geriDonMouseEntered
        ButonAyarlari.setBg(btn_geriDon, Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_geriDonMouseEntered

    private void btn_geriDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_geriDonMouseExited
        ButonAyarlari.setOrijinalBg(btn_geriDon);
    }//GEN-LAST:event_btn_geriDonMouseExited

    private void btn_geriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriDonActionPerformed
        this.dispose();
        new AnaSayfa().setVisible(true);
    }//GEN-LAST:event_btn_geriDonActionPerformed

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
            java.util.logging.Logger.getLogger(ProjeGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjeGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjeGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjeGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjeGoruntule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geriDon;
    private javax.swing.JTable ekip_tablosu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable proje_sahibi_tablo;
    // End of variables declaration//GEN-END:variables
}
