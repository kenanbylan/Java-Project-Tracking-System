package VeriTabani.Islemler;

import VeriTabani.IBosAlanKontrol;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BilgileriGuncelleme extends VeriTabani.Baglanti implements IBosAlanKontrol {

    private String Ad = null, Soyad = null, Sifre = null, Meslek = null, tcno = null;
    private String Yas = null;

    @Override
    public boolean bilgilerGecerlimi() {

        return !(this.Ad == null);

    }

    @Override
    public GirisBilgileri getGİGirisBilgileri() {

        return GirisBilgileri.getInstance();
    }

    public boolean BilgiYenilendiMi() {
        if (bilgilerGecerlimi()) {

            String sorgu = "UPDATE kullanicilar "
                    + "SET Ad='" + this.Ad + "'"
                    + ",Soyad='" + this.Soyad + "'"
                    + ",Sifre='" + this.Sifre + "'"
                    + ",Yas='" + this.Yas + "'"
                    + ",Meslek='" + this.Meslek + "'"
                    + "WHERE tcno='" + getGİGirisBilgileri().getTc() + "'";

            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(sorgu);

                getGİGirisBilgileri().setAd(this.Ad);
                getGİGirisBilgileri().setSoyad(this.Soyad);

            } catch (SQLException ex) {
                Logger.getLogger(BilgileriGuncelleme.class.getName()).log(Level.SEVERE, null, ex);
            }

            return true;
        } else {
            return false;
        }

    }

    //get and setter methodlari :
    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String Sifre) {
        this.Sifre = Sifre;
    }

    public String getMeslek() {
        return Meslek;
    }

    public void setMeslek(String Meslek) {
        this.Meslek = Meslek;
    }

    public String getYas() {
        return Yas;
    }

    public void setYas(String Yas) {
        this.Yas = Yas;
    }

}
