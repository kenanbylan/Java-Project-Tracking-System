package VeriTabani.Islemler;

import Gui.ProjeGoruntule;
import VeriTabani.IBosAlanKontrol;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjeGoruntuleIslemler extends VeriTabani.Baglanti implements IBosAlanKontrol {

    //projeKullanicilar; 
    private String proje_ad, baslangic, bitis, icerik;
    //proje EKibi ; 
    private String olusturanTcno, projeAdEkip, adSoyad, Gorev;

    //arrayListler ;
    private ArrayList<ProjectModel> satirlar = new ArrayList<>();
    private ArrayList<ProjectModal2> satirlar2 = new ArrayList<>();

    public ArrayList<ProjectModel> Tablo1VeriAl() {

        String sorgu = "SELECT * FROM  kullanici_projeler WHERE "
                + "olusturan_tc ='" + getGİGirisBilgileri().getTc() + "'";

        try {

            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                proje_ad = rs.getNString("proje_ad");
                baslangic = rs.getNString("baslangic");
                bitis = rs.getNString("bitis");
                icerik = rs.getNString("icerik");

                satirlar.add(new ProjectModel(proje_ad, baslangic, bitis, icerik));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProjeGoruntuleIslemler.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Select islemi basarisiz.(kullanıcıProjeler)");
        }

        return satirlar;
    }

    public ArrayList<ProjectModal2> Tablo2VeriAl() {
        try {

            String sorgu = "SELECT * FROM  projeekibi WHERE "
                    + "olusturan_tc ='" + getGİGirisBilgileri().getTc() + "'";

            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {

                projeAdEkip = rs.getNString("projeAd");
                adSoyad = rs.getNString("adSoyad");
                Gorev = rs.getNString("gorev");

                satirlar2.add((new ProjectModal2(projeAdEkip, adSoyad, Gorev)));
            }

        } catch (SQLException ex) {

            Logger.getLogger(ProjeGoruntuleIslemler.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Select islemi basarisiz.(proje ekibi)");
        }

        return satirlar2;

    }

    // imlemetn methodlar 
    @Override
    public boolean bilgilerGecerlimi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {

        return GirisBilgileri.getInstance();
    }

    //get and setter methodlari ;
    public String getOlusturanTcno() {
        return olusturanTcno;
    }

    public void setOlusturanTcno(String olusturanTcno) {
        this.olusturanTcno = olusturanTcno;
    }

    public String getProjeAdEkip() {
        return projeAdEkip;
    }

    public void setProjeAdEkip(String projeAdEkip) {
        this.projeAdEkip = projeAdEkip;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getGorev() {
        return Gorev;
    }

    public void setGorev(String Gorev) {
        this.Gorev = Gorev;
    }

    public String getProje_ad() {
        return proje_ad;
    }

    public void setProje_ad(String proje_ad) {
        this.proje_ad = proje_ad;
    }

    public String getBaslangic() {
        return baslangic;
    }

    public void setBaslangic(String baslangic) {
        this.baslangic = baslangic;
    }

    public String getBitis() {
        return bitis;
    }

    public void setBitis(String bitis) {
        this.bitis = bitis;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

}
