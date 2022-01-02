package VeriTabani.Islemler;

import VeriTabani.IBosAlanKontrol;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ekipArkadasiIslemleri extends VeriTabani.Baglanti implements IBosAlanKontrol {

    private String projeAd, adSoyad, Gorev, Meslek;
    private String olusturan_tc = String.valueOf(getGİGirisBilgileri().getTc());

    public boolean EkipKayit() {
        try {
            String Sorgu = "INSERT INTO projeekibi (olusturan_tc,projeAd,adSoyad,gorev,meslek)"
                    + " VALUES ("
                    + "'" + this.olusturan_tc + "',"
                    + "'" + this.projeAd + "',"
                    + "'" + this.adSoyad + "',"
                    + "'" + this.Gorev + "',"
                    + "'" + this.Meslek + "'"
                    + ")";

            super.statement = super.connection.createStatement();
            statement.executeUpdate(Sorgu);
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(ekipArkadasiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean bilgilerGecerlimi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {
        return GirisBilgileri.getInstance();
    }

    //get and setter methodlari ;
    public String getOlusturan_tc() {
        return olusturan_tc;
    }

    public void setOlusturan_tc(String olusturan_tc) {
        this.olusturan_tc = olusturan_tc;
    }

    public String getProjeAd() {
        return projeAd;
    }

    public void setProjeAd(String projeAd) {
        this.projeAd = projeAd;
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

    public String getMeslek() {
        return Meslek;
    }

    public void setMeslek(String Meslek) {
        this.Meslek = Meslek;
    }

}
